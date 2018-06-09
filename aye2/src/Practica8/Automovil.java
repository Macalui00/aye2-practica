package Practica8;

public class Automovil extends VehiculoMotorizado implements CapacidadLimite{
	private String estilo;
	private int limitePasajeros;
	
	public Automovil() {
	}
	
	public Automovil(String fabricante, String modelo, int a�o, int kilometraje, String estilo) {
		super(fabricante, modelo, a�o, kilometraje);
		this.estilo = estilo;
		this.limitePasajeros = obtenerLimitePasajeros();
	}
	
	public int getLimitePasajeros() {
		return limitePasajeros;
	}

	public void setLimitePasajeros() {
		this.limitePasajeros = obtenerLimitePasajeros();
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	@Override
	public int obtenerLimitePasajeros() {
		if (estilo == "Van") {
			return limitePasVan;
		} else {
			return limitePasAuto;
		}
	}
	
	@Override
	public String toString() {
		return "Auto: Fabricante:" + fabricante + ".\nModelo: " + modelo + ".\nA�o fabricacion: " + a�oFabricacion + ".\nKilometraje: " + kilometraje + ".\nEstilo: " + estilo + ".\nLimite pasajeros: " + limitePasajeros;
	}
}
