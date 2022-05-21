package com.interfaces2.dominio;

import java.util.ArrayList;
import java.util.List;

public class Antivirus {
    private List<Viruseable> archivos;

    public Antivirus() {
        this.archivos = new ArrayList<>();
    }

    public void agregar(Viruseable arch) {
        this.archivos.add(arch);
    }

    public void escanear() {
        int nroVirus = 0;
        System.out.println("Escaneando en busca de virus!");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Se interrumpió el antivirus");
        }

        for (Viruseable arc : this.archivos) {
            if (arc.tieneVirus()) {
                nroVirus++;
                System.out.println(arc.getNombre() + " tiene virus! ☠");
                try {
                    Thread.sleep(3500);
                } catch (InterruptedException e) {
                    System.out.println("Se interrumpió el antivirus");
                }
            }
        }
        System.out.println("Se encontraron " + nroVirus + " virus.");
    }
}
