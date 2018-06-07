package Practica7parte4;

public class ArrayPila<E> {
	private int tamaño;
	private int tope;
	private E[] pila;
	
	public ArrayPila() {
	}
	
	public ArrayPila(int tamaño, int tope) {
		this.tamaño = tamaño;
		this.tope = tope;
		this.pila = (E[]) new Object[tamaño] ;
	}
	public void setPila(int tamaño) {
		this.tamaño = tamaño;
		this.pila = (E[]) new Object[tamaño];
	}
	
	public void Push(E e) {
		if (!esPilaLlena()) {
			tope = tope + 1;
			pila[tope] = e;
		} else {
			System.out.println("Pila llena");
		}
	}
	
	public boolean esPilaLlena() {
		if (tope < tamaño) {
			return false;
		} else {
			return true;
		}
	}
	
	public boolean esPilaVacia() {
		if (tope != 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public E Pop() {
		if (!esPilaVacia()) {
			E e = pila[tope];
			tope = tope - 1;
			return e;
		} else {
			return null;
		}
	}
	
	public int size() {
		return tope;
	}
	
	
	public static void main(String[] args) {
		ArrayPila<Integer> pila = new ArrayPila<>();
		pila.setPila(3);
		pila.Push(4);
		pila.Push(3);
		pila.Push(5);
		pila.Push(3);
		while(!pila.esPilaVacia()) {
			pila.Pop();
		}
		if(pila.Pop() == null) {
			System.out.println("No quedan elementos en la pila.");
		} 
	}
}
