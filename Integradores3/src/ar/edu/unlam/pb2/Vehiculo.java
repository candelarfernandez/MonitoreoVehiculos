package ar.edu.unlam.pb2;

import java.util.Objects;

public class Vehiculo {
	protected Double coordenadas;
	

	public Vehiculo(Double coordenadas) {
		super();
		this.coordenadas = coordenadas;
	}

	public Double getCoordenadas() {
		return coordenadas;
	}

	public void setCoordenadas(Double coordenadas) {
		this.coordenadas = coordenadas;
	}

	public void actualizarCoordenadas(Vehiculo unAuto, Vehiculo unaMoto) throws ColitionException {
		
		if(unAuto.getCoordenadas().equals(unaMoto.getCoordenadas())) {
			throw new ColitionException();
			
		}
		
	}
	
	
	

	
	

}
