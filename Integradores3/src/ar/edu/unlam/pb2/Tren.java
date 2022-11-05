package ar.edu.unlam.pb2;

public class Tren extends Vehiculo {
	private Integer cantidadDeVagones;
	private Integer cantidadDePasajerosPorVagon;
	private Integer velocidadMaxima;
	private Double latitud;
	private Double longitud;
	
	public Tren(Double coordenadas, Integer cantidadDeVagones, Integer cantidadDePasajerosPorVagon, Integer velocidadMaxima, Double latitud,
			Double longitud) {
		super(coordenadas);
		this.cantidadDeVagones = cantidadDeVagones;
		this.cantidadDePasajerosPorVagon = cantidadDePasajerosPorVagon;
		this.velocidadMaxima = velocidadMaxima;
		this.latitud = latitud;
		this.longitud = longitud;
	}
	public Integer getCantidadDeVagones() {
		return cantidadDeVagones;
	}
	public void setCantidadDeVagones(Integer cantidadDeVagones) {
		this.cantidadDeVagones = cantidadDeVagones;
	}
	public Integer getCantidadDePasajerosPorVagon() {
		return cantidadDePasajerosPorVagon;
	}
	public void setCantidadDePasajerosPorVagon(Integer cantidadDePasajerosPorVagon) {
		this.cantidadDePasajerosPorVagon = cantidadDePasajerosPorVagon;
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
	
	

}
