package practica7;

public class Especie {
	private String nombreE;
	private CaracteristicaEspecie CaractEsp;
	
	public Especie() {
		nombreE = "";
		CaracteristicaEspecie CaractEsp = new CaracteristicaEspecie();
	}
	public Especie(String N, CaracteristicaEspecie CE) {
		nombreE = N;
		CaractEsp = CE;
	}
	public String getNombreE() {
		return nombreE;
	}
	public void setNombreE(String nombreE) {
		this.nombreE = nombreE;
	}
	public CaracteristicaEspecie getCaractEsp() {
		return CaractEsp;
	}
	public void setCaractEsp(CaracteristicaEspecie caractEsp) {
		CaractEsp = caractEsp;
	}
	
	
}
