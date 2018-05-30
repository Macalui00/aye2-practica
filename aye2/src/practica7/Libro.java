package practica7;

public class Libro extends Publicacion {
	private int cantpaginas;
	private int año;
	
	public Libro() {
		super();
		cantpaginas = 0;
		año = 0;
	}
	public Libro(String t, float p, int cantp, int a) {
		super(t, p);
		cantpaginas = cantp;
		año = a;
	}
	
	public void setCantpaginas(int cantpaginas) {
		this.cantpaginas = cantpaginas;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public int getcantpaginas() {
		return cantpaginas;
	}

	public int getaño() {
		return año;
	}
	
	
	
}
