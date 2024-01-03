/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.netbeans_cujicaldas_justinwilliam.modelo.vista;

import ec.edu.ups.netbeans_cujicaldas_justinwilliam.modelo.Producto;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ProdcutoVista {
    private Scanner scanner;

    public ProdcutoVista() {
        this.scanner = new Scanner(System.in);
    }

    public void mostrarListaProductos(List<Producto> productos) {
        System.out.println("=== Lista de Productos ===");
        for (Producto producto : productos) {
            System.out.println("ID: " + producto.getIdPro() + ", Nombre: " + producto.getNombre() +
                    ", Precio: " + producto.getPrecio());
        }
        System.out.println("=========================");
    }

    public void mostrarDetallesProducto(Producto producto) {
        System.out.println("=== Detalles del Producto ===");
        System.out.println("ID: " + producto.getIdPro());
        System.out.println("Nombre: " + producto.getNombre());
        System.out.println("Precio: " + producto.getPrecio());
        // Mostrar otros detalles específicos de Producto
        System.out.println("=============================");
    }

    public Producto solicitarDatosCreacionProducto() {
        System.out.println("=== Crear Nuevo Producto ===");

        System.out.println("Ingrese el id: ");
        int id = scanner.nextInt();
        
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el precio del producto: ");
        double precio = Double.parseDouble(scanner.nextLine());

        return new Producto(id, nombre, precio);
    }
}
