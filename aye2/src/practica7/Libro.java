package practica7;

public class Libro extends Publicacion {
	private int cantpaginas;
	private int a�o;
	
	public Libro() {
		super();
		cantpaginas = 0;
		a�o = 0;
	}
	public Libro(String t, float p, int cantp, int a) {
		super(t, p);
		cantpaginas = cantp;
		a�o = a;
	}
	
	public void setCantpaginas(int cantpaginas) {
		this.cantpaginas = cantpaginas;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	public int getcantpaginas() {
		return cantpaginas;
	}

	public int geta�o() {
		return a�o;
	}
	
	
	
}
