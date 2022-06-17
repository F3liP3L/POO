package com.Desafio2.FiguraGeometrica.dominio;

public class Cuadrado extends FiguraGeometrica {
    public double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return Math.pow(this.lado, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 4*this.lado;
    }

    @Override
    public String toString() {
        return "Cuadrado";
    }

}
