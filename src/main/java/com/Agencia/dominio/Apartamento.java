package com.Agencia.dominio;

public class Apartamento extends Inmueble implements IArrendar {


    public Apartamento(String direccion, long valorVenta, long valorArriendo) {
        super(direccion, valorVenta, valorArriendo);
    }

    @Override
    public String toString() {
        return "Apartamento";
    }

    @Override
    public void arrendar() {
        setArrendado(true);
    }

    @Override
    public void devolver() {
        setArrendado(false);
    }
}
