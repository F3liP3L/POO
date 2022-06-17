package com.vehiculo.dominio;

public class Carro extends Vehiculo {
    private String placa;
    private int numCambios;
    private String tipoTransmision;
    private boolean estacionarias;

    public Carro(String marca, String modelo, int anioModelo) {
        super(marca, modelo, anioModelo);
    }

    @Override
    public void acelarar(int incrementar) {
        System.out.println("El carro acelera a " + incrementar);
    }

    public void encenderEstacionarios () {
        this.estacionarias = true;
        System.out.println("Se han prendido los estacionarios.");
    }

    public void apagarEstacioarios () {
        this.estacionarias = false;
        System.out.println("Se han apagado los estacionarios.");
    }

    public String getPlaca() {
        return placa;
    }

    public int getNumCambios() {
        return numCambios;
    }

    public String getTipoTransmision() {
        return tipoTransmision;
    }
}
