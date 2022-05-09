package com.Desafio2.Facturacion.dominio;

import java.time.LocalDate;

public class FacturaSinIva extends Factura {
    public FacturaSinIva(long valor, String cliente, LocalDate fecha) {
        super(valor, cliente, fecha);
    }
    @Override
    public long calcularTotal() {
        return super.getValor();
    }
}
