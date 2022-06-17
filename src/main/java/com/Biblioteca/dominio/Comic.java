package com.Biblioteca.dominio;

import java.util.Arrays;
import java.util.List;

public class Comic extends Recurso implements ICopiar {

    private String editorial;

    public Comic(String nombre, String editorial) {
        super(nombre);
        this.editorial = editorial;
    }

    public static boolean vericarPrestabilidad(String editorial) {
        List<String> editoriales = Arrays.asList("DC", "Marvel", "Panini" , "Fantagraphics", "Viz Media", "Image Comics");
        String seEncuentra = editoriales.stream().filter(edit-> edit.equalsIgnoreCase(editorial)).findAny().orElse(null);
        return seEncuentra != null;
    }
    @Override
    public void fotocopiar() {
        if(!vericarPrestabilidad(this.editorial)) {
            int copias = getCopias();
            copias++;
            setCopias(copias);
        } else {
            System.out.println("No se puede fotocopiar debido a su copyright.");
        }
    }

    @Override
    public String toString() {
        return "Comic";
    }
}
