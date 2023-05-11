package ar.com.unlam.clases.flota;

import java.util.HashSet;

public class Flota {

	String nombre;
	
	HashSet<Vehiculo> garage;
	
	public Flota() {
		this.garage = new HashSet<Vehiculo>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public HashSet<Vehiculo> getContenedor() {
		return garage;
	}

	public void setContenedor(HashSet<Vehiculo> contenedor) {
		this.garage = contenedor;
	}
	
	

}
