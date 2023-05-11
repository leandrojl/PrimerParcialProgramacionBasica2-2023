package ar.com.unlam.clases.persona;

public class Pasajero extends Persona {
	
	Integer saldo;

	public Pasajero(String nombre, String apellido, Integer dni, Integer saldo) {
		super(nombre, apellido, dni);
		this.saldo = saldo;
	}

}
