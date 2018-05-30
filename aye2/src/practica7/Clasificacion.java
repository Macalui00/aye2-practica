package practica7;

public abstract class Clasificacion extends Animal{
	protected String clasificacion;
	
	public Clasificacion() {
		super();
		clasificacion = "";
	}
	
	public Clasificacion(String C) {
		super();
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
