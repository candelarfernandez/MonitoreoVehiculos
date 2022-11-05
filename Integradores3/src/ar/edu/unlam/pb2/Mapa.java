package ar.edu.unlam.pb2;

import java.util.HashSet;
import java.util.Set;

public class Mapa {
	private String nombreCiudad;
	private Set<Vehiculo> colision;
	

	public Mapa(String nombreCiudad) {
		this.nombreCiudad=nombreCiudad;
		this.colision= new HashSet<>();
	}
	
	public String getNombreCiudad() {
		return nombreCiudad;
	}

	public void setNombreCiudad(String nombreCiudad) {
		this.nombreCiudad = nombreCiudad;
	}
	public Set<Vehiculo> getColision() {
		return colision;
	}
	public void setColision(Set<Vehiculo> colision) {
		this.colision = colision;
	}

	public void agregarVehiculo(Vehiculo vehiculo) {
		this.colision.add(vehiculo);
		
	}

	public Integer getCantidadDeVehiculos() {
		// TODO Auto-generated method stub
		return this.colision.size();
	}

	public boolean hayCoalición() throws ColitionException {
		if(this.colision != null) {
			return true;
		}
	 throw new ColitionException();
	}
	
	
	
	

}
