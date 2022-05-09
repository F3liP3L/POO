package com.vehiculo.dominio;

public class Moto extends Vehiculo{

    private boolean gato;


    public Moto(String marca, String modelo, int anioModelo) {
        super(marca, modelo, anioModelo);
    }

    public void bajarGato () {
        this.gato = true;
        System.out.println("Se ha bajado el gato.");
    }

    public void subirGato () {
        this.gato = false;
        System.out.println("Se ha subido el gato.");
    }

    @Override
    public void acelarar(int incrementar) {
        System.out.println("La moto ACELEREEEEE " + incrementar + " m/s");
    }
}
