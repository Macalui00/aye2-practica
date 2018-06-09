package Practica8;

public abstract class VehiculoMotorizado {
	protected String fabricante;
	protected String modelo;
	protected int a�oFabricacion;
	protected int kilometraje;
	
	public VehiculoMotorizado() {
	}
	
	public VehiculoMotorizado(String fabricante, String modelo, int a�o, int kilometraje) {
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.a�oFabricacion = a�o;
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

	public int getA�oFabricacion() {
		return a�oFabricacion;
	}

	public void setA�oFabricacion(int a�oFabricacion) {
		this.a�oFabricacion = a�oFabricacion;
	}

	public int getKilometraje() {
		return kilometraje;
	}

	public void setKilometraje(int kilometraje) {
		this.kilometraje = kilometraje;
	}
}
