package Practica7parte4;

import java.util.ArrayList;
import java.util.Iterator;
//PROBLEMAS
public class Estanteria {
	private ArrayList<ArrayList<Libro>> estantes;
	
	public Estanteria() {
	}
	
	public Estanteria(ArrayList<ArrayList<Libro>> est) {
		this.estantes = est;
	}
	
	public void agregarEstanteVacio() {
		ArrayList<Libro> estante = new ArrayList<>();
		estantes.add(estante);
	}
	
	public void agregarEstante(ArrayList<Libro> estante) {
		enumerarLibros(estante, estantes);
		estantes.add(estante);
	}
	
	public void enumerarLibros(ArrayList<Libro> estanteb, ArrayList<ArrayList<Libro>> estantesb) {
		int numeracion = 1;
		if (!estantesb.isEmpty()) {
			ArrayList<Libro> ultimoEstante = estantesb.get(estantesb.size() - 1);
			Libro ultimoLibro = ultimoEstante.get(ultimoEstante.size() - 1);
			System.out.println(ultimoLibro.getNombre() + ", numeracion 1: " + ultimoLibro.getNumeracion());
			numeracion = ultimoLibro.getNumeracion() + 1; 
			//obtengo la numeracion del ultimo libro de la ultima estanteria y le sumo 1 para el proximo libro
		}
		for (Libro l: estanteb) {
			l.setNumeracion(numeracion);
			System.out.println(l.getNombre() + ", numeracion 3: " + l.getNumeracion());
			numeracion = numeracion + 1;
		}
	}
	
	public void agregarLibro(Libro libro) {
		if (!(existeLibro(libro))) {
			int numeracion = 0;
			if(!estantes.isEmpty()) {
				int elemento = estantes.size() - 1;
				ArrayList<Libro> ultimoEstante = estantes.get(elemento);
				Libro ultimoLibro = new Libro();
				if (!ultimoEstante.isEmpty()) {
					ultimoLibro = ultimoEstante.get(ultimoEstante.size() - 1);
				} else {
					elemento = elemento - 1;
					while(elemento > 0 && !estantes.isEmpty() && ultimoEstante.isEmpty()) {
						ultimoEstante = estantes.get(elemento);	
					}
					if (!ultimoEstante.isEmpty()) {
						ultimoLibro = ultimoEstante.get(ultimoEstante.size() - 1);
					}
				}
				numeracion = ultimoLibro.getNumeracion();
				libro.setNumeracion(numeracion + 1);
				estantes.get(estantes.size()-1).add(libro);
				System.out.println(libro.getNombre() + ", numeracion5: " + libro.getNumeracion());
			} else {
				ArrayList<Libro> estante = new ArrayList<>();
				libro.setNumeracion(1);
				estante.add(libro);
				agregarEstante(estante);
			}
		} else {
			System.out.println("Libro ya existente.");
			mostrarPosicionLibro(libro);
		}
	}
	
	public boolean existeLibro(Libro libro) {
		boolean existe = false;
		for(ArrayList<Libro> estante: estantes) {
			for(Libro l: estante) {
				if (l.sonIguales(libro)) {
					existe = true;
				}
			}
		}
		return existe;
	}
	
	public void mostrarPosicionLibro(Libro libro) {
		boolean encontrado = false;
		int cantEstantes = 0;
		Libro libroEncontrado;
		Iterator<ArrayList<Libro>> it = estantes.iterator();
    	while(it.hasNext() && !encontrado) {
    		cantEstantes = cantEstantes + 1;
    		ArrayList<Libro> estante = (ArrayList<Libro>) it.next();
    		Iterator<Libro> it2 = estante.iterator();
    		while(it.hasNext() && !encontrado) {
    			libroEncontrado = (Libro) it2.next();
    			if (libro.sonIguales(libroEncontrado)) {
    				encontrado = true;
    				System.out.println("El libro: " + libro.getNombre() + ", se encuentra en el estante número: " + 
    				cantEstantes + ", es el libro numero: " + libroEncontrado.getNumeracion());
    			}
    		}
    		
    	}
    	if (!encontrado) {
    		System.out.println("No se encontró el libro en las estanterias.");
    	}
	}
	
	/*public void EliminarLibro(Libro l) {
		int numero = 0;
		if (existeLibro(l)) {
			boolean encontrado = false;
			Iterator<ArrayList<Libro>> it = estantes.iterator();
			while(it.hasNext()) {
				ArrayList<Libro> estante = (ArrayList<Libro>) it.next();
				Iterator<Libro> it2 = estante.iterator();
				while(it2.hasNext()) {
					Libro libroActual = it2.next();
					if (libroActual.sonIguales(l)) {
						encontrado = true;
						numero = libroActual.getNumeracion();
						System.out.println(libroActual.getNombre() + ", numeracion: " + libroActual.getNumeracion());
						estante.remove(libroActual);
					} else {
						if (encontrado) {
							System.out.println(libroActual.getNombre() + ", numeracion: " + libroActual.getNumeracion());
							it2.next().setNumeracion(numero - 1);
							numero = numero - 1;
							System.out.println(libroActual.getNombre() + ", numeracion: " + libroActual.getNumeracion());
						}
					}
				}
    		
			}
		} else {
			System.out.println("No se encontró el libro en las estanterias.");
		}
	}*/
	
	public void EliminarLibro(Libro l) {

		if (existeLibro(l)) {
			Libro libroEncontrado = new Libro();
			ArrayList<Libro> estanteEncontrado = new ArrayList<>();
			boolean encontrado = false;
			int numero = 0;
			for(ArrayList<Libro> estante: estantes) {
				for(Libro libroActual: estante) {
					if (libroActual.sonIguales(l)) {
						encontrado = true;
						numero = libroActual.getNumeracion();
						System.out.println(libroActual.getNombre() + ", numeracion: " + libroActual.getNumeracion());
						libroEncontrado = libroActual;
						estanteEncontrado = estante;
					} else {
						if (encontrado) {
							System.out.println(libroActual.getNombre() + ", numeracion: " + libroActual.getNumeracion());
							libroActual.setNumeracion(numero);
							numero = numero - 1;
							System.out.println(libroActual.getNombre() + ", numeracion: " + libroActual.getNumeracion());
						}
					}
				}
			}
			estanteEncontrado.remove(libroEncontrado);
		} else {
			System.out.println("No se encontró el libro en las estanterias.");
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Libro> estante = new ArrayList<>();
		Libro l1 = new Libro("Los Tres Chanchitos", "Fulanito", "Alfaguara", 2017);
		Libro l2 = new Libro("Manuelita", "Maria Elena Walsh", "Alfaguara", 2016);
		Libro l3 = new Libro("Manuelita", "Maria Elena Walsh", "Alfaguara", 2016);
		Libro l4 = new Libro("Aprender a contar", "Edgardo Rogelio", "Tinta Azul", 2001);
		ArrayList<ArrayList<Libro>> estantes = new ArrayList<>();
		estante.add(l1);
		estante.add(l2);
		Estanteria estanteria = new Estanteria(estantes);
		estanteria.agregarEstante(estante);
		estanteria.agregarEstanteVacio();
		estanteria.agregarLibro(l3);  //l3 es IGUAL a l2 : por eso dice Libro ya existente.
		estanteria.agregarLibro(l3);
		estanteria.agregarLibro(l4);
		estanteria.EliminarLibro(l2);
	}
	
}
