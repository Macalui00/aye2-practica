package Practica8;

import java.util.ArrayList;

public class ListaPila implements Pila {
	private int tama�o;
	private int tope;
	private ArrayList<Integer> pila;
	
	public ListaPila() {
	}
	
	public ListaPila(int tama�o) {
		this.tama�o = tama�o;
	}

	@Override
	public void encolar(int a) {
		if (!esPilaLlena()) {
			this.tope = tope + 1;
			this.pila.add(a);
		} 
	}
	
	public boolean esPilaLlena() {
		if (tope == tama�o) {
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
