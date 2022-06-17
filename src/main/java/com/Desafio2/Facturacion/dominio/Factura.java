package com.Desafio2.Facturacion.dominio;

import java.time.LocalDate;

public abstract class Factura {
    private long valor;
    private LocalDate fechaVencimiento;
    private String cliente;
    public Factura(long valor, String cliente, LocalDate fechaVencimiento) {
        this.valor = valor;
        this.cliente = cliente;
        this.fechaVencimiento = fechaVencimiento;
    }
    public abstract long calcularTotal();
    public long getValor() {
        return valor;
    }
    public String getCliente() {
        return cliente;
    }
    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }
}
