package com.corenetworks.examen7febjosemoreno.modelo.ejercicio1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Component
public class Factura {
    @Autowired
    @Qualifier("isr")
    private IImpuesto impuesto;
    private List<Producto>productos;
    public double calcularTotalFactura(){
        double factura = 0;
        for (Producto elemento : productos) {
                factura += elemento.getPrecio()+impuesto.calcularImpuesto(elemento);
            }
        return factura;
        }
}
