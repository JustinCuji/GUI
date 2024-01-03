/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.netbeans_cujicaldas_justinwilliam.modelo;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Pedido implements CalcularCosto{
    private int idPedido;
    private Date fecha;
    private String detalles;
    private List<Producto> listaProdcutos;
    private Cliente cliente;
    private Empleado empleado;

    public Pedido(int idPedido, Date fecha, String detalles, List<Producto> listaProdcutos, Cliente cliente, Empleado empleado) {
        this.idPedido = idPedido;
        this.fecha = fecha;
        this.detalles = detalles;
        this.listaProdcutos = listaProdcutos;
        this.cliente = cliente;
        this.empleado = empleado;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public List<Producto> getListaProdcutos() {
        return listaProdcutos;
    }

    public void setListaProdcutos(List<Producto> listaProdcutos) {
        this.listaProdcutos = listaProdcutos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    @Override
    public String toString() {
        return "Pedido{" + "idPedido=" + idPedido + ", fecha=" + fecha + ", detalles=" + detalles + ", listaProdcutos=" + listaProdcutos + ", cliente=" + cliente + ", empleado=" + empleado + '}';
    }

    @Override
    public double calcularCostoBase() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double calcularCostoConIva() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double calcularCostoConDescuento(String Cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
}
