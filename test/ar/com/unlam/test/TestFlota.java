package ar.com.unlam.test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

import org.junit.Assert;
import org.junit.Test;

import ar.com.unlam.clases.flota.Auto;
import ar.com.unlam.clases.flota.Combi;
import ar.com.unlam.clases.flota.Flota;
import ar.com.unlam.clases.flota.Moto;
import ar.com.unlam.clases.flota.Vehiculo;
import ar.com.unlam.clases.flota.Viaje;
import ar.com.unlam.clases.persona.Conductor;
import ar.com.unlam.clases.persona.Pasajero;

public class TestFlota {
	
	@Test
	public void dadoQueTengoUnaCombiConUnConductorYDiezPasajeros() {
		
	//Preparacion del vehiculo combi
	Integer tarifaPorPersona=1000;
	Integer capacidadDePersonasMaxima=10;

	Combi combi = new Combi("Mercedes Benz", "Sprinter", "AB800LL",capacidadDePersonasMaxima,tarifaPorPersona);
	
	//Preparacion conductor
	Conductor conductor = new Conductor("Raul","Fonseca",38140401,0114145);
	
	//Preparacion pasajeros
	Pasajero pasajero= new Pasajero("Leandro","Loureiro", 38130489, 15000);
	Pasajero pasajero1= new Pasajero("Pedro","Lopez", 40130489, 25000);
	Pasajero pasajero2= new Pasajero("Santiago","Smalc", 91130489, 50000);
	Pasajero pasajero3= new Pasajero("Lucila","Martinez", 32130489, 5000);
	Pasajero pasajero4= new Pasajero("Alejandra","Martirio", 38130419, 1000);
	Pasajero pasajero5= new Pasajero("Clotilde","Canoria", 38187102, 4000);
	Pasajero pasajero6= new Pasajero("Felipe","Alberdi", 31275892, 3000);
	Pasajero pasajero7= new Pasajero("Alfonso","Sifron", 42098172, 2000);
	Pasajero pasajero8= new Pasajero("Juan Cruz","Bay", 20981738, 1500);
	Pasajero pasajero9= new Pasajero("Ignacio","Mercau", 12098275, 55000);
	
	combi.asignarConductor(conductor);
	
	combi.agregarPasajero(pasajero);
	combi.agregarPasajero(pasajero1);
	combi.agregarPasajero(pasajero2);
	combi.agregarPasajero(pasajero3);
	combi.agregarPasajero(pasajero4);
	combi.agregarPasajero(pasajero5);
	combi.agregarPasajero(pasajero6);
	combi.agregarPasajero(pasajero7);
	combi.agregarPasajero(pasajero8);
	combi.agregarPasajero(pasajero9);
	
	Assert.assertEquals(combi.getConductor(), conductor);
	
	Assert.assertEquals(capacidadDePersonasMaxima,(Integer)combi.getPasajeros().size());

	}
	
	@Test
	public void dadoQueTengoUnaCombiConUnConductorAsignadoYNoPuedaAgregarMasPasajerosDeLaCapacidadMaximaNiTampocoOtroConductor() {
	//Preparacion del vehiculo combi
	Integer tarifaPorPersona=1000;
	Integer capacidadDePersonasMaxima=10;
	Integer nroLicencia1=0114145;
	Integer nroLicencia2=0114143;

	Combi combi = new Combi("Mercedes Benz", "Sprinter", "AB800LL",capacidadDePersonasMaxima,tarifaPorPersona);
	
	//Preparacion conductores
	Conductor conductor1 = new Conductor("Raul","Fonseca",38140401,nroLicencia1);
	Conductor conductor2 = new Conductor("Nicolas","Otamendi",32267827,nroLicencia2);
	
	//Preparacion pasajeros
	Pasajero pasajero1= new Pasajero("Leandro","Loureiro", 38130489, 15000);
	Pasajero pasajero2= new Pasajero("Pedro","Lopez", 40130489, 25000);
	Pasajero pasajero3= new Pasajero("Santiago","Smalc", 91130489, 50000);
	Pasajero pasajero4= new Pasajero("Lucila","Martinez", 32130489, 5000);
	Pasajero pasajero5= new Pasajero("Alejandra","Martirio", 38130419, 1000);
	Pasajero pasajero6= new Pasajero("Clotilde","Canoria", 38187102, 4000);
	Pasajero pasajero7= new Pasajero("Felipe","Alberdi", 31275892, 3000);
	Pasajero pasajero8= new Pasajero("Alfonso","Sifron", 42098172, 2000);
	Pasajero pasajero9= new Pasajero("Juan Cruz","Bay", 20981738, 1500);
	Pasajero pasajero10= new Pasajero("Ignacio","Mercau", 12098275, 55000);
	Pasajero pasajero11= new Pasajero("Lionel","Messi", 33016244, 2000000);
	
	//Asignacion del conductor
	combi.asignarConductor(conductor1);
	combi.asignarConductor(conductor2);
	
	//Agregando pasajeros a al vehiculo Combi
	combi.agregarPasajero(pasajero1);
	combi.agregarPasajero(pasajero2);
	combi.agregarPasajero(pasajero3);
	combi.agregarPasajero(pasajero4);
	combi.agregarPasajero(pasajero5);
	combi.agregarPasajero(pasajero6);
	combi.agregarPasajero(pasajero7);
	combi.agregarPasajero(pasajero8);
	combi.agregarPasajero(pasajero9);
	combi.agregarPasajero(pasajero10);
	//Agregando al pasajero numero 11
	combi.agregarPasajero(pasajero11);
	
	//Comprobante que el pasajero11 no este en la lista de pasajeros de la combi
	Assert.assertFalse(combi.getPasajeros().contains(pasajero11));
	Assert.assertEquals(conductor1, combi.getConductor());
	}
	
	@Test
	public void dadaUnaFlotaDeVehiculosQueNoPuedaAgregarVehiculosConPatenteRepetidaYTampocoTenerMasVehiculosQueLaCapacidadAsignada() {
		Integer capacidadMaximaDeVehiculos=3;
		
		Flota flotaDeVehiculos = new Flota("La flota de los pibes",capacidadMaximaDeVehiculos);
		
		Vehiculo combi = new Combi("Mercedes Benz", "Sprinter", "AB123AZ",10,500);
		Vehiculo auto = new Auto("Toyota","Corolla","AC131OL",4,1000);
		Vehiculo moto = new Moto("Kawasaki","Ninja ZX-6R","AB143AZ",1,100);
		Vehiculo moto1 = new Moto("BMW","R1250","AB123AZ",1,100); //patente repetida
		Vehiculo moto2 = new Moto("BMW","R1000","AB127AZ",1,100);
		
		flotaDeVehiculos.agregarVehiculo(combi);
		flotaDeVehiculos.agregarVehiculo(combi);
		flotaDeVehiculos.agregarVehiculo(auto);
		flotaDeVehiculos.agregarVehiculo(auto);
		flotaDeVehiculos.agregarVehiculo(moto);
		flotaDeVehiculos.agregarVehiculo(moto1);
		flotaDeVehiculos.agregarVehiculo(moto2);
		
		Assert.assertTrue(flotaDeVehiculos.getGarage().size()==3);
	}
	
	@Test
	public void queNoPuedaAgregarPersonasConMismoDniALaCombi() {
		//Preparacion del vehiculo combi
		Integer tarifaPorPersona=1000;
		Integer capacidadDePersonasMaxima=10;
		Integer nroLicencia1=0114145;

		Combi combi = new Combi("Mercedes Benz", "Sprinter", "AB800LL",capacidadDePersonasMaxima,tarifaPorPersona);
		
		//Preparacion conductores
		Conductor conductor1 = new Conductor("Raul","Fonseca",38140401,nroLicencia1);
		
		//Preparacion pasajeros todos con el mismo dni
		Pasajero pasajero1= new Pasajero("Leandro","Loureiro", 38130489, 15000);
		Pasajero pasajero2= new Pasajero("Pedro","Lopez", 38130489, 25000);
		Pasajero pasajero3= new Pasajero("Julio","Plaro", 38130489, 15000);
		Pasajero pasajero4= new Pasajero("Armando","Banquito", 38130489, 15000);
		
		//Asignacion del conductor
		combi.asignarConductor(conductor1);
		
		//Agregando pasajeros a al vehiculo Combi
		combi.agregarPasajero(pasajero1);
		combi.agregarPasajero(pasajero2);
		combi.agregarPasajero(pasajero3);
		combi.agregarPasajero(pasajero4);
		
		Assert.assertTrue(combi.getPasajeros().size()==1);
	}
	
	@Test
	public void dadoQueTengoUnaCombiConUnPasajaeroQueSeLeDebiteElSaldoAcordeALaTarifaDeLaCombi() {
		//Preparacion del vehiculo combi
		Integer tarifaPorPersona=1000;
		Integer capacidadDePersonasMaxima=10;

		Combi combi = new Combi("Mercedes Benz", "Sprinter", "AB800LL",capacidadDePersonasMaxima,tarifaPorPersona);
		
		//Preparacion conductor
		Conductor conductor = new Conductor("Raul","Fonseca",38140401,0114145);
		
		//Preparacion pasajeros
		Pasajero pasajero1= new Pasajero("Leandro","Loureiro", 38130489, 10000);
		
		combi.asignarConductor(conductor);
		
		combi.agregarPasajero(pasajero1);
		
		Assert.assertTrue(pasajero1.getSaldo()==9000);
	
	}
	
	@Test
	public void dadoQueTengoUnaCombiConUnConductorMas5PasajerosYUnViajeAsignado() {
		
		Integer tarifaPorPersona=7000;
		Integer capacidadDePersonasMaxima=10;

		Conductor conductor = new Conductor("Raul","Fonseca",38140401,0114145);
				
		Pasajero pasajero1= new Pasajero("Leandro","Loureiro", 38130489, 15000);
		Pasajero pasajero2= new Pasajero("Pedro","Lopez", 40130489, 25000);
		Pasajero pasajero3= new Pasajero("Santiago","Smalc", 91130489, 50000);
		Pasajero pasajero4= new Pasajero("Lucila","Martinez", 32130489, 50000);
		Pasajero pasajero5= new Pasajero("Alejandra","Martirio", 38130419, 10000);
		
		Viaje viaje=new Viaje(LocalTime.of(14, 30), LocalDate.of(2023, 5, 11), "Buenos Aires", "Santa Fe",conductor);
		
		Combi combi = new Combi("Mercedes Benz", "Sprinter", "AB800LL",capacidadDePersonasMaxima,tarifaPorPersona,viaje);
		
		
		combi.asignarConductor(conductor);
		
		combi.agregarPasajero(pasajero1);
		combi.agregarPasajero(pasajero2);
		combi.agregarPasajero(pasajero3);
		combi.agregarPasajero(pasajero4);
		combi.agregarPasajero(pasajero5);
		
		Assert.assertEquals(conductor, viaje.getChoferEncargado());
		Assert.assertEquals(5,combi.getPasajeros().size());
	
	}
	
	@Test
	public void queSePuedaRemoverAlConductorDeLaCombi() {
		Conductor conductor = new Conductor("Raul","Fonseca",38140401,0114145);
		
		Combi combi = new Combi("Mercedes Benz", "Sprinter", "AB800LL",5,1000);
		
		combi.asignarConductor(conductor);
		
		combi.removerConductor(conductor);
		
		Assert.assertTrue(combi.getConductor() == null);
	}
	
	@Test
	public void queUnaCombiPuedaTenerMultiplesDestinos() {
		Integer valorEsperado=4;
		
		Conductor conductor = new Conductor("Raul","Fonseca",38140401,0114145);
		
		Combi combi = new Combi("Mercedes Benz", "Sprinter", "AB800LL",5,1000);
		
		Viaje viaje1=new Viaje(LocalTime.of(14, 30), LocalDate.of(2023, 5, 11), "Buenos Aires", "Santa Fe",conductor);
		Viaje viaje2=new Viaje(LocalTime.of(14, 30), LocalDate.of(2023, 5, 12), "Buenos Aires", "Santa Fe",conductor);
		Viaje viaje3=new Viaje(LocalTime.of(14, 30), LocalDate.of(2023, 5, 13), "Buenos Aires", "Santa Fe",conductor);
		Viaje viaje4=new Viaje(LocalTime.of(14, 30), LocalDate.of(2023, 5, 14), "Buenos Aires", "Santa Fe",conductor);
		
		
		combi.asignarConductor(conductor);
		
		combi.asignarViaje(viaje1);
		combi.asignarViaje(viaje2);
		combi.asignarViaje(viaje3);
		combi.asignarViaje(viaje4);
		
		Assert.assertEquals(valorEsperado, (Integer)combi.getMultiplesViajes().size());
	}
	
	@Test
	public void queUnPasajeroPuedaTenerUnViajeConUnaCombiYUnConductorAsignado() {
		Pasajero pasajero1= new Pasajero("Leandro","Loureiro", 38130489, 15000);
		Combi combi = new Combi("Mercedes Benz", "Sprinter", "AB800LL",5,1000);
		Conductor conductor = new Conductor("Raul","Fonseca",38140401,0114145);
		Viaje viaje1 = new Viaje(LocalTime.of(14, 30), LocalDate.of(2023, 5, 11), "Buenos Aires", "Santa Fe",conductor);
		
		combi.asignarConductor(conductor);
		combi.agregarPasajero(pasajero1);
		pasajero1.agregarViaje(viaje1);
		viaje1.asignarVehiculo(combi);
		
		
		Conductor valorObtenido=viaje1.getVehiculoAsignado().getConductor();
		
		Assert.assertTrue(pasajero1.getHistorialViajes().contains(viaje1));
		Assert.assertEquals(conductor, valorObtenido);
		
	}

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
	HashSet <Vehiculo> taxis = new HashSet<>(); 
	//CREO UN TAXI
	Auto taxi1 = new Auto("Peugeot", "207", "ABC897", 4, 0);
	//AGREGO EL TAXI AL HASHSET
	taxis.add(taxi1); 
	
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

	Pasajero misViajes = new Pasajero(null, null, null, 0);
	
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
	Viaje viaje01 = new Viaje(LocalTime.of(21, 35), LocalDate.of(2023, 5, 12), "Varela 777", "Peron 473");
 
    assertTrue(misViajes.cancelarReserva(viaje01));
	

}


@Test
public void testQueSePuedanAgregarMasDeUnDestino() {
   Viaje destinosMultiples = new Viaje();
   ArrayList<Viaje> destinos= new ArrayList<>(); 
   Viaje destino01 = new Viaje(LocalTime.of(18, 00), LocalDate.of(2023, 5, 12), "Sarmiento 4020, caba", "Peron 473, caba");
   Viaje destino02 = new Viaje("Peron 990, caba");
   Viaje destino03 = new Viaje("Rivadavia 222, caba");
   destinos.add(destino01); 
   destinos.add(destino02);
   destinos.add(destino03);
   
   assertEquals(3, destinosMultiples.getDestinosMultiples(destinos).size());
   
}


@Test
public void queSeLeCobreUnPorcentajeAUnPasajeroSiNoCancelaElViajeConAnticipacion() {
   
   Viaje viaje1 = new Viaje(LocalTime.of(19, 30), LocalDate.of(2023, 5, 12), "Sarmiento 4020, caba", "Peron 473, caba");
   Pasajero pasajero1= new Pasajero("pepe", "diaz", 7898676, 3000.0); 
   
   assertEquals(2900.0, viaje1.cobrarSeguroDeCancelacion(pasajero1, viaje1), 0.01);
   
}


	@Test
	public void testQueMeDejeCambiarDestinoDeMiViaje() {

	Viaje viaje01 = new Viaje(LocalTime.of(18, 00), LocalDate.of(2023, 5, 12), "Sarmiento 4020, caba", "Peron 473, caba");
    
	String esperado = "Corrientes 1900, caba";
    String esperado2 = viaje01.setDestino("Corrientes 1900, caba"); 
	
    assertEquals(esperado, esperado2);
	
	}
	


}
