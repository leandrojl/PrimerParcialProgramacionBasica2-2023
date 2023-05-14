# Primer Parcial Programacion Basica 2-2023

## Descripcion del Proyecto:
### Sistema de Gestion de Viajes
El objetivo del software es poder tener un sistema de gestión de viajes donde se pueda almacenar y controlar los vehículos guardados en una flota de transportes en la cual será posible crear Motos, Autos y Combis, y asignar un conductor, pasajeros (los cuales cuentan con un saldo) y viajes con hora, fecha, origen, destino, tarifa. Se busca poder almacenar objetos dentro las colecciones pertenecientes a las clases, validar que efectivamente funcionen y poder crear múltiples escenarios donde un determinado vehículo con conductor y pasajeros pueda tener asignado un viaje. Perteneciente a la clase Auto, es posible crear un objeto Taxi donde un Pasajero pueda reservar, cancelar un viaje, ver la tarifa según los kilómetros que el viaje demande, consultar el historial de viajes y que se le cobre un extra si cancela el viaje sin anticipación.
#### <ins>Explicación aparte:</ins>
**testQueLaAppMeDejeCancelarUnaReserva();** utiliza LocalTime por lo que para probarlo y que corra se debe crear un viaje con un horario 60 minutos mayor del horario actual ya que se utilizo el .Now() para traer la hora actual.


### Tecnologias utilizadas:

Para resolver el siguiente ejercicio se utilizo el lenguaje Java enfocado en el paradigma de Programacion Orientada a Objetos, donde se utilizo TDD y Herencia para la reutilizacion de codigo

## Como utilizar este archivo:
1) En el caso de clonar el repositorio : `https://github.com/leandrojl/PrimerParcialProgramacionBasica2-2023.git`
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

queSeLeCobreUnPorcentajeAUnPasajeroSiNoCancelaElViajeConAnticipacion();

## MIT License

Copyright (c) 2023 Leandro J. Loureiro
