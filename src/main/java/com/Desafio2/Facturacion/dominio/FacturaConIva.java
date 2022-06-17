package com.Desafio2.Facturacion.dominio;

import java.time.LocalDate;

public class FacturaConIva extends Factura {
    private short valorIva;
    public FacturaConIva(long valor, short valorIva, String cliente, LocalDate fechaVencimiento) {
        super(valor, cliente, fechaVencimiento);
        this.valorIva = valorIva;
    }
    public long calcularIva() {
        return getValor()*this.valorIva/100;
    }
    @Override
    public long calcularTotal() {
        return getValor() + this.calcularIva();
    }

    @Override
    public String toString() {
        return "Factura con Iva";
    }

}
