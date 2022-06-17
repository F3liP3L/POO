package com.Desafio2.FiguraGeometrica.dominio;

public class PoligonoRegular extends FiguraGeometrica {

    public int numeroLados;
    public double lado;
    public double apotema;
    public double angulo = 360;
    public final double PI = Math.PI;

    public PoligonoRegular(int numeroLados, double lado) {
        this.numeroLados = numeroLados;
        this.lado = lado;
    }

    public double hallarApotema(){
        this.angulo = (this.angulo/numeroLados)/2;
        this.apotema = ((this.lado)/(2*(Math.tan(angulo*(PI/180)))));
        return apotema;
    }

    @Override
    public double calcularArea() {
        return ((calcularPerimetro()*hallarApotema())/2);
    }

    @Override
    public double calcularPerimetro() {
        return this.numeroLados*this.lado;
    }

    public String toString() {
        return "Poligono Regular de " + this.numeroLados + " lados";
    }

}
