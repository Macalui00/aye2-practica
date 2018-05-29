package practica7;

public abstract class Familia extends Categoria{
	private String nombreF;
	private ArrayList<Especie> especies;
	
	public Familia() {
		nombreF = "";
		ArrayList<Especie> especies = new Arraylist<>();
	}
	public Familia(String NF, ArrayList<Especie> esp) {
		nombreF = NF;
		especies = esp;
	}
	public String getNombreF() {
		return nombreF;
	}
	public void setNombreF(String nombreF) {
		this.nombreF = nombreF;
	}
	public ArrayList<Especie> getEspecies() {
		return especies;
	}
	public void setEspecies(ArrayList<Especie> especies) {
		this.especies = especies;
	}
	
	public abstract String getEspecie();
	public abstract CaracteristicaEspecie getEspCaract();
	
}
