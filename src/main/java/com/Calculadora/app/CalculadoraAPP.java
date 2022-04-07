package com.Calculadora.app;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class CalculadoraAPP {

    public static ImageIcon iconSuma = new ImageIcon(CalculadoraAPP.class.getResource("/imagenes/suma.png"));
    public static ImageIcon iconResta = new ImageIcon(CalculadoraAPP.class.getResource("/imagenes/resta.png"));
    public static ImageIcon iconMultiplicacion = new ImageIcon(CalculadoraAPP.class.
            getResource("/imagenes/multiplicacion.png"));
    public static ImageIcon iconDivision = new ImageIcon(CalculadoraAPP.class.getResource("/imagenes/division.png"));
    public static ImageIcon iconoPrincipal = new ImageIcon(CalculadoraAPP.class.getResource("/imagenes/icono.gif"));
    public static JCheckBox redondear = new JCheckBox("Redondear"); // Boton de redondear.


    public static void main(String[] args) {
        while (true) {
          int opcionElegida = JOptionPane.showOptionDialog(null, "Elija una opcion: ",
                  "Calculadora", 0, 0, iconoPrincipal, Arrays.asList("Sumar", "Resta", "Multiplicar", "Division", redondear).toArray(), 0);

          //int opcion = JOptionPane.showConfirmDialog(null, "Quieres continuar?", "Aviso", JOptionPane.OK_CANCEL_OPTION);

          if (opcionElegida!=JOptionPane.CLOSED_OPTION)  {
            switch (opcionElegida) {
                case JOptionPane.CLOSED_OPTION: {
                    break;
                }
                case 0: {
                    double numero1 = Double.parseDouble((String) JOptionPane.showInputDialog(null, "Ingrese un numero",
                            "Suma", 0 , iconSuma, null, 0));
                    double numero2 = Double.parseDouble((String) JOptionPane.showInputDialog(null, "Ingrese otro numero ", "Suma",
                            0 , iconSuma, null, 0));
                    if (redondear.isSelected()){
                        double numero = Calculadora.redondear(Calculadora.sumar(numero1, numero2));
                        mostrarMensaje("La suma de los numeros es: " + numero);
                    } else {
                        mostrarMensaje("La suma de los numeros es: " + Calculadora.sumar(numero1, numero2));
                    }
                    break;
                }
                case 1: {
                    double numero1 = Double.parseDouble((String) JOptionPane.showInputDialog(null, "Ingrese un numero",
                            "Resta", 0 , iconResta, null, 0));
                    double numero2 = Double.parseDouble((String) JOptionPane.showInputDialog(null, "Ingrese otro numero ", "Resta",
                            0 , iconResta, null, 0));
                    if (redondear.isSelected()){
                        double numero = Calculadora.redondear(Calculadora.restar(numero1, numero2));
                        mostrarMensaje("La resta de los numeros es: " + numero);
                    } else {
                        mostrarMensaje("La resta de los numeros es: " + Calculadora.restar(numero1, numero2));
                    }
                    break;
                }
                case 2: {
                    double numero1 = Double.parseDouble((String) JOptionPane.showInputDialog(null, "Ingrese un numero",
                            "Multiplicar", 0 , iconMultiplicacion, null, 0));
                    double numero2 = Double.parseDouble((String) JOptionPane.showInputDialog(null, "Ingrese otro numero ", "Multiplicar",
                            0 , iconMultiplicacion, null, 0));
                    if (redondear.isSelected()) {
                        double numero = Calculadora.redondear(Calculadora.multiplicar(numero1, numero2));
                        mostrarMensaje("La multiplicacion de los numeros es: " + numero);
                    } else {
                        mostrarMensaje("La multiplicacion de los numeros es: " + Calculadora.multiplicar(numero1, numero2));
                    }
                    break;
                }
                case 3: {
                    double numero1 = Double.parseDouble((String) JOptionPane.showInputDialog(null, "Ingrese un numero",
                            "Dividir", 0 , iconDivision, null, 0));
                    double numero2 = Double.parseDouble((String) JOptionPane.showInputDialog(null, "Ingrese otro numero ", "Dividir",
                            0 , iconDivision, null, 0));
                    if (numero2!=0) {
                        if (redondear.isSelected()) {
                            double numero = Calculadora.redondear(Calculadora.dividir(numero1, numero2));
                            mostrarMensaje("La division de los numeros es: " + numero);
                        } else {
                            mostrarMensaje("La division de los numeros es: " + Calculadora.dividir(numero1, numero2));
                        }
                    } else {
                        mostrarMensaje("La division por cero no es valida [Math Error]");
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

