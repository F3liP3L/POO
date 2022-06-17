package com.Biblioteca.dominio;

public abstract class Recurso {

    private boolean prestado;
    private String nombre;
    private int copias;

    public Recurso(String nombre) {
        this.nombre = nombre;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCopias() {
        return copias;
    }

    protected void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected void setCopias(int copias) {
        this.copias = copias;
    }

}
