package com.Desafio2.FiguraGeometrica.app;

import com.Desafio2.FiguraGeometrica.dominio.*;

import java.util.ArrayList;
import java.util.List;

public class FiguraGeometricaApp {
    public static void main(String[] args) {

        Circulo circulo = new Circulo(2);
        Cuadrado cuadrado = new Cuadrado(5);
        Rectangulo rectangulo = new Rectangulo(4, 2);
        TrianguloRectangulo trianguloRectangulo = new TrianguloRectangulo(4, 10);
        Rombo rombo = new Rombo(12, 16);
        PoligonoRegular poligonoRegular = new PoligonoRegular(1, 12);


        List<FiguraGeometrica> figuras = new ArrayList<>();
        figuras.add(circulo);
        figuras.add(cuadrado);
        figuras.add(rectangulo);
        figuras.add(trianguloRectangulo);
        figuras.add(rombo);
        figuras.add(poligonoRegular);

        figuras.forEach(figurasGeo -> {
            System.out.println("El area del " + figurasGeo + " es: " + figurasGeo.calcularArea());
            System.out.println("El perimetro del " + figurasGeo + " es: " + figurasGeo.calcularPerimetro());
        });

    }
}
