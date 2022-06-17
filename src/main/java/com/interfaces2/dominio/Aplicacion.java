package com.interfaces2.dominio;

public class Aplicacion implements Viruseable {
    private String nombre;

    public Aplicacion(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean tieneVirus() {
        return !this.nombre.contains(".exe");
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }
}
