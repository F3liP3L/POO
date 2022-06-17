package com.Agencia.app;

import com.Agencia.dominio.Agencia;
import com.Agencia.dominio.Casa;
import com.Agencia.dominio.Inmueble;

public class AgenciaApp {

    public static void main(String[] args) {

        Agencia hogaresCardona = new Agencia("Hogares Cardona");

        hogaresCardona.agregarInmuebele("casa", "cr52 la pm" , 20000000, 950000 );
        hogaresCardona.agregarInmuebele("lote", "marinilla",10000000, 120000);
        hogaresCardona.agregarInmuebele("apartamento", "medallo city" , 500000000, 2400000);
        hogaresCardona.agregarInmuebele("casa", "la ceja" , 80000000, 0);
        hogaresCardona.agregarInmuebele("apartamento", "santuario", 500000, 10000);

        Inmueble hogar = new Casa("Uraba Antioquia GOD" , 900000000, 1500000);

        hogaresCardona.getArrendados().add(hogar);

        hogaresCardona.arrendar(hogar);


        if (hogaresCardona.getArrendados() != null || hogaresCardona.getArrendados().size()>0) {
            System.out.println("\t Hogares arrendados. \n");
            hogaresCardona.getArrendados().forEach(inmueble -> System.out.println(inmueble.getDireccion() + " -- " +inmueble.getValorArriendo()));
        } else {
            System.out.println("No hay ningun inmueble arrendado por el momento");
        }

        System.out.println("Lista de inmuebles no arrendados.\n");
        hogaresCardona.getArrendablesDisponibles().forEach(inmueble -> System.out.println(inmueble.getDireccion() + " -- " +inmueble.getValorArriendo()));
    }
}
