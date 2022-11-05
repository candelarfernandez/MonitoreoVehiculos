package ar.edu.unlam.pb2;

public class Auto extends Vehiculo {
	

	private String patente;
	private Integer cantidadMaximaPasajeros;
	private Integer velocidadMaxima;
	private Double latitud;
	private Double longitud;

	public Auto(Double coordenadas, String patente, Integer cantidadMaximaPasajeros, Integer velocidadMaxima, Double latitud,
			Double longitud) {
		super(coordenadas);
		this.patente = patente;
		this.cantidadMaximaPasajeros = cantidadMaximaPasajeros;
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

	
	public Integer getCantidadMaximaPasajeros() {
		return cantidadMaximaPasajeros;
	}

	public void setCantidadMaximaPasajeros(Integer cantidadMaximaPasajeros) {
		this.cantidadMaximaPasajeros = cantidadMaximaPasajeros;
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
	@Override
	public String toString() {
		return "Auto \n[getPatente()=" + getPatente() + ",\n getCantidadMaximaPasajeros()=" + getCantidadMaximaPasajeros()
				+ ",\n getVelocidadMaxima()=" + getVelocidadMaxima() + ",\n getLatitud()=" + getLatitud()
				+ ",\n getLongitud()=" + getLongitud();
	}

	

	
	
	
	



}
