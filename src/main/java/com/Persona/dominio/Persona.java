package com.Persona.dominio;

public class Persona {

    private String nombre;
    private String apellido;
    private long id;
    private int edad;

    /* Esto se ha realizado a nivel de ejemplo. hacerlo mas cache */

    public void leer (String DocumentoALeer ) {
        System.out.println("Se ha leido el documento " + DocumentoALeer);
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public long getId() {
        return id;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
