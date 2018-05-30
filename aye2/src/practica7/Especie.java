package practica7;

public class Especie extends Familia{
	private String nombreE;
	private CaracteristicaEspecie CaractEsp = new CaracteristicaEspecie();
	
	public Especie() {
		nombreE = "";
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
	@Override
	public String getEspecie() {
		return nombreE;
	}
	@Override
	public CaracteristicaEspecie getEspCaract() {
		return CaractEsp;
	}
	
	
}
