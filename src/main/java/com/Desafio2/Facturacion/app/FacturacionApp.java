package com.Desafio2.Facturacion.app;

import com.Desafio2.Facturacion.dominio.*;

import java.time.LocalDate;

public class FacturacionApp {
    public static void main(String[] args) {

        Facturacion facturacion = new Facturacion();

        facturacion.generarFactura("Raul", 10000,(short) 12, LocalDate.of(2022, 6, 12));

        /*
        System.out.println("\n\t ... TEXTEANDO ... \n");

        Factura facturaIva= new FacturaConIva(1000, (short) 12,"Pedro",LocalDate.of(2022, 5, 8));

        System.out.println(facturaIva.calcularTotal());

        System.out.println("\n\t ... TEXTEANDO ... \n");
        */

        facturacion.generarFactura("Juan", 100000,(short) 15,LocalDate.of(2022, 5, 9));
        facturacion.generarFactura("VeneFlow" , 40000, (short) 22,LocalDate.of(2022 , 5, 8) );

        System.out.println(facturacion.getTotalFacturacion());
        System.out.println("La factura mas cara es del cliente " + facturacion.getFacturaMasCara().getCliente()
                + " Con valor de: " + facturacion.getFacturaMasCara().getValor() + " Y fecha de vencimiento "
                + facturacion.getFacturaMasCara().getFechaVencimiento());
        System.out.println("\t...Facturas Sin Iva...\n");
        facturacion.getFacturasSinIva().forEach(fact -> System.out.println(fact.getCliente()
                + " --- " + fact.getValor() + " --- " + "[" + fact.getFechaVencimiento() + "]"));

    }
}
