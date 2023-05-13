package ar.com.unlam.test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

import org.junit.Test;

import ar.com.unlam.clases.flota.Auto;
import ar.com.unlam.clases.flota.Vehiculo;
import ar.com.unlam.clases.flota.Viaje;
import ar.com.unlam.clases.persona.Conductor;
import ar.com.unlam.clases.persona.Pasajero;

public class TestFlota {

    
@Test
	public void testAgregarUnaFlotaDeTaxisAlGarageDeLaFlotaDeTransportes() {
    
	//CREO EL HASHSET DE LA FLOTA Y CREO LOS TAXIS CON SUS ATRIBUTOS
	HashSet <Vehiculo> taxis = new HashSet<>(); 
	Auto taxi1 = new Auto("Peugeot", "207", "ABC897", 4, 0);
	Auto taxi2 = new Auto("Fiat", "Palio", "ART567", 4, 0);
	Auto taxi3 = new Auto("Honda", "Ext", "AMY678", 4, 0);
	Auto taxi4 = new Auto("Volkswagen", "Gol", "PGA999", 4, 0);
	Auto taxi5 = new Auto("Chevrolet", "Onix", "KLE889", 4, 0);
    
	//AGREGO LOS TAXIS AL SET Y AGREGO UNO DUPLICADO PARA VERIFICAR QUE MI HASHSET NO LO AGREGUE
	//A LA LISTA
	taxis.add(taxi1);
	taxis.add(taxi2);
	taxis.add(taxi3);
	taxis.add(taxi4);
	taxis.add(taxi5);
	taxis.add(taxi5);
	
	//INSTANCIO EL VALOR QUE ESPERO DE LA LISTA
	int valorEsperadoDelHashset = 5; 
	
	//VERIFICO CON UN ASSERT EL VALOR ESPERADO DE MI LISTA Y EL VALOR QUE ME ARROJA EL METODO SIZE
	assertEquals(valorEsperadoDelHashset, taxis.size()); 
	}

@Test
public void testQueMeDejeAsignarUnConductorRegistradoEnLaBaseDeDatosAUnTaxi() {
	//CREO UN HASHSET PARA LOS TAXIS
	HashSet <Vehiculo> taxis = new HashSet<>(); //CREO UN HASHSET PARA LOS TAXIS
	Auto taxi1 = new Auto("Peugeot", "207", "ABC897", 4, 0);//CREO UN TAXI
	taxis.add(taxi1); //AGREGO EL TAXI AL HASHSET
	
	//CREO LOS CONDUCTORES REGISTRADOS, ALGUNOS SIN TODOS SUS DATOS
	Conductor conductor01 =new Conductor("Phoebe", "Buffay", 56367800, 270001); 
	Conductor conductor02 =new Conductor("Ross", "Geller", null, 270001); 
	Conductor conductor03 =new Conductor("Rachel", "Green", 56367800, null); 
	
	//VERIFICO CON EL METODO DE ASIGNAR CONDUCTOR QUE EFECTIVAMENTE ARROJE LOS RESULTADOS ESPERADOS
	//TANTO CON ASSERT TRUE COMO CON EL RESULTADO ESPERADO CON FALSE
	assertTrue(taxi1.asignarConductor(conductor01)); 
	assertFalse(taxi1.asignarConductor(conductor02));
	assertFalse(taxi1.asignarConductor(conductor03));
}


@Test
public void testQuePuedaLiberarDeConductorAUnTaxi() {
	//CREO UN HASHSET PARA LOS TAXIS
	HashSet <Vehiculo> taxis = new HashSet<>(); //CREO UN HASHSET PARA LOS TAXIS
	Auto taxi1 = new Auto("Peugeot", "207", "ABC897", 4, 0);//CREO UN TAXI
	taxis.add(taxi1); //AGREGO EL TAXI AL HASHSET
	
	//CREO LOS CONDUCTORES REGISTRADOS, ALGUNOS SIN TODOS SUS DATOS
	Conductor conductor01 =new Conductor("Phoebe", "Buffay", 56367800, 270001); 
	taxi1.asignarConductor(conductor01); 
	taxi1.liberarConductor(conductor01); 
	
	assertNull(conductor01.getTaxiAsignado()); 
}


@Test
public void testQueLaAppIndiqueLaTarifaSegunLosKilometrosDelViaje() {
	
	Pasajero pasajero01 = new Pasajero("Monica", "Geller", 38444400, 5000);
	
	assertEquals(4000.0, pasajero01.calcularTarifaViajeEnTaxi(200), 0.01); 
}


@Test
public void testQueMeIndiqueMiSaldoLuegoDeAbonarUnViaje() {
	
	Pasajero pasajero03 = new Pasajero("Roberto", "Diaz", 23984400, 5000.0);
	
	double tarifaEsperada = 2000.0;
	
   assertEquals(tarifaEsperada, pasajero03.consultarSaldoDespuesDeViaje(pasajero03, 3000.0), 0.01); 
}


@Test
public void testQueMePermitaGuardarYConsultarElHistorialDeMisViajesRealizados() {

	Viaje misViajes = new Viaje();
	
	LinkedHashSet<Viaje> miHistorialViajes= new LinkedHashSet<>(); 
	
	Conductor chofer01 = new Conductor("Jorge","Perez" , 17354444, 270001); 
	Conductor chofer02 = new Conductor("Carlos","Guzman" , 17674014, 270002);
	Viaje viaje01 = new Viaje(LocalTime.of(14, 30), LocalDate.of(2023, 5, 11), "moron 123", "ramos mejia 4025",chofer01);
	Viaje viaje02 = new Viaje(LocalTime.of(18, 30), LocalDate.of(2023, 5, 10), "ramos mejia 4025", "moron 123",chofer02);
	Viaje viaje03 = new Viaje(LocalTime.of(17, 00), LocalDate.of(2023, 5, 9), "moron 123", "liniers 404",chofer01);
	Viaje viaje04 = new Viaje(LocalTime.of(12, 50), LocalDate.of(2023, 5, 4), "liniers 404", "moron 123",chofer02);
	 
	miHistorialViajes.add(viaje01); 
	miHistorialViajes.add(viaje02); 
	miHistorialViajes.add(viaje03); 
	miHistorialViajes.add(viaje04); 
	
    
    assertTrue(misViajes.visualizarMisViajes(miHistorialViajes));
	
}

@Test
public void testQueLaAppMeConfirmeLaReservaDeMiViaje() {

	Viaje misViajes = new Viaje();

	Viaje viaje01 = new Viaje(LocalTime.of(18, 00), LocalDate.of(2023, 5, 12), "Varela 777", "Peron 473");
 
    assertTrue(misViajes.confirmarReserva(viaje01));
	
}


@Test
public void testQueLaAppMeDejeCancelarUnaReserva() {

	Viaje misViajes = new Viaje();
	//PROFE :para verificar este test cree un viaje que tenga una hora de reserva mayor a 60 minutos 
	// desde la hora en la que la queremos cancelar, sino nos va a devolver false
	//va a funcionar en funcion de la hora en la que se corra el test
	Viaje viaje01 = new Viaje(LocalTime.of(22, 35), LocalDate.of(2023, 5, 12), "Varela 777", "Peron 473");
 
    assertTrue(misViajes.cancelarReserva(viaje01));
	
}


@Test
public void testQueMeDejeCambiarDestinoDeMiViaje() {

	Viaje viaje01 = new Viaje(LocalTime.of(18, 00), LocalDate.of(2023, 5, 12), "Sarmiento 4020, caba", "Peron 473, caba");
    
	String esperado = "Corrientes 1900, caba";
    String esperado2 = viaje01.setDestino("Corrientes 1900, caba"); 
	
    assertEquals(esperado, esperado2);
	
}

@Test
public void testQueSePuedanAgregarMasDeUnDestino() {
   Viaje destinosMultiples = new Viaje();
   ArrayList<Viaje> destinos= new ArrayList<>(); 
   Viaje viaje01 = new Viaje("Buenos Aires 199, Castelar, Moron"); 
   Viaje viaje02 = new Viaje("Italia 300, Ramos Mejia"); 
   Viaje viaje03 = new Viaje("Rivadavia 200, Ciudadela"); 
   destinos.add(viaje01); 
   destinos.add(viaje02);
   destinos.add(viaje03);
   
   assertEquals(3, destinosMultiples.getDestinosMultiples(destinos).size());
}


@Test
public void queSeLeCobre() {
   Viaje destinosMultiples = new Viaje();
   ArrayList<Viaje> destinos= new ArrayList<>(); 
   Viaje viaje01 = new Viaje("Buenos Aires 199, Castelar, Moron"); 
   Viaje viaje02 = new Viaje("Italia 300, Ramos Mejia"); 
   Viaje viaje03 = new Viaje("Rivadavia 200, Ciudadela"); 
   destinos.add(viaje01); 
   destinos.add(viaje02);
   destinos.add(viaje03);
   
   assertEquals(3, destinosMultiples.getDestinosMultiples(destinos).size());
}



}
