package com.Desafio2.Facturacion.dominio;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Facturacion {
    private static final long VALOR_SIN_IVA= 100000;
    private List<Factura> facturas;
    public Facturacion(){
        this.facturas = new ArrayList<>();
    }
    public void generarFactura(String cliente, long valor , short valorIva,LocalDate fecha) {
        Factura factura;
        if (fecha.isBefore(LocalDate.now())){
            factura = new FacturaVencida(valor, cliente, fecha);
        } else{
            if (valor>=VALOR_SIN_IVA) {
                factura = new FacturaConIva(valor, valorIva, cliente, fecha);
            } else {
                factura = new FacturaSinIva(valor, cliente, fecha);
            }
        }
        facturas.add(factura);
    }
    public long getTotalFacturacion() {
        this.facturas.forEach(factura -> System.out.println(factura.getValor()));
        return this.facturas.stream().mapToLong(Factura::calcularTotal).sum();
    }
    public Factura getFacturaMasCara () {
        Factura facturaMasCostosa = this.facturas.stream()
                .max(Comparator.comparing(factura -> factura.getValor()))
                .orElseThrow(NoSuchElementException::new);
        return facturaMasCostosa;
    }
    public List<FacturaSinIva> getFacturasSinIva () {
        return this.facturas.stream().filter(factura -> factura instanceof FacturaSinIva)
                .map(fact-> (FacturaSinIva) fact).collect(Collectors.toList());
    }

}
