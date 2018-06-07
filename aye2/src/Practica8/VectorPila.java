package Practica8;

import java.util.Scanner;

public class VectorPila implements Pila{
	private int tamaño;
	private int tope;
	private int[] pila;
	private Scanner s;
	
	public VectorPila() {
	}
	
	public VectorPila(int tamaño, int[] elementos) {
		this.tamaño = tamaño;
		this.tope = elementos.length;
		int[] pila = new int[tamaño];
		this.pila = elementos;
	}
	
	public void setPila(int tamaño) {
		this.tamaño = tamaño;
		int[] pila = new int[tamaño];
	}

	@Override
	public void encolar(int a) {
		if (!esPilaLlena()) {
			this.tope = tope + 1;
			this.pila[tope] = a;
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
		int resultado;
		if (esPilaVacia()) {
			int[] elems = new int[tamaño];
			int tope = 1;
			s = new Scanner(System.in);
			while(s.hasNext() && tope <= tamaño) {
				System.out.println("ingrese un entero: ");
				int a = s.nextInt();
				elems[tope] = a;
				tope = tope + 1;
			}
			resultado = elems[tope];
			VectorPila p = new VectorPila(tamaño, elems);
			this.tope = p.tope;
			this.tamaño = p.tamaño;
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
