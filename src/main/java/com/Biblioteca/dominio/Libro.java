package com.Biblioteca.dominio;

public class Libro extends Recurso implements ICopiar, IPrestar {
    public Libro(String nombre) {
        super(nombre);
    }

    @Override
    public void prestar() {
        this.setPrestado(true);
    }

    @Override
    public void devolver() {
        super.setPrestado(false);
    }

    @Override
    public void fotocopiar() {
        int copias = getCopias();
        copias++;
        setCopias(copias);
    }

    @Override
    public String toString() {
        return "Libro";
    }
}
