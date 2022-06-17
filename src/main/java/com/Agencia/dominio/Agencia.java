package com.Agencia.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Agencia {

    private String nombre;
    private List<Inmueble> inmuebles;

    public Agencia (String nombre) {
        this.inmuebles = new ArrayList<>();
        this.nombre = nombre;
    }
    public void agregarInmuebele (String tipo, String direccion, long valorVenta, long valorArriendo) {
        Inmueble inmuebleAAgregar;
        if (tipo.toLowerCase(Locale.ROOT).contains("casa")) {
            if (valorArriendo>0) {
                inmuebleAAgregar = new Casa(direccion, valorVenta, valorArriendo);
            } else {
                inmuebleAAgregar = new CasaNoArrendable(direccion, valorVenta, valorArriendo);
            }
        } else if (tipo.toLowerCase(Locale.ROOT).contains("apartamento")) {
            if (valorArriendo>0) {
                inmuebleAAgregar = new Apartamento(direccion, valorVenta, valorArriendo);
            } else {
                inmuebleAAgregar = new ApartamentoNoArrendable(direccion, valorVenta, valorArriendo);
            }
        } else if (tipo.toLowerCase(Locale.ROOT).contains("lote")){
            inmuebleAAgregar = new Lote(direccion, valorVenta ,valorArriendo);
        } else {
            System.out.println("No manejamos ese tipo de inmueble.");
            inmuebleAAgregar = null;
        }
            this.inmuebles.add(inmuebleAAgregar);
    }
    public boolean arrendar(Inmueble inmueble) {
        if (inmueble instanceof IArrendar){
            if (!inmueble.isArrendado()) {
                ((IArrendar) inmueble).arrendar();
                return true;
            } else {
                System.out.println("El inmueble ya se encuentra arrendado.");
                return false;
            }
        } else {
            System.out.println("El inmueble " + inmueble.toString() + " no es arrendable.");
            return false;
        }
    }
    public boolean devolver (Inmueble inmueble) {
        if (inmueble instanceof IArrendar) {
            if(inmueble.isArrendado()) {
                ((IArrendar) inmueble).devolver();
                return true;
            } else {
                System.out.println("El inmueble no se encuentra arrendado.");
                return false;
            }
        } else {
            System.out.println("El inmueble " + inmueble.toString() + " NO es arrendable.");
            return false;
        }
    }
    public boolean vender (Inmueble inmueble) {
        if (inmueble.isArrendado()==false) {
            this.inmuebles.remove(inmueble);
            return true;
        } else {
            System.out.println("El inmueble " + inmueble + " se encuentra arrendado.");
            return false;
        }
    }
    public List<Inmueble> getArrendablesDisponibles() {
        return this.inmuebles.stream().filter(inmueble -> inmueble instanceof IArrendar && !inmueble.isArrendado())
                .collect(Collectors.toList());
    }
    public List<Inmueble> getArrendados() {
        return this.inmuebles.stream().filter(inmueble -> inmueble instanceof IArrendar && inmueble.isArrendado())
                .collect(Collectors.toList());
    }

}
