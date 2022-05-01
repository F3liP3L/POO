package com.FiguraGeometrica.dominio;

public class Rombo extends TrianguloRectangulo {
    public double diametro;

    public Rombo(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double calcularArea() {
        return super.calcularArea()*4;
    }

    @Override
    public double calcularPerimetro() {
        return (calcularHipotenusa()*4);
    }

    public String toString() {
        return "Rombo";
    }

}
