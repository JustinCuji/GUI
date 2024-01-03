/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.netbeans_cujicaldas_justinwilliam;

import ec.edu.ups.netbeans_cujicaldas_justinwilliam.controlador.ControladorPedido;
import ec.edu.ups.netbeans_cujicaldas_justinwilliam.controlador.ControladorPersona;
import ec.edu.ups.netbeans_cujicaldas_justinwilliam.controlador.ControladorProducto;
import ec.edu.ups.netbeans_cujicaldas_justinwilliam.dao.PedidoDao;
import ec.edu.ups.netbeans_cujicaldas_justinwilliam.dao.PersonaDao;
import ec.edu.ups.netbeans_cujicaldas_justinwilliam.dao.ProductoDao;
import ec.edu.ups.netbeans_cujicaldas_justinwilliam.idao.IPedidoDao;
import ec.edu.ups.netbeans_cujicaldas_justinwilliam.idao.IPersonaDao;
import ec.edu.ups.netbeans_cujicaldas_justinwilliam.idao.IProductoDao;
import ec.edu.ups.netbeans_cujicaldas_justinwilliam.modelo.vista.PedidoVista;
import ec.edu.ups.netbeans_cujicaldas_justinwilliam.modelo.vista.PersonaVista;
import ec.edu.ups.netbeans_cujicaldas_justinwilliam.modelo.vista.ProdcutoVista;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class NetBeans_CujiCaldas_JustinWilliam {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear instancias de las vistas, controladores y DAOs
        ProdcutoVista productoVista = new ProdcutoVista();
        IProductoDao productoDAO = new ProductoDao();  // Asume que has implementado ProductoDAO
        ControladorProducto productoControlador = new ControladorProducto(productoVista, productoDAO);

        PedidoVista pedidoVista = new PedidoVista();
        IPedidoDao pedidoDAO = new PedidoDao();  // Asume que has implementado PedidoDAO
        ControladorPedido pedidoControlador = new ControladorPedido(pedidoVista, pedidoDAO);

        PersonaVista personaVista = new PersonaVista();
        IPersonaDao personaDAO = new PersonaDao();  // Asume que has implementado PersonaDAO
        ControladorPersona personaControlador = new ControladorPersona(personaVista, personaDAO);

        int opcion;

        do {
            System.out.println("=== Menú Principal ===");
            System.out.println("1. Gestionar Productos");
            System.out.println("2. Gestionar Pedidos");
            System.out.println("3. Gestionar Personas");
            System.out.println("0. Salir");
            System.out.print("Ingrese su opción: ");
            
            try {
                opcion = Integer.parseInt(scanner.nextLine());

                switch (opcion) {
                    case 1:
                        gestionarProductos(productoControlador);
                        break;
                    case 2:
                        gestionarPedidos(pedidoControlador);
                        break;
                    case 3:
                        gestionarPersonas(personaControlador);
                        break;
                    case 0:
                        System.out.println("Saliendo del sistema. ¡Hasta luego!");
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número válido.");
                opcion = -1; 
            }
        } while (opcion != 0);

        scanner.close();
    }

    private static void gestionarProductos(ControladorProducto productoControlador) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void gestionarPedidos(ControladorPedido pedidoControlador) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void gestionarPersonas(ControladorPersona personaControlador) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
