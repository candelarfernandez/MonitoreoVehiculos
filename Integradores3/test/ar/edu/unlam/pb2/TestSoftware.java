package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSoftware {

	@Test
	public void queSePuedaCrearUnAuto() {
		Vehiculo nuevo = new Auto(25.17,"JJZ526", 5, 240, 41.40338, 2.17403);

		assertEquals("JJZ526", ((Auto) nuevo).getPatente());
		assertEquals((Integer) 5, ((Auto) nuevo).getCantidadMaximaPasajeros());
		assertEquals((Integer) 240, ((Auto) nuevo).getVelocidadMaxima());
		assertEquals((Double) 41.40338, ((Auto) nuevo).getLatitud());
		assertEquals((Double) 2.17403, ((Auto) nuevo).getLongitud());
	//	System.out.println(nuevo.toString());
	}
	
	@Test
	public void queSePuedaCrearUnaMoto() {
		Vehiculo nuevo = new Moto(29.15, "094AB5", 200, 41.40338, 2.17403);
		
		assertEquals("094AB5", ((Moto) nuevo).getPatente());
		assertEquals((Integer) 6, ((Moto)nuevo).getCANTIDAD_MAX_PASAJEROS());
		assertEquals((Integer) 200,((Moto) nuevo).getVelocidadMaxima());
		assertEquals((Double) 41.40338,((Moto) nuevo).getLatitud());
		assertEquals((Double) 2.17403, ((Moto)nuevo).getLongitud());
		//System.out.println(nuevo.toString());
	}
	
	@Test
	public void  queSePuedaCrearUnaBicicleta() {
		Vehiculo nuevo = new Bicicleta(56.281, 41.40338, 2.17403);
		
		assertEquals((Double) 41.40338, ((Bicicleta) nuevo).getLatitud());
		assertEquals((Double) 2.17403, ((Bicicleta) nuevo).getLongitud());
		
	}
	
	@Test
	public void  queSePuedaCrearUnTren() {
		Vehiculo nuevo = new Tren(458.12, 15, 250, 100, 41.40338, 2.17403);
		
		assertEquals((Integer) 15, ((Tren) nuevo).getCantidadDeVagones());
		assertEquals((Integer) 250, ((Tren) nuevo).getCantidadDePasajerosPorVagon());
		assertEquals((Integer) 100, ((Tren) nuevo).getVelocidadMaxima());
		assertEquals((Double) 41.40338, ((Tren) nuevo).getLatitud());
		assertEquals((Double) 2.17403, ((Tren) nuevo).getLongitud());
		
	}

	@Test
	public void  queSePuedanIncorporarDistintosVehiculos() throws ColitionException{		
		
			Mapa actual = new Mapa("Buenos Aires");
			
			actual.agregarVehiculo(new Auto(25.16, "JJZ526", 5, 240, 10.40338, 1.17403));
			actual.agregarVehiculo(new Moto(45.16, "094AB5", 200, 50.40338, 2.5656));
			actual.agregarVehiculo(new Auto(85.23,"AAA001", 5, 100, 25.40338, 5.17403));
			actual.agregarVehiculo(new Bicicleta(49.89, 33.333, 8.12345));
			actual.agregarVehiculo(new Auto(8596.23, "PPP333", 5, 240, 85.40338, 1.17403));
			actual.agregarVehiculo(new Bicicleta(153.24, 22.63258, 3.96542));
			actual.agregarVehiculo(new Bicicleta(145.23, 31.987452, 3.965482));
			actual.agregarVehiculo(new Moto(859.23, "088BB5", 100, 36.85421, 8.17403));
			actual.agregarVehiculo(new Moto(45.23, "094GG5", 90, 29.965482, 4.632152));
			actual.agregarVehiculo(new Tren(85.96, 15, 250, 100, 45.826541, 3.965412));

			assertEquals((Integer) 10, actual.getCantidadDeVehiculos());
			assertTrue(actual.hayCoalición());
	}
	
	@Test (expected = ColitionException.class)
	public void  queChoquenDosVehiculos() throws ColitionException {	
		
		Vehiculo unAuto = new Auto(25.1234, "JJZ526", 5, 240, 41.40338, 2.17403);
		Vehiculo unaMoto = new Moto(25.1234, "094AB5", 200, 25.1234, 1.1234);
		
		Mapa actual = new Mapa("Buenos Aires");
		
		actual.agregarVehiculo(unAuto);
		actual.agregarVehiculo(unaMoto);

		
		unAuto.actualizarCoordenadas(unAuto, unaMoto);
		assertTrue(actual.hayCoalición());
		
	}

}
