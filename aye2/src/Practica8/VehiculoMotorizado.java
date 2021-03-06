package Practica8;

public abstract class VehiculoMotorizado {
	protected String fabricante;
	protected String modelo;
	protected int aņoFabricacion;
	protected int kilometraje;
	
	public VehiculoMotorizado() {
	}
	
	public VehiculoMotorizado(String fabricante, String modelo, int aņo, int kilometraje) {
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.aņoFabricacion = aņo;
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

	public int getAņoFabricacion() {
		return aņoFabricacion;
	}

	public void setAņoFabricacion(int aņoFabricacion) {
		this.aņoFabricacion = aņoFabricacion;
	}

	public int getKilometraje() {
		return kilometraje;
	}

	public void setKilometraje(int kilometraje) {
		this.kilometraje = kilometraje;
	}
}
