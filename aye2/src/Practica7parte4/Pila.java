package Practica7parte4;

import java.util.ArrayList;

public class Pila<E> {
	private int tope;
	private int tamaño;
	private ArrayList<E> pila;
	
	public Pila() {
	}
	
	public Pila(int tope, int tamaño, E e) {
		  this.tope = tope + 1;
		  this.pila.add(e);
		  this.tamaño = tamaño;
	}
	
	public int getTope() {
		return tope;
	}
	
	public boolean esPilaVacia() {
		if (tope == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public void Push(E e) {
		if(tope < tamaño) {
			tope = tope + 1;
			pila.add(e);
		} else {
			System.out.println("Pila llena.");
		}
	}
	
	public E Pop() {
		if (!esPilaVacia()) {
			E e1 = pila.get(pila.size());
			this.pila.remove(pila.size());
			tope = tope - 1;
			return e1;
		} else {
			return null;
		}
	}
	
	public int size() {
		return tope;
	}
	
	
	public static void main(String[] args) {
		Pila<Integer> pila = new Pila<>();
		pila.Push(9);
		pila.Pop();
		if (pila.Pop() == null) {
			System.out.println("No hay elementos en la pila para sacar.");
		}
		pila.Push(1);
		pila.Push(3);
		pila.Push(10);
		System.out.println("El tamaño de la pila es de: " + pila.size());
	}

}
