package ar.com.unlam.clases.flota;


import java.util.HashSet;
import java.util.Objects;

import ar.com.unlam.clases.persona.Conductor;
import ar.com.unlam.clases.persona.Pasajero;

public class Vehiculo {
	protected String marca;
	protected String modelo;
	protected String patente;
	protected Integer capacidad;
	protected Integer kilometrajeDeViaje;
	protected Integer tarifa;
	protected Integer litrosDeNafta;
	protected Conductor conductor=null;
	protected HashSet<Pasajero> pasajeros;
	
	public Vehiculo(String marca, String modelo, String patente, Integer capacidad, Integer tarifa){
		this.marca = marca;
		this.modelo = modelo;
		this.patente = patente;
		this.capacidad= capacidad;
		this.pasajeros = new HashSet<Pasajero>();
		this.tarifa = tarifa;
	}
	
	public void arrancar() {};
	
	public void apagado() {}
	
	public Boolean asignarConductor(Conductor conductor) {
		
		return false;
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public Integer getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}

	public Integer getKilometrajeDeViaje() {
		return kilometrajeDeViaje;
	}

	public void setKilometrajeDeViaje(Integer kilometrajeDeViaje) {
		this.kilometrajeDeViaje = kilometrajeDeViaje;
	}

	public Integer getTarifa() {
		return tarifa;
	}

	public void setTarifa(Integer tarifa) {
		this.tarifa = tarifa;
	}

	public Integer getLitrosDeNafta() {
		return litrosDeNafta;
	}

	public void setLitrosDeNafta(Integer litrosDeNafta) {
		this.litrosDeNafta = litrosDeNafta;
	}

	public Conductor getConductor() {
		return conductor;
	}

	public void setConductor(Conductor conductor) {
		this.conductor = conductor;
	}

	public HashSet<Pasajero> getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(HashSet<Pasajero> pasajeros) {
		this.pasajeros = pasajeros;
	}

	@Override
	public int hashCode() {
		return Objects.hash(patente);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		//if (getClass() != obj.getClass())
		//	return false;
		Vehiculo other = (Vehiculo) obj;
		return Objects.equals(patente, other.patente);
	}

}
