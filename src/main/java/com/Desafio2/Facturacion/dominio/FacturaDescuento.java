package com.Desafio2.Facturacion.dominio;

import java.time.LocalDate;

public class FacturaDescuento extends FacturaConIva {
    private short porcentajeDescuento;

    public FacturaDescuento(long valor, short valorIva, short porcentajeDescuento , String cliente, LocalDate fechaVencimiento) {
        super(valor, valorIva, cliente, fechaVencimiento);
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public long calcularDescuento(){
        return super.getValor()*this.porcentajeDescuento/100;
    }

    @Override
    public long calcularTotal() {
        return super.calcularTotal()-calcularDescuento();
    }
}
