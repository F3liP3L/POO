package com.Desafio2.FiguraGeometrica.dominio;

public class Circulo extends FiguraGeometrica {
    public double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI*Math.pow(this.radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2*Math.PI*this.radio;
    }

    @Override
    public String toString() {
        return "Circulo";
    }
}
