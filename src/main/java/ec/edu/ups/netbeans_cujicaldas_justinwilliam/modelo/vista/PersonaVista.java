/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.netbeans_cujicaldas_justinwilliam.modelo.vista;

import ec.edu.ups.netbeans_cujicaldas_justinwilliam.modelo.Cliente;
import ec.edu.ups.netbeans_cujicaldas_justinwilliam.modelo.Empleado;
import ec.edu.ups.netbeans_cujicaldas_justinwilliam.modelo.Persona;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PersonaVista {
    private Scanner scanner;

    public PersonaVista() {
        this.scanner = new Scanner(System.in);
    }

    public void mostrarListaPersonas(List<Persona> personas) {
        System.out.println("=== Lista de Personas ===");
        for (Persona persona : personas) {
            System.out.println("ID: " + persona.getId() + ", Nombre: " + persona.getNombre());
        }
        System.out.println("=======================");
    }

    public void mostrarDetallesPersona(Persona persona) {
        System.out.println("=== Detalles de la Persona ===");
        System.out.println("ID: " + persona.getId());
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Dirección: " + persona.getDireccion());
        
        System.out.println("=============================");
    }

    public Persona solicitarDatosCreacionPersona(boolean esCliente) {
        System.out.println("=== Crear Nueva Persona ===");

        System.out.println("Ingrese el id: ");
        int id = scanner.nextInt();
        
        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la dirección: ");
        String direccion = scanner.nextLine();

        if (esCliente) {
            Cliente cliente = solicitarDatosCliente();
            return new Cliente(id, nombre, direccion);
        } else {
            Empleado empleado = solicitarDatosEmpleado();
            return new Empleado(id, nombre, direccion);
        }
    }

    private Cliente solicitarDatosCliente() {
        System.out.print("Ingrese el número de teléfono del cliente: ");
        String numeroTelefono = scanner.nextLine();

        System.out.print("¿Es cliente VIP? (Sí/No): ");
        boolean esVip = scanner.nextLine().equalsIgnoreCase("Sí");

        return null;
    }

    private Empleado solicitarDatosEmpleado() {
        System.out.print("Ingrese el rol del empleado: ");
        String rol = scanner.nextLine();

        System.out.print("Ingrese el salario del empleado: ");
        double salario = Double.parseDouble(scanner.nextLine());
        
        return null;
    }
}
