package Practica7parte4;

public class Libro {
	private String nombre;
	private String autor;
	private String editorial;
	private int añoPublicacion;
	private int numeracion;    //en orden
	
	public Libro() {
		this.nombre = "";
		this.autor = "";
		this.editorial = "";
		this.añoPublicacion = 0;
		this.numeracion = 0;
	}
	
	public Libro(String n, String a, String e, int año) {
		this.nombre = n;
		this.autor = a;
		this.editorial = e;
		this.añoPublicacion = año;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public int getAñoPublicacion() {
		return añoPublicacion;
	}

	public void setAñoPublicacion(int añoPublicacion) {
		this.añoPublicacion = añoPublicacion;
	}

	public int getNumeracion() {
		return numeracion;
	}

	public void setNumeracion(int numeracion) {
		this.numeracion = numeracion;
	}
	
	public boolean sonIguales(Libro l) {
		if (nombre == l.getNombre() && editorial == l.getEditorial() && autor == l.getAutor() && añoPublicacion == l.getAñoPublicacion()) {
			return true;
		} else {
			return false;
		}
	}
}
