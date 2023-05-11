package ar.com.unlam.test;

import static org.junit.Assert.*;
import java.util.HashSet;
import org.junit.Test;

import ar.com.unlam.clases.flota.Auto;
import ar.com.unlam.clases.flota.Vehiculo;
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
public void testQueLaAppIndiqueLaTarifaSegunLosKilometrosDelViaje() {
	
	HashSet <Pasajero> pasajero = new HashSet<>(); 
	Pasajero pasajero01 = new Pasajero("Monica", "Geller", 38444400, 5000);
	pasajero.add(pasajero01);
	
	assertEquals(4000.0, pasajero01.calcularTarifaViajeEnTaxi(200), 0.01); 
}


@Test
public void testQueMeIndiqueMiSaldoLuegoDeAbonarUnViaje() {
	
	HashSet<Pasajero> pasajeros = new HashSet<>();
	Pasajero pasajero02 = new Pasajero("Roberto", "Diaz", 57444400, 5000.0);
	Pasajero pasajero03 = new Pasajero("Roberto", "Diaz", 23984400, 5000.0);
	pasajeros.add(pasajero02);
	
	double tarifaEsperada = 2000.0;
	
   assertEquals(tarifaEsperada, pasajero03.consultarSaldoDespuesDeViaje(pasajero03, 3000.0), 0.01); 
}




}
