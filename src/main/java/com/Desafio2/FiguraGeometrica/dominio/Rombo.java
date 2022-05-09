package com.Desafio2.FiguraGeometrica.dominio;

public class Rombo extends TrianguloRectangulo {
    public double diametroMenor;
    public double diametroMayor;

    public Rombo(double diametroMenor, double diametroMayor) {
        super(diametroMenor/2, diametroMayor/2);
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
