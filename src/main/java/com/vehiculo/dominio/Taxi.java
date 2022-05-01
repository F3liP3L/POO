package com.vehiculo.dominio;

public class Taxi extends Carro {
    private double taximetro;
    private String empresa;
    private int numPasajeros;

    public Taxi(String marca, String modelo, int anioModelo) {
        super(marca, modelo, anioModelo);
    }

    public void bajarPasajero() {
        if (this.numPasajeros > 0) {
            this.numPasajeros = 0;
        } else {
            System.out.println("No puede bajar pasajeros porque está vacío...");
        }
    }

    public void subirPasajero(int pasajerosASubir) {
        if (pasajerosASubir  <= this.getCapacidad()) {
            this.numPasajeros= pasajerosASubir;
            System.out.println("Se han subido " + numPasajeros + " pasajero/pasajeros.");
        } else {
            System.out.println("No puede subir a nadie más. Va full.");
        }
    }

    public String getEmpresa() {
        return empresa;
    }


}
