package ar.com.unlam.clases.flota;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

import ar.com.unlam.clases.persona.Conductor;
import ar.com.unlam.clases.persona.Pasajero;

public class Viaje {
     
	protected LocalTime hora; 
    protected LocalDate fecha; 
    protected String origen ; 
    protected String destino; 
    protected double tarifa; 
    protected Conductor choferEncargado; 
    protected Pasajero pasajero; 
	protected ArrayList<Viaje> destinosMultiples;
 
	
	public Viaje() {
		
	}
	
    public Viaje(LocalTime hora, LocalDate fecha, String origen, String destino) {
    	this.hora = hora;
		this.fecha = fecha;
		this.origen = origen;
		this.destino = destino;
	}
    
    public Viaje(String destino) {
    	this.destino = destino;
	}
	
	public Viaje(LocalTime hora, LocalDate fecha, String origen, String destino, Conductor choferEncargado) {
		this.hora = hora;
		this.fecha = fecha;
		this.origen = origen;
		this.destino = destino;
		this.choferEncargado = choferEncargado;
	}
	
	
	public ArrayList<Viaje> getDestinosMultiples(ArrayList<Viaje> destinosMultiples) {
		return destinosMultiples;
	}

	public void setDestinosMultiples(ArrayList<Viaje> destinosMultiples) {
		this.destinosMultiples = destinosMultiples;
	}

	public LocalTime getHora() {
		return hora;
	}
	public void setHora(LocalTime hora) {
		this.hora = hora;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getDestino() {
		return destino;
	}
	public String setDestino(String destino) {
		return this.destino = destino;
	}
	public Conductor getChoferEncargado() {
		return choferEncargado;
	}
	public void setChoferEncargado(Conductor choferEncargado) {
		this.choferEncargado = choferEncargado;
	}
	

	public boolean confirmarReserva(Viaje viaje) {
		if(viaje.getHora()!= null && viaje.getFecha()!= null &&
			viaje.getOrigen()!=null && viaje.getDestino()!=null)
		return true;
		else return false;
	}

	
	
	public boolean cancelarReserva(Viaje viaje) {
	/*	ESTE METODO ME DEJA CANCELAR LA RESERVA SOLAMENTE SI EL USUARIO LA CANCELA  
		CON UNA ANTICIPACION MAYOR A 60 MINUTOS
	    EL .NOW() EN EL LOCAL TIME TRAE AL PROGRAMA LA HORA ACTUAL DE LA ZONA DEL USUARIO
		Y EL .GETHORA() LA HORA EN LA QUE FUE HECHA LA RESERVA, Y LAS COMPARA, SI LA CANCELACION ES
		CON MAS DE 60 MINUTOS DEVUELVE TRUE, SI ES CON MENOS DE 60 MIN, DEVUELVE FALSE :) */
		
		LocalTime ahora = LocalTime.now();
	    LocalTime horaViaje = viaje.getHora();
	   
	    Duration duracion = Duration.between(ahora, horaViaje);
	    long minutosAntesDeViaje = duracion.toMinutes();
	   
	    if (minutosAntesDeViaje > 60) { 
	        return true;
	    } 
	    
	    else {
	        return false;
	    }
	}

	public void imprimirViaje() {
		 System.out.println( "Viaje:\n"+ "Hora:" + hora +"\n" + "Fecha:" + fecha +"\n" + "Origen:" +origen +"\n" + "Destino:" + destino +"\n"  +
	          "Chofer:" + choferEncargado.getNombre()+ "" + choferEncargado.getApellido()+ "\n");
	  
		}
	
	
	public double cobrarSeguroDeCancelacion(Pasajero pasajero, Viaje viaje) {
		LocalTime ahora = LocalTime.now();
	    LocalTime horaViaje = viaje.getHora();
	    double seguro= 100.0;
	    double saldoActual = pasajero.getSaldo();
	    Duration duracion = Duration.between(ahora, horaViaje);
	    long minutosAntesDeViaje = duracion.toMinutes();
	   
	    if (minutosAntesDeViaje < 60) { 
	    	 pasajero.setSaldo(saldoActual - seguro);
	         return pasajero.getSaldo();
	    } 
	    
	    else {
	        return saldoActual;
	    }
	}

	
	
	
}
