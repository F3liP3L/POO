package com.interfaces.app;

import com.interfaces.dominio.Celular;
import com.interfaces.dominio.CelularAvanzado;
import com.interfaces.dominio.CelularBasico;
import com.interfaces.dominio.CelularSemiavanzado;
import com.interfaces.dominio.Desbloqueable;
import com.interfaces.dominio.Persona;

import java.util.Arrays;
import java.util.List;

public class AppInterface {
    public static void main(String[] args) {
        Persona alejandro = new Persona("Alejandro", "ASDF", "hash123", 9876, "chontaduro69");
        Persona diego = new Persona("Diego", "lok", "hash198", 3324, "chontaduro69");
        Persona marcela = new Persona("Marcela", "jdp", "hash222", 0432, "papaya52");

        CelularAvanzado iphone13 = new CelularAvanzado("Apple iPhone 13", alejandro);
        CelularSemiavanzado huaweiP20 = new CelularSemiavanzado("Huawei P20 Lite", diego);
        CelularBasico kalley = new CelularBasico("Kalley Chontaduro", marcela);

        desbloquear(Arrays.asList(iphone13, huaweiP20, kalley), diego);
    }

    public static void desbloquear(List<Desbloqueable> celulares, Persona persona) {
        celulares.forEach(cel -> {
            String marca = "Generica";

            if (cel instanceof Celular) {
                marca = ((Celular) cel).getMarca();
            }

            boolean pudoDesbloquear = cel.desbloquear(persona);
            System.out.println(persona.getNombre() + " pudo desbloquear " + marca + ": " + pudoDesbloquear);
        });
    }
}
