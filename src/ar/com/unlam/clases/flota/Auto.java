package ar.com.unlam.clases.flota;

import java.util.HashSet;

import ar.com.unlam.clases.persona.Pasajero;

public class Auto extends Vehiculo{
	
	HashSet<Pasajero> pasajeros;

	public Auto(String marca, String modelo, String patente, Integer capacidad, Integer tarifa) {
		super(marca, modelo, patente, capacidad, tarifa);
		// TODO Auto-generated constructor stub
	}

	
}
