package com.Taller.Taller2.dominio;

import java.util.ArrayList;
import java.util.List;

public class DispensadorDeSnack {
    private List<Snack> snacks;
    private int capacidad = 3;

    public DispensadorDeSnack() {
        this.snacks = new ArrayList<>();
    }

    public void agregar(String nombre, String codigo, long valor) {
        Snack snackAAgregar = new Snack(nombre, codigo, valor);
        if ((this.snacks.size()+1)<=this.capacidad){
            this.snacks.add(snackAAgregar);
        } else {
            System.out.println("No se pueden agregar mas snacks, Has excedido el limite.");
        }
    }

   public void sacarSnackPorNombre(String nombre) {
   }

    public void aumentarSnack(String codigo){

    }

    public void quitarSnack(String codigo){

    }

    public Snack CantidadSnack (long cantidadSnack) {

        return null;
    }

    public List<Snack> snackAgotados (String codigo) {

        return null;
    }

    public List<Snack> snackDisponibles (){

        return null;
    }


}