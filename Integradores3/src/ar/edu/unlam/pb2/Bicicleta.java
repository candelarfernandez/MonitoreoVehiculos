package ar.edu.unlam.pb2;

public class Bicicleta extends Vehiculo {
	private Double latitud;
	private Double longitud;

	public Bicicleta(Double coordenadas, Double latitud,  Double longitud) {
		super(coordenadas);
		this.latitud=latitud;
		this.longitud=longitud;
	}

	public Double getLatitud() {
		return latitud;
	}

	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}

	public Double getLongitud() {
		return longitud;
	}

	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}
	
	

}
