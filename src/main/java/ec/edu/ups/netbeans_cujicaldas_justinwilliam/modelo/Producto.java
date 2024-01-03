/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.netbeans_cujicaldas_justinwilliam.modelo;

/**
 *
 * @author Usuario
 */
public class Producto {
    private int idPro;
    private String nombre;
    private double precio;

    public Producto(int idPro, String nombre, double precio) {
        this.idPro = idPro;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getIdPro() {
        return idPro;
    }

    public void setIdPro(int idPro) {
        this.idPro = idPro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "idPro=" + idPro + ", nombre=" + nombre + ", precio=" + precio + '}';
    }
    
    
    
    
}
