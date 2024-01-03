/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.netbeans_cujicaldas_justinwilliam.dao;

import ec.edu.ups.netbeans_cujicaldas_justinwilliam.idao.IPedidoDao;
import ec.edu.ups.netbeans_cujicaldas_justinwilliam.modelo.Pedido;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class PedidoDao implements IPedidoDao{

    private List<Pedido> listaPedidos;

    public PedidoDao() {
        listaPedidos = new ArrayList<>();
    }

    @Override
    public void agregarPedido(Pedido pedido) {
        listaPedidos.add(pedido);
    }

    @Override
    public Pedido buscarPedido(int id) {
        for (Pedido listaPedido : listaPedidos) {
            if(listaPedido.getIdPedido()==id){
                return listaPedido;
            }
        }
        return null;
    }

    @Override
    public List<Pedido> listarPedido() {
        return listaPedidos;
    }
   
    
    
}
