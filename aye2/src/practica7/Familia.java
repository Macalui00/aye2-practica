package practica7;

import java.util.ArrayList;

public abstract class Familia extends Categoria{
	private String nombreF;
	private ArrayList<Especie> especies = new ArrayList<>();
	
	public Familia() {
		super();
		nombreF = "";
	}
	public Familia(String NF, ArrayList<Especie> esp) {
		super();
		nombreF = NF;
		especies = esp;
	}
	@Override
	public String getFamiliaNombre() {
		return nombreF;
	}
	public void setNombreF(String nombreF) {
		this.nombreF = nombreF;
	}
	@Override
	public ArrayList<Especie> getEspecies() {
		return especies;
	}
	public void setEspecies(ArrayList<Especie> especies) {
		this.especies = especies;
	}
	
	public abstract String getEspecie();
	public abstract CaracteristicaEspecie getEspCaract();
	
}
