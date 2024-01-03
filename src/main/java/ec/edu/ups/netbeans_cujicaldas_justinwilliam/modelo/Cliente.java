/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.netbeans_cujicaldas_justinwilliam.modelo;

import java.util.List;

/**
 *
 * @author Usuario
 */
public class Cliente extends Persona{
    
    private List<Pedido> pedidosAtendidos;

    public Cliente(int id, String nombre, String direccion) {
        super(id, nombre, direccion);
    }

    public List<Pedido> getPedidosAtendidos() {
        return pedidosAtendidos;
    }

    public void setPedidosAtendidos(List<Pedido> pedidosAtendidos) {
        this.pedidosAtendidos = pedidosAtendidos;
    }

    
    
}
