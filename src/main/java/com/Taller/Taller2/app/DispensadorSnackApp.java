package com.Taller.Taller2.app;

import com.Taller.Taller2.dominio.DispensadorDeSnack;
import com.Taller.Taller2.dominio.Snack;

public class DispensadorSnackApp {
    public static void main(String[] args) {

        DispensadorDeSnack autoSnack = new DispensadorDeSnack();

        autoSnack.agregar("Bubbalu", "h2f0", 300);
        autoSnack.agregar("Pringles", "ms4l", 1500);
        autoSnack.agregar("Coca de Piña", "l2p3", 100000);
        autoSnack.agregar("pepsi de piña", "z4k2", 70000);

        autoSnack.quitarSnack("l2p3");
        autoSnack.quitarSnack("ms");

        autoSnack.sacarSnackPorCodigo("z4k2");
        autoSnack.sacarSnackPorCodigo("z4k2");
        autoSnack.sacarSnackPorCodigo("z4k2");
        autoSnack.sacarSnackPorNombre("pepsi de piña");
        autoSnack.sacarSnackPorCodigo("z4k2");
        autoSnack.sacarSnackPorCodigo("z4k2");
        autoSnack.sacarSnackPorCodigo("z4k2");
        autoSnack.sacarSnackPorCodigo("z4k2");
        autoSnack.sacarSnackPorCodigo("z4k2");

        System.out.println("------- Este es otro mecato a dispensar -----");
        autoSnack.sacarSnackPorCodigo("h2f0");
        System.out.println("------- Este tambien... ------");
        autoSnack.sacarSnackPorCodigo("ms4l");
        System.out.println("------- Y por ultimo este... --------");
        autoSnack.sacarSnackPorCodigo("msdf");
        autoSnack.snackOrdenadaPrecio();
        autoSnack.sacarSnackPorNombre("bubbalu");
        System.out.println("------------Lista Por Cantidad-----------");
        autoSnack.snackOrdenadaCantidad();
        autoSnack.snackDisponibles();
        autoSnack.snackAgotados();
        System.out.println("----------Probando Snack Por nombre -----------");
        autoSnack.sacarSnackPorNombre("pringles");
        System.out.println("----------Buscando un Snack -----------");
        autoSnack.cantidadSnack("ms4l");
        autoSnack.cantidadSnack("z4k2");
        System.out.println("----------AUMENTANDO UN SNACK---------");
        autoSnack.aumentarSnack("ms4l", 4);
        autoSnack.aumentarSnack("s3rl", 23);
        autoSnack.cantidadSnack("ms4l");


    }
}
