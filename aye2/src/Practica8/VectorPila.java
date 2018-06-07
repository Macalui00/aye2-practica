package Practica8;

import java.util.Scanner;

public class VectorPila implements Pila{
	private int tama�o;
	private int tope;
	private int[] pila;
	private Scanner s;
	
	public VectorPila() {
	}
	
	public VectorPila(int tama�o, int[] elementos) {
		this.tama�o = tama�o;
		this.tope = elementos.length;
		int[] pila = new int[tama�o];
		this.pila = elementos;
	}
	
	public void setPila(int tama�o) {
		this.tama�o = tama�o;
		int[] pila = new int[tama�o];
	}

	@Override
	public void encolar(int a) {
		if (!esPilaLlena()) {
			this.tope = tope + 1;
			this.pila[tope] = a;
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
		int resultado;
		if (esPilaVacia()) {
			int[] elems = new int[tama�o];
			int tope = 1;
			s = new Scanner(System.in);
			while(s.hasNext() && tope <= tama�o) {
				System.out.println("ingrese un entero: ");
				int a = s.nextInt();
				elems[tope] = a;
				tope = tope + 1;
			}
			resultado = elems[tope];
			VectorPila p = new VectorPila(tama�o, elems);
			this.tope = p.tope;
			this.tama�o = p.tama�o;
			this.pila = p.pila;
		} else {
			resultado = pila[tope];
		}
		tope = tope - 1;
		return resultado;
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
