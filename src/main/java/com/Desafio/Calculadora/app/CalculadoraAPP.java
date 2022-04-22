package com.Desafio.Calculadora.app;

import com.Desafio.Calculadora.dominio.Calculadora;

import javax.swing.*;
import java.util.*;

public class CalculadoraAPP {


    public static ImageIcon iconoSecundario = new ImageIcon(Objects.requireNonNull(CalculadoraAPP.class.getResource("/imagenes/calculadora.png")));
    public static ImageIcon iconoPrincipal = new ImageIcon(Objects.requireNonNull(CalculadoraAPP.class.getResource("/imagenes/icono.gif")));
//    public static ImageIcon iconoNumero = new ImageIcon(Objects.requireNonNull(CalculadoraAPP.class.getResource("/imagenes/Icono-numero.png")));

    public static final JCheckBox REDONDEAR = new JCheckBox("Redondear"); // Boton de redondear.

    public static final Object[] OPCIONES = Arrays.asList("Sumar", "Resta", "Multiplicar", "Division", REDONDEAR).toArray();

    public static final int CERRAR = -1, SUMAR = 0 , RESTAR = 1 , MULTIPLICAR = 2 , DIVIDIR = 3;

    public static final String TITULO = "Calculadora";

    public static void main(String[] args) {

        while (true) {

          int opcionElegida = JOptionPane.showOptionDialog(null, "Elija una opcion: ", TITULO,
                  0, 0, iconoPrincipal, OPCIONES, 0);

          if (opcionElegida == CERRAR) { // Salida de la ventana principal
              System.exit(0);
          }

            List<Double> numerosAOperar = new ArrayList<>();
            boolean pudoCastear = true;
            boolean dividioCorrectamente = true;
            double resultado = 0;
            double resultadoDiv = 0;

            do {
                try {
                    int opcion = 0;
                    while ((opcion==0)) {
                        double numero = Double.parseDouble((String) JOptionPane.showInputDialog(null,
                                "Ingrese un numero", TITULO, 0, iconoSecundario, null, 0));
                        pudoCastear = true;
                        opcion = JOptionPane.showConfirmDialog(null, "Desea ingresar un nuevo numero");
                        numerosAOperar.add(numero);
                    }
                } catch (NumberFormatException e) {
                    pudoCastear = false;
                }
            } while (!pudoCastear);

            /* Solo para dividir */

//            do {
//                try {
//                    int opcion = 0;
//                    while ((opcion==0)) {
//                        double numeroDiv = Double.parseDouble((String) JOptionPane.showInputDialog(null,
//                                "Ingrese un numero", TITULO, 0, iconoSecundario, null, 0));
//                        pudoCastear = true;
//                        opcion = JOptionPane.showConfirmDialog(null, "Desea ingresar un nuevo numero");
//                        if (numeroDiv != 0) {
//                            numerosAOperar.add(numeroDiv);
//                        } else {
//                            mostrarMensaje("NO SE PUEDEN AGREGAR CEROS");
//                        }
//                    }
//                } catch (NumberFormatException e) {
//                    pudoCastear = false;
//                }
//            } while (!pudoCastear);




            /* Queda Pendiente arreglar la division de varios numeros o */

            switch (opcionElegida) {
                case SUMAR: {
                    resultado = Calculadora.sumar(numerosAOperar, REDONDEAR.isSelected());
                    break;
                }
                case RESTAR: {
                    resultado = Calculadora.restar(numerosAOperar, REDONDEAR.isSelected());
                    break;
                }
                case MULTIPLICAR: {
                    resultado = Calculadora.multiplicar(numerosAOperar, REDONDEAR.isSelected());
                    break;
                }
                case DIVIDIR: {
                    resultado = Calculadora.dividir(numerosAOperar, REDONDEAR.isSelected());
                    break;
                }
            }
                 mostrarMensaje("El resultado es: " + resultado);
            }
          }

        public static void mostrarMensaje (String mensaje) {
            JOptionPane.showMessageDialog(null, mensaje, TITULO, JOptionPane.QUESTION_MESSAGE);
    }
}




