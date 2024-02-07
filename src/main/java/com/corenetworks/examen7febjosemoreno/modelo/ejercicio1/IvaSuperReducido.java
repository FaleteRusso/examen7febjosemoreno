package com.corenetworks.examen7febjosemoreno.modelo.ejercicio1;


import org.springframework.stereotype.Component;


@Component("isr")
public class IvaSuperReducido implements IImpuesto{
    @Override
    public double calcularImpuesto(Producto p1) {
        return p1.getPrecio()*0.04 ;
    }
}
