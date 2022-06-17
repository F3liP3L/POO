package com.interfaces2.dominio;

public class DocumentoPDF extends Documento implements Viruseable {
    private boolean protegido;

    public DocumentoPDF(String nombre, boolean protegido) {
        super(nombre);
        this.protegido = protegido;
    }

    @Override
    public boolean tieneVirus() {
        return !protegido;
    }
}
