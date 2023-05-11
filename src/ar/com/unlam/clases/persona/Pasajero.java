package ar.com.unlam.clases.persona;

import ar.com.unlam.clases.flota.Auto;

public class Pasajero extends Persona {
	
	protected double saldo;

	public Pasajero(String nombre, String apellido, Integer dni, double saldo) {
		super(nombre, apellido, dni);
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
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
}
