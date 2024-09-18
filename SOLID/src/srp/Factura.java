/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package srp;

/**
 *
 * @author INTEL
 */
public class Factura {
    private Libro libro;
    private int cantidad;
    private double tasaDescuento;
    private double tasaImpuesto;
    private double total;

    public Factura(Libro libro, int cantidad, double tasaDescuento, double tasaImpuesto) {
        this.libro = libro;
        this.cantidad = cantidad;
        this.tasaDescuento = tasaDescuento;
        this.tasaImpuesto = tasaImpuesto;
        this.total= calcularTotal();
        
    }

    public Libro getLibro() {
        return libro;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getTasaDescuento() {
        return tasaDescuento;
    }

    public double getTasaImpuesto() {
        return tasaImpuesto;
    }

    public double getTotal() {
        return total;
    }
    
    public double calcularTotal(){
    
        double precio = cantidad*(libro.precio - libro.precio*tasaImpuesto);
        double precioConImpuesto = 1+(libro.precio*tasaImpuesto);
        return precioConImpuesto;
    }
}
