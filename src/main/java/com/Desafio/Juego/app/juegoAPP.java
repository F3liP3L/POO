package com.Desafio.Juego.app;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class juegoAPP {

    public static final ImageIcon ICONO_MENU = new ImageIcon(Objects.requireNonNull(juegoAPP.class.getResource("/imagenes/Menu.png")));
    public static final ImageIcon ICONO_INSTRUCCIONES = new ImageIcon(Objects.requireNonNull(juegoAPP.class.getResource("/imagenes/iconoInstrucciones.png")));
    public static final ImageIcon ICONO_RESULTADO = new ImageIcon(Objects.requireNonNull(juegoAPP.class.getResource("/imagenes/iconoResultado.png")));

    public static final ImageIcon VICTORIA = new ImageIcon(Objects.requireNonNull(juegoAPP.class.getResource("/imagenes/victoria.png")));
    public static final ImageIcon DERROTA = new ImageIcon(Objects.requireNonNull(juegoAPP.class.getResource("/imagenes/derrota.png")));
    public static final ImageIcon EMPATE = new ImageIcon(Objects.requireNonNull(juegoAPP.class.getResource("/imagenes/empate.png")));

    public static final ImageIcon GOKU = new ImageIcon(Objects.requireNonNull(juegoAPP.class.getResource("/imagenes/Goku.jpg")));
    public static final ImageIcon ITACHI = new ImageIcon(Objects.requireNonNull(juegoAPP.class.getResource("/imagenes/Itachi.jpg")));
    public static final ImageIcon PICCOLO = new ImageIcon(Objects.requireNonNull(juegoAPP.class.getResource("/imagenes/Piccolo.jpg")));

    public static final List<ImageIcon> IMAGEN_PERSONAJES = Arrays.asList(GOKU, ITACHI, PICCOLO);

    public static final Object[] OPCIONES = Arrays.asList("Ver instrucciones" , "Jugar" , "Resultados").toArray();
    public static final Object[] PERSONAJES = Arrays.asList("Goku","Itachi", "Piccolo").toArray();

    public static int empate = 0, victoria = 0, derrota = 0;

    public static final int CERRAR = -1, INSTRUCCIONES = 0, JUGAR = 1, RESULTADOS = 2;

    public static final String TITULO = "Juego";

    public static void main(String[] args) {

        while (true) {
                Random random = new Random();
                List<String> personajes = Arrays.asList("Goku","Itachi","Piccolo");
                int computador = random.nextInt(personajes.size());
                String personajeComputador = personajes.get(computador);

                int opcionElegida = JOptionPane.showOptionDialog(null, "Elija una opcion", TITULO,
                    0,0,ICONO_MENU, OPCIONES, null);

                /* 0 --- Seria goku
                   1 --- Seria Itachi
                   2 --- Seria Piccolo */

                if (opcionElegida==CERRAR){
                    System.exit(0);
                }
                    switch (opcionElegida) {
                        case INSTRUCCIONES: {
                            mostrarMensaje("Elige una de las 3 opciones [Goku, Itachi, YutaGOD]\n" +
                                " * Itachi vence a Goku \n" +
                                " * Goku vence a Piccolo \n" +
                                " * Piccolo vence a Itachi." , ICONO_INSTRUCCIONES);
                            break;
                    }
                        case JUGAR: {
                            String jugadaUsuario = (String) JOptionPane.showInputDialog(null, "Elige una de las opciones",
                                    TITULO, 0, ICONO_MENU, PERSONAJES, null);
                            if (jugadaUsuario.equals("Goku")&&(personajeComputador=="Piccolo")||(jugadaUsuario.equals("Itachi")&&(personajeComputador=="Goku"))||jugadaUsuario.equals("Piccolo")&&(personajeComputador=="Itachi")) {
                                victoria++;
                                mostrarMensaje("Felicidades! :] ", VICTORIA);
                                mostrarMensaje("La maquina eligio a " + personajeComputador,IMAGEN_PERSONAJES.get(computador));
                            } else if (jugadaUsuario.equals("Goku")&&(personajeComputador=="Itachi")||jugadaUsuario.equals("Itachi")&&(personajeComputador=="Piccolo")||jugadaUsuario.equals("Piccolo")&&(personajeComputador=="Goku")) {
                                derrota++;
                                mostrarMensaje("Has Perdido :[ " , DERROTA);
                                mostrarMensaje("La maquina eligio a " + personajeComputador,IMAGEN_PERSONAJES.get(computador));
                            } else {
                                empate++;
                                mostrarMensaje("EMPATE!!! :| ", EMPATE);
                                mostrarMensaje("ambos eligieron a " + personajeComputador,IMAGEN_PERSONAJES.get(computador));
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
