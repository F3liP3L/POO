package com.interfaces2.dominio;

public class DocumentoWord extends Documento implements Viruseable {
    private int version;

    public DocumentoWord(String nombre, int version) {
        super(nombre);
        this.version = version;
    }

    @Override
    public boolean tieneVirus() {
        return this.version <= 3;
    }
}
