package Practica8;

public class Motocicleta extends VehiculoMotorizado {
	private String uso;
	
	public Motocicleta() {
		super();
	}
	
	public Motocicleta(String fabricante, String modelo, int año, int kilometraje, String uso) {
		super(fabricante, modelo, año, kilometraje);
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
		return "Auto: Fabricante:" + fabricante + ".\nModelo: " + modelo + ".\nAño fabricacion: " + añoFabricacion + ".\nKilometraje: " + kilometraje + ".\nUso: " + uso;
	}
}
