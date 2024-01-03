/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.netbeans_cujicaldas_justinwilliam.modelo;

/**
 *
 * @author Usuario
 */
public interface CalcularCosto {
    public double calcularCostoBase();
    public double calcularCostoConIva();
    public double calcularCostoConDescuento(String Cliente);
}
