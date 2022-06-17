package com.oftalmologo.app;

import com.oftalmologo.dominio.Oftalmologo;
import com.oftalmologo.dominio.Paciente;
import com.oftalmologo.dominio.PacienteApto;
import com.oftalmologo.dominio.PacienteNoApto;

public class OftalmologoApp {
    public static void main(String[] args) {


        Oftalmologo oftalmologo = new Oftalmologo("Oftamologia el 12");

        oftalmologo.revisarPaciente("Pedro", 23);
        oftalmologo.revisarPaciente("Jaime", 45);
        oftalmologo.revisarPaciente("Juliana" , 21);
        oftalmologo.revisarPaciente("Juan", 19);
        oftalmologo.revisarPaciente("Laura", 32);
        oftalmologo.revisarPaciente("John", 78);

        oftalmologo.getPacientesAOperar().forEach(pacienteApto -> System.out.println(pacienteApto.getNombre() + " -- " + pacienteApto.getEdad()));
        oftalmologo.operarPaciente();
        System.out.println("\t Verificando Pacientes.");
        if(oftalmologo.getPacientesAOperar()==null||oftalmologo.getPacientesAOperar().size()>=0) {
            System.out.println("Ya no queda ningun paciente a Operar.");
        }
        oftalmologo.getPacientesAOperar().forEach(pacienteApto -> System.out.println(pacienteApto.getNombre() + " -- " + pacienteApto.getEdad()));

        oftalmologo.revisarPaciente("Sara", 22);
        oftalmologo.getPacientesAOperar().forEach(pacienteApto -> System.out.println(pacienteApto.getNombre() + " -- " + pacienteApto.getEdad()));


    }
}
