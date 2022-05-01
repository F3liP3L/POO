package com.vehiculo.dominio;

public class Moto extends Vehiculo{
    public Moto(String marca, String modelo, int anioModelo) {
        super(marca, modelo, anioModelo);
    }

    @Override
    public void acelarar(int incrementar) {
        System.out.println("La moto acelera a " + incrementar);
    }
}
