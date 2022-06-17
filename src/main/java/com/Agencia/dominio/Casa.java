package com.Agencia.dominio;

public class Casa extends Inmueble implements IArrendar{


    public Casa(String direccion, long valorVenta, long valorArriendo) {
        super(direccion, valorVenta, valorArriendo);
    }

    @Override
    public String toString() {
        return "Casa";
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
