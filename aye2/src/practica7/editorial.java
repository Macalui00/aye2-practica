package practica7;

public class editorial {

	public static void main(String[] args) {
		Libro libro = new Libro("cocina", 23.0f, 70, 2017);
		Disco disco = new Disco("Top 50", 40.0f, 60);
		
		System.out.println("Nombre del libro: " + libro.getTitulo() + "\nPrecio: " + libro.getPrecio() +
				"\nCantidad de paginas: " + libro.getcantpaginas() + "\nAño de publicacion: " + libro.getaño());
		System.out.println("Nombre del disco: " + disco.getTitulo() + "\nPrecio: " + disco.getPrecio() + 
				"\nDuracion en minutos: " + disco.getduracion());

	}

}
