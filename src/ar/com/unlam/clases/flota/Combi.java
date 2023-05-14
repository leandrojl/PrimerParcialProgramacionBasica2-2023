package ar.com.unlam.clases.flota;

import java.util.LinkedHashSet;

import ar.com.unlam.clases.persona.Conductor;
import ar.com.unlam.clases.persona.Pasajero;

public class Combi extends Vehiculo{
	
	private Viaje viajeAsignado;
	private LinkedHashSet<Viaje> multiplesViajes;

	public Combi(String marca, String modelo, String patente, Integer capacidad, Integer tarifa) {
		super(marca, modelo, patente, capacidad, tarifa);
		this.multiplesViajes = new LinkedHashSet<>();
	}
	
	public Combi(String marca, String modelo, String patente, Integer capacidad, Integer tarifa, Viaje viajeAsignado) {
		super(marca, modelo, patente, capacidad, tarifa);
		this.viajeAsignado = viajeAsignado;
		this.multiplesViajes = new LinkedHashSet<>();
	}
	
	public void agregarPasajero(Pasajero pasajero) {
		
		if(getPasajeros().size() < getCapacidad()) {
			this.getPasajeros().add(pasajero);
			pasajero.setSaldo(pasajero.getSaldo()-this.tarifa);
		}
		
	}
	
	@Override
	public Boolean asignarConductor(Conductor conductor) {
		if(getConductor() == null) {
			setConductor(conductor);
		}
		return false;
		
	}

	public void removerConductor(Conductor conductor) {
		if(getConductor() != null) {
			setConductor(null);
		}
		
	}

	public Viaje getViajeAsignado() {
		return viajeAsignado;
	}

	public void setViajeAsignado(Viaje viajeAsignado) {
		this.viajeAsignado = viajeAsignado;
	}

	public LinkedHashSet<Viaje> getMultiplesViajes() {
		return multiplesViajes;
	}

	public void setMultiplesViajes(LinkedHashSet<Viaje> multiplesViajes) {
		this.multiplesViajes = multiplesViajes;
	}

	public void asignarViaje(Viaje viaje) {
		this.multiplesViajes.add(viaje);
		
	}

}
