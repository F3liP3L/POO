package com.Desafio.Calculadora.app;

import com.Desafio.Calculadora.dominio.Calculadora;

import javax.swing.*;
import java.util.*;

public class CalculadoraAPP {


    public static ImageIcon iconoSecundario = new ImageIcon(Objects.requireNonNull(CalculadoraAPP.class.getResource("/imagenes/calculadora.png")));
    public static ImageIcon iconoPrincipal = new ImageIcon(Objects.requireNonNull(CalculadoraAPP.class.getResource("/imagenes/icono.gif")));

    public static final JCheckBox REDONDEAR = new JCheckBox("Redondear"); // Boton de redondear.

    public static final Object[] OPCIONES = Arrays.asList("Sumar", "Resta", "Multiplicar", "Division", REDONDEAR).toArray();

    public static final int CERRAR = -1;
    public static final int SUMAR = 0;
    public static final int RESTAR = 1;
    public static final int MULTIPLICAR = 2;
    public static final int DIVIDIR = 3;

    public static final String TITULO = "Calculadora";

    public static void main(String[] args) {

        while (true) {

          int opcionElegida = JOptionPane.showOptionDialog(null, "Elija una opcion: ", TITULO,
                  0, 0, iconoPrincipal, OPCIONES, 0);

          if (opcionElegida == CERRAR) { // Salida de la ventana principal
              System.exit(0);
          }

            List<Double> numerosAOperar = new ArrayList<>();
            boolean pudoCastear;
            boolean respuesta = true;
            boolean dividioCorrectamente = true;
            double resultado = 0;
            int rango = 0;

            do {
                try {
                    rango = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numeros a Operar: "));
                    for (int i = 0; i<rango; i++) {
                        double numero = Double.parseDouble((String) JOptionPane.showInputDialog(null,
                                "Ingrese un numero", TITULO, 0, iconoSecundario, null, 0));
                        numerosAOperar.add(numero);
                    }
//                    respuesta = numerosAOperar.stream().anyMatch(nro ->nro==0);
                    pudoCastear = true;
                } catch (Exception e) {
                    pudoCastear = false;
              }
            } while ((!pudoCastear||rango<=0));

            /* Queda Pendiente arreglar la division de varios numeros o */

            switch (opcionElegida) {
//                case CERRAR:{
//                    System.exit(0);
//                    break;
//                }
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
                    System.out.println(resultado = Calculadora.dividir(numerosAOperar, REDONDEAR.isSelected()));
                    break;
                }
//                default:
//                    JOptionPane.showMessageDialog(null, "Opcion invalida", "ERROR",
//                            JOptionPane.ERROR_MESSAGE);
            }
            mostrarMensaje("El resultado es: " + resultado);
            }
          }

        public static void mostrarMensaje (String mensaje) {
            JOptionPane.showMessageDialog(null, mensaje, TITULO, JOptionPane.QUESTION_MESSAGE);
    }
}




