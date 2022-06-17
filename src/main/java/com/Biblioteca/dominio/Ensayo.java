package com.Biblioteca.dominio;

public class Ensayo extends Recurso implements IPrestar {
    public Ensayo(String nombre) {
        super(nombre);
    }

    @Override
    public void prestar() {
        super.setPrestado(true);
    }

    @Override
    public void devolver() {
        super.setPrestado(false);
    }

    @Override
    public String toString() {
        return "Ensayo";
    }
}
