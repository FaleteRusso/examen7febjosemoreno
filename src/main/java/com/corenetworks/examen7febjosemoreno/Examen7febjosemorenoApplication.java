package com.corenetworks.examen7febjosemoreno;

import com.corenetworks.examen7febjosemoreno.modelo.ejercicio1.Factura;
import com.corenetworks.examen7febjosemoreno.modelo.ejercicio1.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Examen7febjosemorenoApplication implements CommandLineRunner {
	@Autowired
	Factura f1;
	public static void main(String[] args) {
		SpringApplication.run(Examen7febjosemorenoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


		List<Producto> productos = new ArrayList<>();
		productos.add(new Producto("Queso curado", 10.0));
		productos.add(new Producto("Queso Oveja", 20.0));
		productos.add(new Producto("Queso Tadeu", 33.0));
		f1.setProductos(productos);
		System.out.println( "Total factura = "+f1.calcularTotalFactura());
	}
}


