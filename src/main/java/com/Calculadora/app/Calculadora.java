package com.Calculadora.app;

public class Calculadora {
    public static double sumar (double numero1, double numero2) {
        return numero1 + numero2;
    }

    public static double restar(double numero1, double numero2) {
        return numero1 - numero2;
    }

    public static double multiplicar(double numero1, double  numero2){
        return numero1 * numero2;
    }

    public static double dividir (double numero1, double numero2) { return numero1 / numero2; }

    public static double redondear (double numero) {
        double numeroRedondeado = Math.round(numero * 100.0) / 100.0;
        return numeroRedondeado;
    }

}


