package com.Biblioteca.dominio;

import java.time.LocalDate;
import java.time.Period;

public class Archivo extends Recurso implements ICopiar{

    private LocalDate fecha;

    public Archivo(String nombre, LocalDate fecha) {
        super(nombre);
        this.fecha = fecha;
    }

    @Override
    public void fotocopiar() {
        if (tiempoEntreFechas(this.fecha) <= 10) { //si el registro es de hace menos de 10 años se puede fotocopiar
            int copias = getCopias();
            copias++;
            setCopias(copias);
        } else {
            System.out.println("No se puede fotocopiar el recurso " + getNombre());
        }
    }

    public static int tiempoEntreFechas(LocalDate fechaRegistro){
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaRegistro, fechaActual);
        return periodo.getYears();
    }
}
