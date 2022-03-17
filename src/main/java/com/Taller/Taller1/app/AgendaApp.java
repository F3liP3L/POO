package com.Taller.Taller1.app;

import com.Taller.Taller1.dominio.Agenda;
import com.Taller.Taller1.dominio.Contacto;
import java.util.List;

public class AgendaApp {
    public static void main(String[] args) {

        Agenda miAgenda = new Agenda();

        miAgenda.agregar("Paolo", "Victoria", 3201758420l);
        miAgenda.agregar("Arturo", "Vidal", 3216975530l);
        miAgenda.agregar("Frederich", "Nietzche", 3225475920l);
        miAgenda.agregar("Frederich", "Walter", 3227875920l);
        miAgenda.agregar("Frederich", "Cardenad", 3225647810l);
        miAgenda.agregar("Eren", "Jeager", 3156945013l);
        miAgenda.agregar("Carmen", "De Mairena", 3124205010l);
        miAgenda.agregar("Leo", "Watch", 31782327070l);
        miAgenda.agregar("Diego", "Victoria", 3101614100l);

        miAgenda.ordenarAlfabeticamente();

        System.out.println("\n----------------------------------\n");

        miAgenda.eliminar(3225475920l);
        miAgenda.editar(3216975530l, 3147254180l);

        System.out.println("\n------- BUSCAR EL NUEVO NUMERO --------\n");
        miAgenda.buscarPorCelularConFilter(3147254180l);
        System.out.println("\n---------------------------------------\n");

        /* if (c != null) {
            System.out.println("Contacto buscado: " + c.getNombre() + " " + c.getApellido());
        } else {
            System.out.println("Contacto no encontrado");
        }
        */

        miAgenda.buscarPorApellido("victoria");
        miAgenda.buscarPorNombre("frederich");
        miAgenda.buscarPorApellido("zuñiga");

        System.out.println("\n---------------DE NUEVO MI AGENDA ORDENADA---------------\n");
        miAgenda.ordenarAlfabeticamente();

    }
}
