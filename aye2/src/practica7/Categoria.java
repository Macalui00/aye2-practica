package practica7;

import java.util.ArrayList;

public abstract class Categoria extends Clasificacion {
	private String categoria;
	private CaractCat Caractcat;
	
	public Categoria() {
		categoria = "";
		CaractCat Caractcat = new CaractCat();
	}
	
	public Categoria(String Cat, CaractCat Car) {
		categoria = Cat;
		Caractcat = Car;
	}
	
	@Override
	public String getCategoriaNombre() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	@Override
	public CaractCat getCategoriaCaract() {
		return Caractcat;
	}

	public void setCaracteristicas(CaractCat caracteristicas) {
		Caractcat = caracteristicas;
	}
	
	public abstract String getFamiliaNombre();
	public abstract ArrayList<Especie> getEspecies();
}
