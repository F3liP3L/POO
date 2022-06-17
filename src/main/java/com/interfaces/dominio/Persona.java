package com.interfaces.dominio;

public class Persona {
    private String nombre;
    private String rostro;
    private String huella;
    private int pin;
    private String password;

    public Persona(String nombre, String rostro, String huella, int pin, String password) {
        this.nombre = nombre;
        this.rostro = rostro;
        this.huella = huella;
        this.pin = pin;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRostro() {
        return rostro;
    }

    public String getHuella() {
        return huella;
    }

    public int getPin() {
        return pin;
    }

    public String getPassword() {
        return password;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRostro(String rostro) {
        this.rostro = rostro;
    }

    public void setHuella(String huella) {
        this.huella = huella;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
