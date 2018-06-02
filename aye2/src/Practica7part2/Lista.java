package Practica7part2;

public abstract class Lista<T extends Comparable<T>> implements Comparable<Lista<T>> {
	protected T head;
	protected Lista<T> tail;
	
	public Lista() {
	}
	
	public Lista(T dato) {
		head = dato;
	}

	public T getHead() {
		return head;
	}

	public void setHead(T head) {
		this.head = head;
	}

	public Lista<T> getTail() {
		return tail;
	}

	public void setTail(Lista<T> tail) {
		this.tail = tail;
	}
	
	
	public abstract void addElem(T dato);
	public abstract boolean esVacia(); 
	public abstract T sacarElem();

	public int compareTo(Lista<T> o) {
		return head.compareTo(o.getHead());
	}
}
