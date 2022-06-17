package com.Biblioteca.dominio;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Biblioteca {
    private List<Recurso> recursos;

    public Biblioteca() {
        this.recursos = new ArrayList<>();
    }
    public void addRecurso(Recurso recurso) {
        if (!perteneceABiblioteca(recurso.getNombre())) {
            recursos.add(recurso);
        }
    }

    public boolean prestarRecurso (Recurso recurso) {
        boolean seEncuentra = perteneceABiblioteca(recurso.getNombre());
            if(recurso instanceof IPrestar && seEncuentra) {
                if(!recurso.isPrestado()) {
                    ((IPrestar) recurso).prestar();
                    System.out.println("El recurso " + recurso.getNombre() + " ha sido prestado.");
                    return true;
                } else {
                    System.out.println("El recurso " + recurso.getNombre() + " ya ha sido prestado.");
                    return false;
                }
            } else {
                System.out.println("El recurso no es prestable o no se encuentra en la biblioteca");
                return false;
        }
    }

    public boolean devolverRecurso (Recurso recursoADevolver) {
        boolean seEncuentra = perteneceABiblioteca(recursoADevolver.getNombre());
        if(recursoADevolver instanceof IPrestar && seEncuentra) {
            if(recursoADevolver.isPrestado()) {
                ((IPrestar) recursoADevolver).devolver();
                System.out.println("El recurso " + recursoADevolver.getNombre() + " ha sido devuelto correctamente");
                return true;
            } else {
                System.out.println("El recurso " + recursoADevolver.getNombre() + " no ha sido prestado.");
                return false;
            }
        } else {
            System.out.println("El recurso no es prestable o no se encuentra en la biblioteca");
            return false;
        }
    }

    public boolean fotocopiarRecursos (Recurso recursoAFotocopiar) {
        boolean seEncuentra = perteneceABiblioteca(recursoAFotocopiar.getNombre());
        if(recursoAFotocopiar instanceof ICopiar && seEncuentra) {
            if (!recursoAFotocopiar.isPrestado()) {
                ((ICopiar) recursoAFotocopiar).fotocopiar();
                System.out.println("El recurso " + recursoAFotocopiar.getNombre() + " ha sido fotocopiado, copias: " + recursoAFotocopiar.getCopias());
                return true;
            } else {
                System.out.println("El recurso " + recursoAFotocopiar.getNombre() + " se encuentra prestado y no se puede fotocopiar.");
                return false;
            }
        } else {
            System.out.println("El recurso no es fotocopiable o no se encuentra en la biblioteca.");
            return false;
        }
    }

    public void listarPrestados() {
        this.recursos.stream().filter(Recurso::isPrestado)
                .forEach(recurso -> System.out.println(recurso.getNombre() + " -- " + recurso.getCopias()));
    }

    public void listarCopiasPorRecurso() {
        this.recursos.sort(Comparator.comparing(Recurso::getCopias).reversed().thenComparing(Recurso::getNombre));
        this.recursos.stream().forEach(recurso -> System.out.println(recurso.getNombre()
                + " se ha fotocopiado " + recurso.getCopias()));
    }

    private boolean perteneceABiblioteca (String nombre) {
        Recurso recurso = this.recursos.stream().filter(recurso1 -> recurso1.getNombre().equalsIgnoreCase(nombre)).findAny().orElse(null);
        if (recurso!=null) {
            return true;
        } else {
            return false;
        }
    }


}
