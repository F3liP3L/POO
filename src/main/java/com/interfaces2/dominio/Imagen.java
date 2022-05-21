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
       return !validandoImagen(this.nombre);
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    public static boolean validandoImagen(String nombre) {
        List<String> tiposFormatos = Arrays.asList(".png",".gif",".tiff",".psd", ".jpg", ".jpge");
        for (String formato: tiposFormatos) {
            if(nombre.toLowerCase(Locale.ROOT).contains(formato)) {
                return true;
            }
        }
                return false;
    }
     
}