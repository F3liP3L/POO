package com.Calculadora.app;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class CalculadoraAPP {

    public static ImageIcon iconoPrincipal = new ImageIcon(CalculadoraAPP.class.getResource("/imagenes/icono.gif"));
    public static JCheckBox redondear = new JCheckBox("Redondear"); // Boton de redondear.


    public static void main(String[] args) {
        while (true) {
          int opcionElegida = JOptionPane.showOptionDialog(null, "Elija una opcion: ",
                  "Calculadora", 0, 0, iconoPrincipal, Arrays.asList("Sumar", "Resta", "Multiplicar", "Division", redondear).toArray()
          , "Sumar");

          // int opcion = JOptionPane.showConfirmDialog(null, "Quieres continuar?", "Aviso", JOptionPane.OK_CANCEL_OPTION);

          if (opcionElegida!=JOptionPane.CLOSED_OPTION)  {
            switch (opcionElegida) {
               case JOptionPane.CLOSED_OPTION: {
                    break;
                }
                case 0: {
                    if (redondear.isSelected()){
                        double numero = CalculadoraMetodos.redondear(CalculadoraMetodos.sumar());
                        mostrarMensaje("La suma de los numeros es: " + numero);
                    }
                    mostrarMensaje("La suma de los numeros es: " + CalculadoraMetodos.sumar());
                    break;
                }
                case 1: {
                    if (redondear.isSelected()){
                        double numero = CalculadoraMetodos.redondear(CalculadoraMetodos.multiplicar());
                        mostrarMensaje("La resta de los numeros es: " + numero);
                    } else {
                        mostrarMensaje("La resta de los numeros es: " + CalculadoraMetodos.restar());
                    }
                    break;
                }
                case 2: {
                    if (redondear.isSelected()) {
                        double numero = CalculadoraMetodos.redondear(CalculadoraMetodos.multiplicar());
                        mostrarMensaje("La multiplicacion de los numeros es: " + numero);
                    } else {
                        mostrarMensaje("La multiplicacion de los numeros es: " + CalculadoraMetodos.multiplicar());
                    }
                    break;
                }
                case 3: {
                    if (redondear.isSelected()) {
                        double numero = CalculadoraMetodos.redondear(CalculadoraMetodos.dividir());
                        mostrarMensaje("La division de los numeros es: " + numero);
                    } else {
                        mostrarMensaje("La division de los numeros es: " + CalculadoraMetodos.dividir());
                    }
                    break;
                }
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida", "ERROR",
                            JOptionPane.ERROR_MESSAGE);
            }
         } else if (opcionElegida==JOptionPane.CLOSED_OPTION) { //Cerrando la calculadora.
              break;
          }
        }
    }

    public static void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "resultado", JOptionPane.QUESTION_MESSAGE);
    }


}

