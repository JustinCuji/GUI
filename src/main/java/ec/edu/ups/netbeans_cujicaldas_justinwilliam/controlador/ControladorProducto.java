/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.netbeans_cujicaldas_justinwilliam.controlador;

import ec.edu.ups.netbeans_cujicaldas_justinwilliam.idao.IProductoDao;
import ec.edu.ups.netbeans_cujicaldas_justinwilliam.modelo.Producto;
import ec.edu.ups.netbeans_cujicaldas_justinwilliam.modelo.vista.ProdcutoVista;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ControladorProducto {
    private IProductoDao productoDAO;
    private ProdcutoVista productoVista;

    public ControladorProducto(ProdcutoVista productoVista, IProductoDao productoDAO) {
        this.productoDAO = productoDAO;
        this.productoVista = productoVista;
    }

    public void mostrarListaProductos() {
        List<Producto> productos = productoDAO.listarProductos();
        productoVista.mostrarListaProductos(productos);
    }

    public void mostrarDetallesProducto(int idProducto) {
        Producto producto = productoDAO.buscarProducto(idProducto);
        productoVista.mostrarDetallesProducto(producto);
    }

    public void crearProducto() {
        Producto nuevoProducto = productoVista.solicitarDatosCreacionProducto();
        productoDAO.agregarProductos(nuevoProducto);
    }
}
