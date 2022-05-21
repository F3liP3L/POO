package com.interfaces2.app;

import com.interfaces2.dominio.*;

public class AppAntivirus {
    public static void main(String[] args) {
        Antivirus norton = new Antivirus();
        DocumentoPDF pdf = new DocumentoPDF("Tesis.pdf", true);
        DocumentoWord word = new DocumentoWord("Carta.docx", 2);
        Aplicacion app = new Aplicacion("los_sims.jar");
        Imagen img = new Imagen("Goku.xml");
        Imagen img2 = new Imagen("JuanHot.PNG");

        norton.agregar(app);
        norton.agregar(pdf);
        norton.agregar(word);
        norton.agregar(img);
        norton.agregar(img2);

        System.out.println("\t -----------  TEXTANDO  -----------\n");
        String nombreArchivo = "perro.img";
        boolean verificar = nombreArchivo.contains(".img");
        System.out.println("Es verdad que " + nombreArchivo + " contiene un img: " + verificar);
        System.out.println("\t -------------------------------------");

        norton.escanear();

    }
}
