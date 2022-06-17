package com.Agencia.dominio;

public class ApartamentoNoArrendable extends Inmueble {
    public ApartamentoNoArrendable(String direccion, long valorVenta, long valorArriendo) {
        super(direccion, valorVenta, valorArriendo);
    }

    @Override
    public String toString() {
        return "Apartamento No Arrendable";
    }
}
