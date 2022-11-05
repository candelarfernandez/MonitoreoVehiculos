package ar.edu.unlam.pb2;

public class Moto extends Vehiculo {

	private String patente;
	private final Integer CANTIDAD_MAX_PASAJEROS=6;
	private Integer velocidadMaxima;
	private Double latitud;
	private Double longitud;

	public Moto(Double coordenadas, String patente, Integer velocidadMaxima, Double latitud,
			Double longitud) {
		super(coordenadas);
		this.patente = patente;
		this.velocidadMaxima = velocidadMaxima;
		this.latitud = latitud;
		this.longitud = longitud;
	}
	

	public String getPatente() {
		return patente;
	}


	public void setPatente(String patente) {
		this.patente = patente;
	}


	public Integer getVelocidadMaxima() {
		return velocidadMaxima;
	}


	public void setVelocidadMaxima(Integer velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
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


	public Integer getCANTIDAD_MAX_PASAJEROS() {
		return CANTIDAD_MAX_PASAJEROS;
	}


	@Override
	public String toString() {
		return "Moto \n[getPatente()=" + getPatente() + ",\n getCantidadMaximaPasajeros()=" + getCANTIDAD_MAX_PASAJEROS()
				+ ",\n getVelocidadMaxima()=" + getVelocidadMaxima() + ",\n getLatitud()=" + getLatitud()
				+ ",\n getLongitud()=" + getLongitud()+"]";
	}
	
	

}
