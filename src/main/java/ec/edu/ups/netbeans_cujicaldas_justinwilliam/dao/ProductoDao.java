/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.netbeans_cujicaldas_justinwilliam.dao;

import ec.edu.ups.netbeans_cujicaldas_justinwilliam.idao.IProductoDao;
import ec.edu.ups.netbeans_cujicaldas_justinwilliam.modelo.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ProductoDao implements IProductoDao{

    private List<Producto> listaPrdocutos;

    public ProductoDao() {
        listaPrdocutos = new ArrayList<>();
    }
    
    @Override
    public void agregarProductos(Producto producto) {
        listaPrdocutos.add(producto);
    }

    @Override
    public Producto buscarProducto(int id) {
        for (Producto listaPrdocuto : listaPrdocutos) {
            if(listaPrdocuto.getIdPro()==id){
                return listaPrdocuto;
            }
        }
        return null;
    }

    @Override
    public List<Producto> listarProductos() {
        return listaPrdocutos;
    }
    
}
