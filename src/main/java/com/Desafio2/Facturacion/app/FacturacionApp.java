package com.Desafio2.Facturacion.app;

import com.Desafio2.Facturacion.dominio.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class FacturacionApp {
    public static void main(String[] args) {

        Facturacion facturacion = new Facturacion();

        facturacion.generarFactura("Raul", 10000,(short) 12, (short) 15, LocalDate.of(2022, 6, 12));
        facturacion.generarFactura("Oscar", 250000, (short) 15, (short) 20, LocalDate.of(2022, 5, 11));

        /*
        System.out.println("\n\t ... TEXTEANDO ... \n");

        Factura facturaDescuento= new FacturaDescuento(1000, (short) 10, (short) 10,"Pedro",LocalDate.of(2022, 5, 8));

        System.out.println(facturaDescuento.calcularTotal());

        System.out.println("\n\t ... TEXTEANDO ... \n");
        */

        facturacion.generarFactura("Juan", 100000,(short) 15, (short) 20, LocalDate.of(2022, 5, 9));
        facturacion.generarFactura("Rodrigo" , 40000, (short) 22, (short) 30,LocalDate.of(2022 , 5, 8) );



        System.out.println(facturacion.getTotalFacturacion());
        System.out.println("La factura mas cara es del cliente " + facturacion.getFacturaMasCara().getCliente()
                + " Con valor de: " + facturacion.getFacturaMasCara().calcularTotal() + " Y fecha de vencimiento ["
                + facturacion.getFacturaMasCara().getFechaVencimiento());
        System.out.println("\t... Facturas Sin Iva ...\n");
        facturacion.getFacturasSinIva().forEach(fact -> System.out.println(fact.getCliente()
                + " --- " + fact.getValor() + " --- " + "[" + fact.getFechaVencimiento() + "]"));
        System.out.println("\t... Facturas con descuento ...\n");

        facturacion.getFacturasConDescuento().forEach(facD -> System.out.println(facD.getCliente()
                + " --- " + facD.getValor() + " --- " + "[" + facD.getFechaVencimiento() + "]"));



        /*

        System.out.println("\t .... TEXTEANDO .... \n");

        List<String> vocales = Arrays.asList("a","e","i","o","u");
        String nombre = "Pedro";
        String nombre2 = "Alvaro";
        String nombre3 = "Emanuel";

        System.out.println("Primer caracter: " + nombre2.toLowerCase(Locale.ROOT).charAt(0));
        String caracter = String.valueOf(nombre2.toLowerCase(Locale.ROOT).charAt(0));
        boolean veracidad = vocales.contains(caracter);
        if(veracidad) {
            System.out.println("El nombre " + nombre2 + " hace parte de las vocales.");
        }


        System.out.println("\t .... TEXTEANDO ....\n");
        */


    }
}
