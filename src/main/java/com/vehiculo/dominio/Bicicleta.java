package com.vehiculo.dominio;

public class Bicicleta extends Vehiculo{
    private int numPiniones;
    private int numPlatos;
    private double candencia;

    public Bicicleta(String marca, String modelo, int anioModelo) {
        super(marca, modelo, anioModelo);
    }

    @Override
    public void acelarar(int incrementar) {
        System.out.println("La biclicleta acelera a " + incrementar);
    }

    public int getNumPiniones() {
        return numPiniones;
    }

    public void setNumPiniones(int numPiniones) {
        this.numPiniones = numPiniones;
    }

    public int getNumPlatos() {
        return numPlatos;
    }

    public void setNumPlatos(int numPlatos) {
        this.numPlatos = numPlatos;
    }

    public double getCandencia() {
        return candencia;
    }

    public void setCandencia(double candencia) {
        this.candencia = candencia;
    }
}
