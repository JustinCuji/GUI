/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.netbeans_cujicaldas_justinwilliam.controlador;

import ec.edu.ups.netbeans_cujicaldas_justinwilliam.idao.IPedidoDao;
import ec.edu.ups.netbeans_cujicaldas_justinwilliam.modelo.Pedido;
import ec.edu.ups.netbeans_cujicaldas_justinwilliam.modelo.vista.PedidoVista;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ControladorPedido {
    private PedidoVista pedidoVista;
    private IPedidoDao pedidoDAO;

    public ControladorPedido(PedidoVista pedidoVista, IPedidoDao pedidoDAO) {
        this.pedidoVista = pedidoVista;
        this.pedidoDAO = pedidoDAO;
    }

    public void mostrarListaPedidos() {
        List<Pedido> pedidos = pedidoDAO.listarPedido();
        pedidoVista.mostrarListaPedidos(pedidos);
    }

    public void mostrarDetallesPedido(int idPedido) {
        Pedido pedido = pedidoDAO.buscarPedido(idPedido);
        pedidoVista.mostrarDetallesPedido(pedido);
    }

    public void crearPedido() {
        Pedido nuevoPedido = pedidoVista.solicitarDatosCreacionPedido();
        
        //nuevoPedido.setIdPedido(id);
        pedidoDAO.agregarPedido(nuevoPedido);
    }
}
