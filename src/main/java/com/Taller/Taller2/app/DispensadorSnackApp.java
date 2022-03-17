package com.Taller.Taller2.app;

import com.Taller.Taller2.dominio.DispensadorDeSnack;

public class DispensadorSnackApp {
    public static void main(String[] args) {

        DispensadorDeSnack autoSnack = new DispensadorDeSnack();

        autoSnack.agregar("Bubbalu", "h2f0", 300);
        autoSnack.agregar("Pringles", "ms4l", 1500);
        autoSnack.agregar("Coca de Piña", "l2p3", 100000);
        autoSnack.agregar("pepsi de piña", "z4k2", 70000);

        autoSnack.sacarSnackPorNombre("coca de piña");
        autoSnack.sacarSnackPorNombre("pringles");
        autoSnack.sacarSnackPorNombre("coca de piña");



    }
}
