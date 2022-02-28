package com.Dispensador.app;

import com.Dispensador.dominio.Agua;
import com.Dispensador.dominio.DispensadorDeAgua;

public class DispensadorApp {
    public static void main(String[] args) {

        Agua cristal = new Agua("Cristal");
        Agua h20 = new Agua("H20");
        DispensadorDeAgua kelly = new DispensadorDeAgua("Kelly", 15.5);

        kelly.agua = cristal;

        kelly.llenar();

        kelly.dispensar(10, false);// true para fria y false para caliente

        kelly.cambiarAgua(h20);
        kelly.dispensar(12, true);

    }
}
