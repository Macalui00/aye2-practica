package Practica8;

public abstract class VehiculoMotorizado {
	protected String fabricante;
	protected String modelo;
	protected int añoFabricacion;
	protected int kilometraje;
	
	public VehiculoMotorizado() {
	}
	
	public VehiculoMotorizado(String fabricante, String modelo, int año, int kilometraje) {
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.añoFabricacion = año;
		this.kilometraje = kilometraje;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAñoFabricacion() {
		return añoFabricacion;
	}

	public void setAñoFabricacion(int añoFabricacion) {
		this.añoFabricacion = añoFabricacion;
	}

	public int getKilometraje() {
		return kilometraje;
	}

	public void setKilometraje(int kilometraje) {
		this.kilometraje = kilometraje;
	}
}
