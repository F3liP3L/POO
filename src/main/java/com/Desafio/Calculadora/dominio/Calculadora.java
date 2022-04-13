package com.Desafio.Calculadora.dominio;

import java.util.List;

public class Calculadora {

    public static double sumar (List<Double> numeros, boolean redondeo) {
        if (redondeo) {
            return redondear(numeros.stream().mapToDouble(nro -> nro).sum());
        }
        return numeros.stream().mapToDouble(nro -> nro).sum();
    }

    public static double restar(List<Double> numeros, boolean redondeo) {
        if (redondeo) {
            return redondear(numeros.stream().mapToDouble(nro -> nro).reduce((left, right) -> left - right).getAsDouble());
        }
        return numeros.stream().mapToDouble(nro -> nro).reduce((left, right) -> left - right).getAsDouble();
    }

    public static double multiplicar(List<Double> numeros, boolean redondeo) {
        double multiplicacion = 1;
        for (double i: numeros) multiplicacion *= i;
        if (redondeo) {
            return redondear(multiplicacion);
        }
        return multiplicacion;
    }
    public static double dividir (List<Double> numeros, boolean redondeo) {
        if (redondeo) {
            return redondear(numeros.stream().mapToDouble(nro -> nro).reduce((left, right) -> left/right).getAsDouble());
        }
        return numeros.stream().mapToDouble(nro -> nro).reduce((left, right) -> left/right).getAsDouble();
    }

    public static double redondear (double numero) { // redondeando a 2 cifras
        return Math.round(numero*100.0)/100.0;
    }

}


