package com.vehiculo.app;

import com.vehiculo.dominio.*;

import java.util.Arrays;
import java.util.List;

public class vehiculoApp {
    public static void main(String[] args) {
        Taxi        taxi        = new Taxi("VolskWagen", "rT", 68);
        Bicicleta   bicicleta   = new Bicicleta("Trek", "Marlin 7", 20);
        Vehiculo    bici2       = new Bicicleta("GW", "Shark", 20);
        Vehiculo    carro       = new Carro("Audi", "R8", 17);
        Moto        moto        = new Moto("BMW", "GS1200", 18);
        Vehiculo    vehiculo    = new Carro("Renault", "4", 14);

        System.out.println(taxi.getCapacidad());
        taxi.bajarPasajero();
        taxi.subirPasajero(3);
        taxi.bajarPasajero();
        taxi.bajarPasajero();
        taxi.subirPasajero(2);

        List<Vehiculo> vehiculos = Arrays.asList(bicicleta, bici2, taxi, carro, moto, vehiculo);
        System.out.println("\n|--- Probando la herencia y el poliformiso en metodo acelerar ---|\n");

        for (Vehiculo v : vehiculos) {
            v.acelarar(40);
        }
    }

}
