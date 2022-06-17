package com.Agencia.dominio;

public abstract class Inmueble {

    public Inmueble(String direccion, long valorVenta, long valorArriendo) {
        this.direccion = direccion;
        this.valorVenta = valorVenta;
        this.valorArriendo = valorArriendo;
    }

    private String direccion;
    private long valorVenta;
    private long valorArriendo;
    private boolean arrendado;

    public String getDireccion() {
        return direccion;
    }

    public long getValorVenta() {
        return valorVenta;
    }

    public long getValorArriendo() {
        return valorArriendo;
    }

    public boolean isArrendado() {
        return arrendado;
    }

    public void setArrendado(boolean arrendado) {
        this.arrendado = arrendado;
    }
}
