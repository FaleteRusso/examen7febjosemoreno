package com.corenetworks.examen7febjosemoreno.modelo.ejercicio1;


import org.springframework.stereotype.Component;


@Component("ig")
public class IvaGeneral implements IImpuesto{
    @Override
    public double calcularImpuesto(Producto p1) {
        return(p1.getPrecio()*0.21) ;
    }
}
