package practica7;

public abstract class Clasificacion extends Animal{
	private String clasificacion;
	
	public Clasificacion() {
		clasificacion = "";
	}
	
	public Clasificacion(String C) {
		clasificacion = C;
	}
	
	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}

	@Override
	public String getClasificacion() {
		return clasificacion;
	}
	
	public abstract String getCategoriaNombre();
	public abstract CaractCat getCategoriaCaract();
}
