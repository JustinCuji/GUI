/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.netbeans_cujicaldas_justinwilliam.idao;

import ec.edu.ups.netbeans_cujicaldas_justinwilliam.modelo.Pedido;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface IPedidoDao {
    public void agregarPedido(Pedido pedido);
    public Pedido buscarPedido(int id);
    public List<Pedido> listarPedido();
}
