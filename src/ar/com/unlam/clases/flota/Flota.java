package ar.com.unlam.clases.flota;

import java.util.LinkedHashSet;


public class Flota {

	String nombre;
	Integer capacidadDeVehiculos;
	LinkedHashSet<Vehiculo> garage;
	
	public Flota() {
		this.garage = new LinkedHashSet<Vehiculo>();
	}
	
	public Flota(String nombre, Integer capacidadDeVehiculos) {
		this.nombre = nombre;
		this.capacidadDeVehiculos = capacidadDeVehiculos;
		this.garage = new LinkedHashSet<Vehiculo>();
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCapacidadDeVehiculos() {
		return capacidadDeVehiculos;
	}

	public void setCapacidadDeVehiculos(Integer capacidadDeVehiculos) {
		this.capacidadDeVehiculos = capacidadDeVehiculos;
	}

	public LinkedHashSet<Vehiculo> getGarage() {
		return garage;
	}

	public void setGarage(LinkedHashSet<Vehiculo> garage) {
		this.garage = garage;
	}

	public void agregarVehiculo(Vehiculo vehiculo) {
		if(getGarage().size() < getCapacidadDeVehiculos() ) {
			getGarage().add(vehiculo);
		}
	
	}

}
