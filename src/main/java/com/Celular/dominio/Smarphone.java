package com.Celular.dominio;

public class Smarphone extends Celular {
    private String procesador;
    private String conexionWifi;
    private String gps;
    private String sistemaOperativo;
    private byte memoriaExterna;

    public Smarphone(String procesador, String sistemaOperativo) {
        this.procesador = procesador;
        this.sistemaOperativo = sistemaOperativo;
    }

    public void instalarAplicacion (String aplicacionAInstalar) {

    }

    public void conectarseAWifi (String redAConectarse) {

    }

    public void correrAplicacion (String aplicacionAUsar) {


    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getConexionWifi() {
        return conexionWifi;
    }

    public void setConexionWifi(String conexionWifi) {
        this.conexionWifi = conexionWifi;
    }

    public String getGps() {
        return gps;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public byte getMemoriaExterna() {
        return memoriaExterna;
    }

    public void setMemoriaExterna(byte memoriaExterna) {
        this.memoriaExterna = memoriaExterna;
    }
}
