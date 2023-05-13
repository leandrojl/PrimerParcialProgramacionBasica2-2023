package ar.com.unlam.clases.persona;

import ar.com.unlam.clases.flota.Auto;

public class Conductor extends Persona{
	
	protected Integer nroLicencia;
	protected Auto taxiAsignado; 

	public Conductor(String nombre, String apellido, Integer dni, Integer nroLicencia) {
		super(nombre, apellido, dni);
		this.nroLicencia = nroLicencia;
	}

	public Integer getNroLicencia() {
		return nroLicencia;
	}

	public void setNroLicencia(Integer nroLicencia) {
		this.nroLicencia = nroLicencia;
	}

	public Auto getTaxiAsignado() {
		return taxiAsignado;
	}

	public void setTaxiAsignado(Auto taxiAsignado) {
		this.taxiAsignado = taxiAsignado;
	}

	
	
}
