package com.Biblioteca.app;


import com.Biblioteca.dominio.*;

import java.time.LocalDate;

public class BibliotecaAPP {
    public static void main(String[] args) {

        Libro libro = new Libro("12 Reglas Para Vivir");
        Libro zaratrusta = new Libro("Asi hablo Zaratrusta");
        Revista revista = new Revista("Rolling Stones");
        Tesis tesis = new Tesis("Aplicaciones de la IA en los autos");
        Comic batman = new Comic("Batman 2000", "Dc comics");
        Comic deadpool = new Comic("DeadPool", "marVel");
        Ensayo ensayo = new Ensayo("Peligros Eticos/Morales de la tecnologia.");
        Patente patente = new Patente("Patente Mercatil 1867");


        Archivo archivo = new Archivo("Inventario", LocalDate.of(2017, 11, 12));

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.addRecurso(libro);
        biblioteca.addRecurso(revista);
        biblioteca.addRecurso(tesis);
        biblioteca.addRecurso(zaratrusta);
        biblioteca.addRecurso(patente);

        biblioteca.prestarRecurso(revista);
        biblioteca.prestarRecurso(libro);

        biblioteca.prestarRecurso(revista);
        biblioteca.devolverRecurso(revista);
        biblioteca.devolverRecurso(libro);
        System.out.println("Volviendo a pedir prestado.\n");
        biblioteca.prestarRecurso(libro);
        biblioteca.prestarRecurso(tesis);
        biblioteca.prestarRecurso(revista);
        biblioteca.prestarRecurso(libro);
        System.out.println("Usando ahora fotocopiadora\n");
        biblioteca.fotocopiarRecursos(revista);
        biblioteca.fotocopiarRecursos(tesis);
        biblioteca.fotocopiarRecursos(zaratrusta);
        biblioteca.fotocopiarRecursos(zaratrusta);
        System.out.println("-------------\n");
        System.out.println(" ----- Recursos prestados en la biblioteca ------\n");
        biblioteca.listarPrestados();
        System.out.println("------ Recursos Listados por cantidad de Copias ------\n");
        biblioteca.listarCopiasPorRecurso();

        System.out.println("\t---- Probando nuevos recursos ----\n");
        biblioteca.addRecurso(batman);
        biblioteca.fotocopiarRecursos(batman);
        biblioteca.fotocopiarRecursos(ensayo);
        biblioteca.fotocopiarRecursos(deadpool);
        biblioteca.addRecurso(archivo);
        biblioteca.fotocopiarRecursos(archivo);

        System.out.println("\t--- Listas de recursos en la biblioteca ---\n");
        biblioteca.listarCopiasPorRecurso();


    }
}
