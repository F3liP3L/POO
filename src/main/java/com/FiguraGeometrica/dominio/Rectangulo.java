package com.FiguraGeometrica.dominio;

public class Rectangulo extends FiguraGeometrica {
    public double base;
    public double altura;

    public Rectangulo (double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return this.base*this.altura;
    }

    @Override
    public double calcularPerimetro() {
        return (2*this.base + 2*this.altura);
    }

    public String toString() {
        return "Rectangulo";
    }

}
