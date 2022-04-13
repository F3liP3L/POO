package com.Desafio.Juego.app;

import javax.swing.*;
import java.util.Arrays;
import java.util.Random;

public class juegoAPP {

    public static final ImageIcon ICONO_MENU = new ImageIcon(juegoAPP.class.getResource("/imagenes/Menu.png"));
    public static final ImageIcon ICONO_INSTRUCCIONES = new ImageIcon(juegoAPP.class.getResource("/imagenes/iconoInstrucciones.png"));
    public static final ImageIcon ICONO_RESULTADO = new ImageIcon(juegoAPP.class.getResource("/imagenes/iconoResultado.png"));

    public static final ImageIcon VICTORIA = new ImageIcon(juegoAPP.class.getResource("/imagenes/victoria.png"));
    public static final ImageIcon DERROTA = new ImageIcon(juegoAPP.class.getResource("/imagenes/derrota.png"));
    public static final ImageIcon EMPATE = new ImageIcon(juegoAPP.class.getResource("/imagenes/empate.png"));

    public static final Object[] OPCIONES = Arrays.asList("Ver instrucciones" , "Jugar" , "Resultados").toArray();
    public static final Object[] PERSONAJES = Arrays.asList("Goku","Itachi", "YutaGOD").toArray();

    public static int empate = 0;
    public static int victoria = 0;
    public static int derrota = 0;

    public static final int CERRAR = -1;
    public static final int INSTRUCCIONES = 0;
    public static final int JUGAR = 1;
    public static final int RESULTADOS = 2;

    public static final String TITULO = "Juego";

    public static void main(String[] args) {

        while (true) {
                Random random = new Random();

                int opcionElegida = JOptionPane.showOptionDialog(null, "Elija una opcion", TITULO,
                    0,0,ICONO_MENU, OPCIONES, null);

                int computador = random.nextInt(3 - 1) + 1;
                /* 1 --- Seria goku
                   2 --- Seria Itachi
                   3 --- Seria YutaGOD */
                if (opcionElegida==CERRAR){
                    System.exit(0);
                }
                    switch (opcionElegida) {
                        case INSTRUCCIONES: {
                            mostrarMensaje("Elige una de las 3 opciones [Goku, Itachi, YutaGOD]\n" +
                                " * Itachi vence a Goku \n" +
                                " * Goku vence a YutaGOD \n" +
                                " * YutaGOD vence a Itachi." , ICONO_INSTRUCCIONES);
                            break;
                    }
                        case JUGAR: {
                            String jugadaUsuario = (String) JOptionPane.showInputDialog(null, "Elige una de las opciones",
                                    TITULO, 0, ICONO_MENU, PERSONAJES, null);
                            if (jugadaUsuario.equals("Goku")&&(computador==3)||jugadaUsuario.equals("Itachi")&&(computador==1)||(jugadaUsuario.equals("YutaGOD")&&computador==2)) {
                                victoria++;
                                mostrarMensaje("Felicidades! :] ", VICTORIA);
                            } else if (jugadaUsuario.equals("Goku")&&(computador==2)||jugadaUsuario.equals("Itachi")&&(computador==3)||jugadaUsuario.equals("YutaGOD")&&(computador==1)) {
                                derrota++;
                                mostrarMensaje("Has Perdido :[ " , DERROTA);
                            } else {
                                empate++;
                                mostrarMensaje("EMPATE!!! :| ", EMPATE);
                            }
                        break;
                    }
                        case RESULTADOS:
                            mostrarMensaje("RESULTADOS:\n\nTu: has ganado " + victoria + "\nLa computadora: ha ganado "+ derrota
                                    + "\nHan quedado en empate: " + empate, ICONO_RESULTADO);
                            break;
                }
        }
    }
            public static void mostrarMensaje (String mensaje , ImageIcon icono) {
        JOptionPane.showMessageDialog(null, mensaje, TITULO, 0, icono);
    }
}
