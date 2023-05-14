package ar.com.unlam.clases.persona;

import java.util.LinkedHashSet;

import ar.com.unlam.clases.flota.Viaje;

public class Pasajero extends Persona {
	
	protected double saldo;
	protected LinkedHashSet<Viaje> historialViajes= new LinkedHashSet<>();;


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

	
	public LinkedHashSet<Viaje> getHistorialViajes() {
		return historialViajes;
	}
	public void setHistorialViajes(LinkedHashSet<Viaje> historialViajes) {
		this.historialViajes = historialViajes;
	} 
    
	
	
	
	public double consultarSaldoDespuesDeViaje(Pasajero pasajero, double tarifa) {
	   
	     if (pasajero.getSaldo() >= tarifa) {
	        saldo = (pasajero.getSaldo()-tarifa);
	        }
		return saldo;
	}
	

	public boolean visualizarMisViajes(LinkedHashSet<Viaje> misViajes) {
	    boolean resultado = false;
	    for (Viaje v : misViajes) {
	        v.imprimirViaje();
	        if (v.getHora() != null && v.getFecha() != null && v.getOrigen() != null &&
	            v.getDestino() != null && v.getChoferEncargado() != null) {
	            resultado = true;
	        }
	    }
	    return resultado;
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
