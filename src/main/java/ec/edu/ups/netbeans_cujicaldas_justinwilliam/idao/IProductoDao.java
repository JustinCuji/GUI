/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.netbeans_cujicaldas_justinwilliam.idao;

import ec.edu.ups.netbeans_cujicaldas_justinwilliam.modelo.Producto;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface IProductoDao {
    public void agregarProductos(Producto producto);
    public Producto buscarProducto(int id);
    public List<Producto> listarProductos();
    
}
