package com.interfaces.dominio;

public class CelularAvanzado extends CelularIntermedio implements Desbloqueable {
    private String rostroCorrecto;

    public CelularAvanzado(String marca, Persona propietario) {
        super(marca, propietario);
        this.rostroCorrecto = propietario.getRostro();
    }

    @Override
    public boolean desbloquear(Persona persona) {
        return rostroCorrecto.equals(persona.getRostro()) || super.desbloquear(persona);
    }
}
