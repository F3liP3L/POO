package com.interfaces.dominio;

public abstract class Celular implements Validacion {
    private boolean encendido;
    private long numero;
    private String marca;
    private Persona propietario;

    public Celular(String marca, Persona propietario) {
        this.marca = marca;
        this.propietario = propietario;
    }

    @Override
    public void encender() {
        this.encendido = true;
    }

    @Override
    public void apagar() {
        this.encendido = false;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public long getNumero() {
        return numero;
    }

    public String getMarca() {
        return marca;
    }

    public Persona getPropietario() {
        return propietario;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }
}
