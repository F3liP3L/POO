package com.Desafio2.Facturacion.dominio;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class FacturaVencida extends Factura {
    private static final int VALOR_DIA_VENCIDO = 10000;
    public FacturaVencida(long valor, String cliente, LocalDate fecha) {
        super(valor, cliente, fecha);
    }

    @Override
    public long calcularTotal() {
        return getValor() + (long) this.getDiasVencidos() *VALOR_DIA_VENCIDO;
    }

    public int getDiasVencidos() {
        LocalDate fechaActual = LocalDate.now();
        //System.out.println("Dias de diferencia: " + ChronoUnit.DAYS.between(getFechaVencimiento(), fechaActual));
        return (int) ChronoUnit.DAYS.between(getFechaVencimiento(), fechaActual);
    }
}
