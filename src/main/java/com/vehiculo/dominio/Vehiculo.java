package com.vehiculo.dominio;

public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private int anioModelo;
    private double velocidad;
    private int capacidad = 3;

    public Vehiculo(String marca, String modelo, int anioModelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioModelo = anioModelo;
    }

    public void acelarar (int incrementar) {
        this.velocidad += incrementar;
        System.out.println("El vehiculo acelera a " + this.velocidad);
    }
    public void frenar (int decremento) {
        this.velocidad -= decremento;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnioModelo() {
        return anioModelo;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public int getCapacidad() {
        return capacidad;
    }
}
