package Practica8;

public class Motocicleta extends VehiculoMotorizado {
	private String uso;
	
	public Motocicleta() {
		super();
	}
	
	public Motocicleta(String fabricante, String modelo, int a�o, int kilometraje, String uso) {
		super(fabricante, modelo, a�o, kilometraje);
		this.uso = uso;
	}

	public String getUso() {
		return uso;
	}

	public void setUso(String uso) {
		this.uso = uso;
	}
	
	@Override
	public String toString() {
		return "Auto: Fabricante:" + fabricante + ".\nModelo: " + modelo + ".\nA�o fabricacion: " + a�oFabricacion + ".\nKilometraje: " + kilometraje + ".\nUso: " + uso;
	}
}
