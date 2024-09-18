/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package srp;

/**
 *
 * @author INTEL
 */
public class ImprimirFactura {
    private  Factura factura;

    public ImprimirFactura(Factura factura) {
        this.factura = factura;
    }
    
    
    void imprimir(){
    System.out.println(factura.getTasaDescuento() + "x " + factura.getLibro().nombre+ " " + factura.getLibro().precio + "$");
            System.out.println("Tasa de Descuento: " + factura.getTasaDescuento());
            System.out.println("Tasa de Impuesto: " + factura.getTasaImpuesto());
            System.out.println("Total: " + factura.getTotal());
    }
            
}
