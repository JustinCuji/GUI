/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.netbeans_cujicaldas_justinwilliam.modelo.vista;

import ec.edu.ups.netbeans_cujicaldas_justinwilliam.modelo.Pedido;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PedidoVista {
    private Scanner scanner;

    public PedidoVista() {
        this.scanner = new Scanner(System.in);
    }

    public void mostrarListaPedidos(List<Pedido> pedidos) {
        System.out.println("=== Lista de Pedidos ===");
        for (Pedido pedido : pedidos) {
            System.out.println("ID: " + pedido.getIdPedido() + ", Fecha: " + pedido.getFecha() +
                    ", Detalles: " + pedido.getDetalles());
        }
        System.out.println("=======================");
    }

    public void mostrarDetallesPedido(Pedido pedido) {
        System.out.println("=== Detalles del Pedido ===");
        System.out.println("ID: " + pedido.getIdPedido());
        System.out.println("Fecha: " + pedido.getFecha());
        System.out.println("Detalles: " + pedido.getDetalles());
        System.out.println("Costo Base: " + pedido.calcularCostoBase());
        System.out.println("Costo con IVA: " + pedido.calcularCostoConIva());
        System.out.println("Descuento aplicado: " + pedido.calcularCostoConDescuento("TipoCliente"));
        System.out.println("===========================");
    }

    public Pedido solicitarDatosCreacionPedido() {
        System.out.println("=== Crear Nuevo Pedido ===");
        System.out.print("Ingrese el id del pedido: ");
        int id = scanner.nextInt();
        System.out.print("Ingrese la fecha del pedido (YYYY-MM-DD): ");
        Date fecha = new Date(scanner.nextLine());
        System.out.print("Ingrese los detalles del pedido: ");
        String detalles = scanner.nextLine();

        return new Pedido(id, fecha, detalles, null, null, null);
    }
    
    
}
