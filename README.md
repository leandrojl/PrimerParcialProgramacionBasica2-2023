# Primer Parcial Programacion Basica 2-2023

## Descripcion del Proyecto:
### Sistema de Gestion de Viajes
El objetivo del software es poder tener un sistema de gestión de viajes donde se pueda almacenar y controlar los datos pertenecientes a una flota de vehiculos en la cual será posible crear Motos, Autos y Combis, y asignar un conductor, pasajeros y viajes con hora, fecha, origen y destino. Se busca poder almacenar objetos dentro las colecciones pertenecientes a las clases, validar que efectivamente correspondan y poder crear múltiples escenarios donde un determinado vehículo con conductor y pasajeros pueda tener asignado un viaje.

### Tecnologias utilizadas:

Para resolver el siguiente ejercicio se utilizo el lenguaje Java enfocado en el paradigma de Programacion Orientada a Objetos, donde se utilizo TDD y Herencia para la reutilizacion de codigo

## Como utilizar este archivo:
1) En el caso de clonar el repositorio : `git clone https://github.com/leandrojl/EjercicioAlbumDeFiguritasTDD.git`
2) Por motivos de compatibilidad con los compañeros se utilizó JAVASE-15.

## Testeos desarrollados:
### <ins>Tests de leandrojl:</ins>
dadoQueTengoUnaCombiConUnConductorYDiezPasajeros();

dadoQueTengoUnaCombiConUnConductorAsignadoYNoPuedaAgregarMasPasajerosDeLaCapacidadMaximaNiTampocoOtroConductor();

dadaUnaFlotaDeVehiculosQueNoPuedaAgregarVehiculosConPatenteRepetidaYTampocoTenerMasVehiculosQueLaCapacidadAsignada();

queNoPuedaAgregarPersonasConMismoDniALaCombi();

dadoQueTengoUnaCombiConUnPasajaeroQueSeLeDebiteElSaldoAcordeALaTarifaDeLaCombi();

dadoQueTengoUnaCombiConUnConductorMas5PasajerosYUnViajeAsignado();

queSePuedaRemoverAlConductorDeLaCombi();

queUnaCombiPuedaTenerMultiplesDestinos();

queUnPasajeroPuedaTenerUnViajeConUnaCombiYUnConductorAsignado();

### <ins>Tests de AnitaProgra:</ins>

testAgregarUnaFlotaDeTaxisAlGarageDeLaFlotaDeTransportes();

testQueMeDejeAsignarUnConductorRegistradoEnLaBaseDeDatosAUnTaxi();

testQuePuedaLiberarDeConductorAUnTaxi();

testQueLaAppIndiqueLaTarifaSegunLosKilometrosDelViaje();

testQueMeIndiqueMiSaldoLuegoDeAbonarUnViaje();

testQueMePermitaGuardarYConsultarElHistorialDeMisViajesRealizados();

testQueLaAppMeConfirmeLaReservaDeMiViaje();

testQueLaAppMeDejeCancelarUnaReserva();

testQueMeDejeCambiarDestinoDeMiViaje();

testQueSePuedanAgregarMasDeUnDestino();

## MIT License

Copyright (c) 2023 Leandro J. Loureiro
