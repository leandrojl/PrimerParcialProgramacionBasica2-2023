package ar.com.unlam.clases.persona;

import java.util.LinkedHashSet;

import ar.com.unlam.clases.flota.Auto;
import ar.com.unlam.clases.flota.Viaje;

public class Pasajero extends Persona {
	
	protected Double saldo;
	private LinkedHashSet<Viaje> viajes;

	public Pasajero(String nombre, String apellido, Integer dni, double saldo) {
		super(nombre, apellido, dni);
		this.saldo = saldo;
		this.viajes = new LinkedHashSet<Viaje>();
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	
	public double consultarSaldoDespuesDeViaje(Pasajero pasajero, double tarifa) {
	   
	     if (pasajero.getSaldo() >= tarifa) {
	        saldo = (pasajero.getSaldo()-tarifa);
	        }
		return saldo;
	}
	
	
	public double calcularTarifaViajeEnTaxi(int kilometrajeDeViaje) {
		double tarifa = 0;
		if (kilometrajeDeViaje<=100)
		
		return 1000.0;
		if (kilometrajeDeViaje>100 && kilometrajeDeViaje<150)
			
			return 2500.0;
         if (kilometrajeDeViaje>150 && kilometrajeDeViaje<300)
			
			return 4000.0;
		return tarifa;
	}

	public void agregarViaje(Viaje viaje) {
		this.viajes.add(viaje);
		
	}

	public LinkedHashSet<Viaje> getViajes() {
		return viajes;
	}

	public void setViajes(LinkedHashSet<Viaje> viajes) {
		this.viajes = viajes;
	}

	public Conductor buscarConductor(Conductor conductor) {
		
		return null;
	}
	
}
