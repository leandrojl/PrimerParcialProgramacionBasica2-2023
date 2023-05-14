package ar.com.unlam.clases.flota;

import java.util.HashSet;

import ar.com.unlam.clases.persona.Conductor;
import ar.com.unlam.clases.persona.Pasajero;

public class Auto extends Vehiculo{
	
	protected HashSet<Pasajero> pasajeros;
    protected Conductor conductor;  
	
    
	public Auto(String marca, String modelo, String patente, Integer capacidad, Integer tarifa) {
		super(marca, modelo, patente, capacidad, tarifa);
		

	}
	
	public Boolean asignarConductor(Conductor conductor) {

       if(conductor.getDni()!=null && conductor.getNroLicencia()!= null)
    	   return true;
       else return false; 
    }
	
    public void liberarConductor(Conductor conductor) {
        conductor=null; 
   		} 
   	
    
}
