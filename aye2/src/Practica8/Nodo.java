package Practica8;

import java.util.ArrayList;

public class Nodo<V> {
	private int id;
	private V v;
	private ArrayList<Nodo<V>> nodosAdy;
	private static int proximoid;
	
	public Nodo() {
		this.id = proximoid;
		proximoid++;
	}
	
	public Nodo(V v) {
		this.id = proximoid;
		proximoid++;
		this.v = v;
		this.nodosAdy = new ArrayList<>();
	}
	
	public ArrayList<Nodo<V>> getNodosAdy() {
		return nodosAdy;
	}

	public void setNodosAdy(ArrayList<Nodo<V>> nodosAdy) {
		this.nodosAdy = nodosAdy;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public V getV() {
		return v;
	}

	public void setV(V v) {
		this.v = v;
	}
	
	public boolean equals(Nodo<V> nodo) {
		return id == nodo.getId();
	}
	
}
