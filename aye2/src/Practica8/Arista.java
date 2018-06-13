package Practica8;

public class Arista<V> {
	private Nodo<V> nodoOrig;
	private Nodo<V> nodoDest;
	
	public Arista() {
	}
	
	public Arista(Nodo<V> nodoOrig, Nodo<V> nodoDest) {
		this.nodoOrig = nodoOrig;
		this.nodoDest = nodoDest;
	}

	public Nodo<V> getNodoOrig() {
		return nodoOrig;
	}

	public void setNodoOrig(Nodo<V> nodoOrig) {
		this.nodoOrig = nodoOrig;
	}

	public Nodo<V> getNodoDest() {
		return nodoDest;
	}

	public void setNodoDest(Nodo<V> nodoDest) {
		this.nodoDest = nodoDest;
	}
	
	
	
}
