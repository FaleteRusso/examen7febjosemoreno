package com.corenetworks.examen7febjosemoreno.modelo.ejercicio1;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Producto {
    private String nombre;
    private double precio;


}
