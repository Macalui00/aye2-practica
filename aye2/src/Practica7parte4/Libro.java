package Practica7parte4;

public class Libro {
	private String nombre;
	private String autor;
	private String editorial;
	private int a�oPublicacion;
	private int numeracion;    //en orden
	
	public Libro() {
		this.nombre = "";
		this.autor = "";
		this.editorial = "";
		this.a�oPublicacion = 0;
		this.numeracion = 0;
	}
	
	public Libro(String n, String a, String e, int a�o) {
		this.nombre = n;
		this.autor = a;
		this.editorial = e;
		this.a�oPublicacion = a�o;
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

	public int getA�oPublicacion() {
		return a�oPublicacion;
	}

	public void setA�oPublicacion(int a�oPublicacion) {
		this.a�oPublicacion = a�oPublicacion;
	}

	public int getNumeracion() {
		return numeracion;
	}

	public void setNumeracion(int numeracion) {
		this.numeracion = numeracion;
	}
	
	public boolean sonIguales(Libro l) {
		if (nombre == l.getNombre() && editorial == l.getEditorial() && autor == l.getAutor() && a�oPublicacion == l.getA�oPublicacion()) {
			return true;
		} else {
			return false;
		}
	}
}
