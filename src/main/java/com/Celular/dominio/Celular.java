package com.Celular.dominio;

import com.Taller.Taller1.dominio.Contacto;

public class Celular {

    private String empresa;
    private long numero;
    private boolean estado;
    private Bateria bateria;

    /* Esto se ha realizado a nivel de ejemplo. hacerlo mas cache */

    public void encender () {
        this.estado = true;
    }

    public void apagar () {
        this.estado = false;
    }

    public void enviarMensajes (String mensaje, Contacto contactoAEnviar) {

    }

    public void llamar (String contactoALlamar) {


    }


}
