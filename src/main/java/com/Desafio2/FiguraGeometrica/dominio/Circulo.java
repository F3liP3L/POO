package com.Desafio2.FiguraGeometrica.dominio;

public class Circulo extends FiguraGeometrica implements IVolumen {
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

    @Override
    public double hallarVolumen() {
        return (4/3)*Math.PI*Math.pow(this.radio, 3);
    }
}
