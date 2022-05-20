package com.interfaces2.dominio;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Imagen implements Viruseable {
    private String nombre;

    public Imagen(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean tieneVirus() {
        if (this.nombre.contains(".jpg")) {
            return false;
        } else if (this.nombre.contains(".png")) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    /* TODO crear un metodo que lea tipos de imagenes de una lista y verifique si estan o no estan.
    public static boolean validandoImagen(String nombre) {
        List<String> tiposFormatos = Arrays.asList(".img",".png",".gif",".tiff",".psd", ".jpg", ".jpge");
        }
     */
}