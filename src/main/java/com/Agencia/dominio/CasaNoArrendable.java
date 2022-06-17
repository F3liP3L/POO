package com.Agencia.dominio;

public class CasaNoArrendable extends Inmueble {

    public CasaNoArrendable(String direccion, long valorVenta, long valorArriendo) {
        super(direccion, valorVenta, valorArriendo);
    }

    @Override
    public String toString() {
        return "Casa No Arrendable";
    }
}
