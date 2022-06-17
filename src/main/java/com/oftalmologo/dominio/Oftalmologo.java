package com.oftalmologo.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Oftalmologo {
    private String nombre;
    private List<Paciente> pacientes;

    public Oftalmologo (String nombre) {
        this.pacientes = new ArrayList<>();
        this.nombre = nombre;
    }

        public Paciente revisarPaciente(String nombre, int edad){
            Paciente pacienteOperable;
            if (nombre.toLowerCase(Locale.ROOT).contains("a") && (edad < 40)) {
                pacienteOperable = new PacienteApto(nombre, edad, true);
                System.out.println("El paciente " + pacienteOperable.getNombre() + " cumple los requisitos para operararse.");
            } else if (nombre.toLowerCase(Locale.ROOT).contains("a")) {
                pacienteOperable = new PacienteNoApto(nombre, edad, true);
                System.out.println("El paciente " + pacienteOperable.getNombre() + " necesita cirugia pero no cumple los requisitos.");
            } else {
                pacienteOperable = new PacienteNoApto(nombre, edad, false);
                System.out.println("El paciente no necesita cirugia..");
            }
            this.pacientes.add(pacienteOperable);
            return pacienteOperable;
        }
        public void operarPaciente () {
            getPacientesAOperar().forEach(PacienteApto::operar);
        }
        
        public List<PacienteApto> getPacientesAOperar () {
            return this.pacientes.stream()
                    .filter(paciente -> paciente instanceof PacienteApto && paciente.isNecesitaCirugia())
                    .map(pac -> (PacienteApto) pac).collect(Collectors.toList());
        }
}
