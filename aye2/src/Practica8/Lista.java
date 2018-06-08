package Practica8;

import java.util.ArrayList;

public class Lista<T extends Comparable<T>> implements Comparable<Lista<T>> {
	private T head;
	private Lista<T> tail;
	
	public Lista() {
	}
	
	public Lista(T t) {
		this.head = t;
	}
	
	public void addElem(T t) {
		if (head == null) {
			this.head = t;
		} else {
			this.tail.addElem(t);
		}
	}
	
	public Lista<T> getTail() {
		return tail;
	}

	public void setTail(Lista<T> tail) {
		this.tail = tail;
	}

	public T getHead() {
		return head;
	}

	public void setHead(T head) {
		this.head = head;
	}
	
	public void ordenar() {
		Lista<T> listaOrd = new Lista<>();
		if (head != null) {
			if(tail != null) {
				buscarMenorTodos();
				while(tail != null) {
					T menor = buscarMenor();
					listaOrd.addElem(menor);
				}
				setTail(listaOrd);
			}
		}
	}
	
	private T buscarMenor() {
		T menor = null;
		if (head != null) {
			menor = head;
			if (tail != null) {
				if(menor.compareTo(tail.getHead()) > 0) {
					menor = tail.getHead();
					tail = tail.getTail();
				}
			} else {
				head = null;
			}
		}
		return menor;
	}

	
	public int size() {
		int cont = 0;
		if (head != null) {
			cont = cont + 1;
			if (tail != null) {
				tail.size();
			}
		} 
		return cont;
	}
	
	public T get(int c) {
		T result = null;
		if(c == 1) {
			result = head;
		} else {
			c = c - 1;
			tail.get(c);
		}
		return result;
	}
	
	private void buscarMenorTodos() {
		T menor = head;
		int contador = size();
		while (contador > 0){
			if (head.compareTo(tail.get(contador)) < 0) {
				menor = head;
				head = tail.getHead();
				tail.setHead(menor);
				contador = contador - 1;
			} 
		}
		
		if (menor.compareTo(head) > 0) {
			T adicional = menor;
			menor = head;
			head = adicional;
		}
	}

	
	@Override
	public int compareTo(Lista<T> o) {
		return head.compareTo(o.getHead());
	}
	
	public static void manin(String[] args) {
		Lista<Integer> enteros = new Lista<>();
		enteros.addElem(9);
		enteros.addElem(6);
		enteros.addElem(7);
		
		enteros.ordenar();
		while(enteros.getTail() != null) {
			System.out.println(enteros.getHead());
			enteros.setTail(enteros.getTail().getTail());
		}
		if (enteros.getHead() != null) {
			System.out.println(enteros.getHead());
		}
	}
}
