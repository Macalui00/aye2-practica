package practica7;

public abstract class Publicacion {
	protected String titulo;
	protected float precio;
	
	public Publicacion() {
		titulo = "";
		precio = 0;
	}
	
	public Publicacion(String t, float p) {
		titulo = t;
		precio = p;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
}
