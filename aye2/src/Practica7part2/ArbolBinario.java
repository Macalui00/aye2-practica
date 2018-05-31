package Practica7part2;

import java.util.ArrayList;
import java.util.List;

public class ArbolBinario<T extends Comparable<T>> implements Comparable<ArbolBinario<T>>{
	//lo definimos con tipo generics, porque puede contener cualquier cosa dentro.
	//comparable tambien es generico. el arbol binario va a tener un tipo T el cual va a ser comparable
	//estamos implemetando el comparable. y decimos que nuestro arbol tambien puede ser comparable
	
	private T raiz;
	private ArbolBinario<T> si;
	private ArbolBinario<T> sd; // actualmente null, las primitivas son cero y las booleanas son false, inicialmente.
	int  alturaArb;
	private static List<Object> lista;
	
	
	public ArbolBinario(T dato) { // el constructor te va a obligar si o si a que tenga un elemento en raiz
		raiz = dato;  // no hace falta definir si y sd como null, implicitamente ya lo estan
	
	}

	public T getRaiz() {
		return raiz;
	}

	public void setRaiz(T raiz) {
		this.raiz = raiz;
	}

	public ArbolBinario<T> getSi() {
		return si;
	}

	public void setSi(ArbolBinario<T> si) {
		this.si = si;
	}

	public ArbolBinario<T> getSd() {
		return sd;
	}

	public void setSd(ArbolBinario<T> sd) {
		this.sd = sd;
	}
	
	public void insertar(T dato) {
		int comparacion = raiz.compareTo(dato);
		if (comparacion > 0) {
			//Caso Base
			if (si == null) {
				si = new ArbolBinario<T>(dato);
			} else {
				//caso recursivo
				si.insertar(dato);
			}
		} else {
			if (comparacion < 0) {
				//caso base
				if(sd == null) {
					sd = new ArbolBinario<T>(dato);
				} else {
					//caso recursivo
					sd.insertar(dato);
				}
			}
		}
		
	}
	
	public boolean esHoja() {
		return si == null && sd == null;
	}

	public int altura() {
		// Caso base
		if (esHoja()) {
			return 1;
		} else {
			int alturaI = 0;
			int alturaD = 0;
			if (si != null) {
				alturaI = si.altura();
			} 
			if (sd != null) {
				alturaD = sd.altura();
			}
			return 1 + Math.max(alturaI, alturaD);
		}
	}
	
	public List<Object> inOrder(){
		lista = new ArrayList<>();
		inOrder2();
		return lista;
	}
	
	public void inOrder2(){
		if (si != null) {
			si.inOrder2();
		}
		lista.add(getRaiz());
		if (sd != null) {
			sd.inOrder2();
		}
	}
	
	public void mostrarInOrder() {
		if (si != null) {
			si.mostrarInOrder();
		}
		System.out.println(getRaiz());
		if (sd != null) {
			sd.mostrarInOrder();
		}
	}
	
	@Override
	public int compareTo(ArbolBinario<T> o) {
		return raiz.compareTo(o.getRaiz());
	}
	
	public static void main(String args[]) {
		ArbolBinario<Integer> arbol = new ArbolBinario<>(10);
		arbol.insertar(4);
		arbol.insertar(8);
		arbol.insertar(15);
		arbol.insertar(11);
		arbol.insertar(1);
		arbol.insertar(3);
		arbol.insertar(9);
		arbol.insertar(10);
		
		List<Object> lista = arbol.inOrder();
		
		System.out.println("listado InOrder: ");
		
		for(Object x : lista) {
			System.out.println((Integer) x);
		}
		
		/*
		 * for(Object x : lista) {
		 * downcasting object --> integer
		 * x = (integer) x + 10;
		 * llama al x.toString()
		 * mediante binding dinamico se llama al tostring de integer
		 * porque dentro de x hay una instancia de objeto de tipo Integer
		 * system.out.println(x);
			System.out.println(x);
		}*/
		
		//otra manera es (desde llama al... hasta el system.out.println fuera del for.
		System.out.println("Altura: " + arbol.altura());
	}
	
}
