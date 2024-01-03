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
public class Empleado extends Persona{
    
   private List<Pedido> pedidos;

    public Empleado(int id, String nombre, String direccion) {
        super(id, nombre, direccion);
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    
   
}
