package ar.com.unlam.clases.persona;

public class Conductor extends Persona{
	
	Integer nroLicencia;

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

}
