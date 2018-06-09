package Practica8;

public class Camion extends VehiculoMotorizado implements CapacidadLimite{
	private int remolques;
	private int nivelDeSeguridad;
	private int cantidadPasajeros;
	
	public Camion() {
		super();
	}
	
	public Camion(String fabricante, String modelo, int año, int kilometraje, int remolques, int cant) {
		super(fabricante, modelo, año, kilometraje);
		this.cantidadPasajeros = cant;
		this.remolques = remolques;
		this.nivelDeSeguridad = obtenerLimitePasajeros();
	}

	public int getCantidadPasajeros() {
		return cantidadPasajeros;
	}

	public void setCantidadPasajeros(int cantidadPasajeros) {
		this.cantidadPasajeros = cantidadPasajeros;
	}

	public int getRemolques() {
		return remolques;
	}

	public void setRemolques(int remolques) {
		this.remolques = remolques;
	}

	public int getNivelDeSeguridad() {
		return nivelDeSeguridad;
	}

	public void setNivelDeSeguridad(int nivelDeSeguridad) {
		this.nivelDeSeguridad = nivelDeSeguridad;
	}

	@Override
	public int obtenerLimitePasajeros() {
		if (cantidadPasajeros > limitePasajeros) {
			return 1;
		} else {
			return 2;
		}
	}
	
	@Override
	public String toString() {
		return "Auto: Fabricante:" + fabricante + ".\nModelo: " + modelo + ".\nAño fabricacion: " + añoFabricacion + ".\nKilometraje: " + kilometraje + ".\nCantidad de remolques: " + remolques + ".\nNivel de seguridad: " + nivelDeSeguridad + ".\nCantidad de pasajeros: " + cantidadPasajeros;
	}
}
