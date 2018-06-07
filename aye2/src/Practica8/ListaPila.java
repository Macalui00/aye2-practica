package Practica8;

import java.util.ArrayList;

public class ListaPila implements Pila {
	private int tamaño;
	private int tope;
	private ArrayList<Integer> pila;
	
	public ListaPila() {
	}
	
	public ListaPila(int tamaño) {
		this.tamaño = tamaño;
	}

	@Override
	public void encolar(int a) {
		if (!esPilaLlena()) {
			this.tope = tope + 1;
			this.pila.add(a);
		} 
	}
	
	public boolean esPilaLlena() {
		if (tope == tamaño) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public int desencolar() {
		if (!esPilaVacia()) {
			int a = pila.get(tope);
			pila.remove(tope);
			tope = tope - 1;
			return a;
		} else {
			return 0;
		}
	}

	@Override
	public boolean esPilaVacia() {
		if (tope == 0) {
			return true;
		} else {
			return false;
		}
	}

}
