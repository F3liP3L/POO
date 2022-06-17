package com.Biblioteca.dominio;

public class Revista extends Recurso implements IPrestar {
    public Revista(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "Revista";
    }

    @Override
    public void prestar() {
        super.setPrestado(true);
    }

    @Override
    public void devolver() {
        super.setPrestado(false);
    }
}
