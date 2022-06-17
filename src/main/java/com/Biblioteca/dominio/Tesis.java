package com.Biblioteca.dominio;

public class Tesis extends Recurso implements ICopiar {
    public Tesis(String nombre) {
        super(nombre);
    }

    @Override
    public void fotocopiar() {
       int copias = getCopias();
       copias++;
       setCopias(copias);
    }

    @Override
    public String toString() {
        return "Tesis";
    }


}
