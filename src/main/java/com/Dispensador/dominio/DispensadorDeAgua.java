package com.Dispensador.dominio;

public class DispensadorDeAgua {
    public String marca;
    public double capacidad;
    public double cantidadActual;
    public Agua agua;
    public String color;


    public DispensadorDeAgua (String marca, double capacidad){
        this.marca = marca;
        this.capacidad = capacidad;
    }

    public void vaciar(){
        this.cantidadActual = 0;
        System.out.println("Se ha vaciado el dispensador.");
    }

    public void llenar(){
        this.cantidadActual = this.capacidad;
        System.out.println("Se ha llenado el dispensador.");
    }

    public void cambiarAgua(Agua nuevaAgua){
        this.vaciar();
        this.agua = nuevaAgua;
        this.llenar();
        System.out.println("Se ha cambiado de agua a " + this.agua.marca);
    }

    public void dispensar(double cantAServir, boolean tempAgua) {
        if ((cantAServir <= this.cantidadActual)&&(cantAServir!=0)) {
            if (tempAgua == true) { // Para agua fria
                this.cantidadActual -= cantAServir;
                System.out.println("Se ha dispensado " + cantAServir + " ml de agua fria ");
                System.out.println("Queda " + this.cantidadActual + " ml " + this.agua.marca);
            } else { // Para agua caliente
                this.cantidadActual -= cantAServir;
                System.out.println("Se ha dispensado " + cantAServir + " ml de agua caliente ");
                System.out.println("Queda " + this.cantidadActual + " ml " + this.agua.marca);
            }
        } else {
            System.out.println("No se ha podido servir el agua");
        }
    }
}
