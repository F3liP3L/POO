package com.FiguraGeometrica.dominio;

public class TrianguloRectangulo extends FiguraGeometrica {
    public double base;
    public double altura;
    public double hipotenusa;

    public TrianguloRectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (this.base*this.altura)/2;
    }

    public double calcularHipotenusa() {
        return this.hipotenusa = Math.sqrt(Math.pow(this.altura, 2)+Math.pow(this.base, 2));
    }

    @Override
    public double calcularPerimetro() {
        calcularHipotenusa();
        return this.altura+this.base+this.hipotenusa;
    }

    public String toString() {
        return "Triangulo Rectangulo";
    }

}
