package com.Calculadora.app;

import javax.swing.*;



public class CalculadoraMetodos {


    public static ImageIcon iconSuma = new ImageIcon(CalculadoraAPP.class.getResource("/imagenes/suma.png"));
    public static ImageIcon iconResta = new ImageIcon(CalculadoraAPP.class.getResource("/imagenes/resta.png"));
    public static ImageIcon iconMultiplicacion = new ImageIcon(CalculadoraAPP.class.
            getResource("/imagenes/multiplicacion.png"));
    public static ImageIcon iconDivision = new ImageIcon(CalculadoraAPP.class.getResource("/imagenes/division.png"));


    public static double sumar () {
        double numero1 = Double.parseDouble((String) JOptionPane.showInputDialog(null, "Ingrese un numero",
                "Suma", 0 , iconSuma, null, 0));
        double numero2 = Double.parseDouble((String) JOptionPane.showInputDialog(null, "Ingrese otro numero ", "Suma",
                0 , iconSuma, null, 0));
        return numero1 + numero2;
    }

    public static double restar() {
        double numero1 = Double.parseDouble((String) JOptionPane.showInputDialog(null, "Ingrese un numero",
                "Resta", 0 , iconResta, null, 0));
        double numero2 = Double.parseDouble((String) JOptionPane.showInputDialog(null, "Ingrese otro numero ", "Resta",
                0 , iconResta, null, 0));
        return numero1 - numero2;
    }

    public static double multiplicar(){
        double numero1 = Double.parseDouble((String) JOptionPane.showInputDialog(null, "Ingrese un numero",
                "Multiplicar", 0 , iconMultiplicacion, null, 0));
        double numero2 = Double.parseDouble((String) JOptionPane.showInputDialog(null, "Ingrese otro numero ", "Multiplicar",
                0 , iconMultiplicacion, null, 0));
        return numero1 * numero2;
    }

    public static double dividir () {
        double numero1 = Double.parseDouble((String) JOptionPane.showInputDialog(null, "Ingrese un numero",
                "Dividir", 0 , iconDivision, null, 0));
        double numero2 = Double.parseDouble((String) JOptionPane.showInputDialog(null, "Ingrese otro numero ", "Dividir",
                0 , iconDivision, null, 0));
        if (numero2 > 0) {
            return numero1 / numero2;
        } else {
            JOptionPane.showMessageDialog(null, "Opcion invalida", "ERROR",
                    JOptionPane.ERROR_MESSAGE);
            return dividir();
        }
    }

    public static double redondear (double numero) {
        double numeroRedondeado = Math.round(numero * 100.0) / 100.0;
        return numeroRedondeado;
    }



}


