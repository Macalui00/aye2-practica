package Practica8;

public class Nodo<V> {
	private int id;
	private V v;
	
	public Nodo() {
	}
	
	public Nodo(int id,V v) {
		this.id = id;
		this.v = v;
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
	
}
