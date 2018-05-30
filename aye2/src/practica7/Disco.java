package practica7;

public class Disco extends Publicacion {
	private int duracion;
	
	public Disco() {
		super();
		duracion = 0;
	}
	public Disco(String t, float p, int d) {
		super(t, p);
		duracion = d;
	}
	
	public int getduracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	
	
}
