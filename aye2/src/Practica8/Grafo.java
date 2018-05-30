package Practica8;

import java.util.ArrayList;

public interface Grafo<V> {
	
	public void addNodo(V v);
	public void addArista(V vorig, V vdest);
	public ArrayList<Nodo<V>> obtenerVecinos(Nodo<V> vertice);
	
	/*private ArrayList<Nodo<V>> nodos;
	private ArrayList<Arista<V>> aristas;
	
	public Grafo(){
	}
	
	public Grafo(Nodo<V> n) {
		if (!nodos.contains(n)){
			nodos.add(n);
		}
	}
	
	public Grafo(Arista<V> a) {
		addNodo(a.getNodoOrig());
		addNodo(a.getNodoDest());
		if (!aristas.contains(a)) {
			this.aristas.add(a);
		}
	}
	
	public void addNodo(Nodo<V> n) {
		if (!nodos.contains(n)){
			this.nodos.add(n);
		}
	}
	
	public void addArista(Arista<V> a) {
		addNodo(a.getNodoOrig());
		addNodo(a.getNodoDest());
		if (!aristas.contains(a)) {
			this.aristas.add(a);
		}
	}
	
	public ArrayList<Nodo<V>> getNodos() {
		return nodos;
	}

	public void setNodos(ArrayList<Nodo<V>> nodos) {
		this.nodos = nodos;
	}

	public ArrayList<Arista<V>> getAristas() {
		return aristas;
	}

	public void setAristas(ArrayList<Arista<V>> aristas) {
		this.aristas = aristas;
	}
	
	public ArrayList<Nodo<V>> obtenerVecinos(Nodo<V> n){
		ArrayList<Nodo<V>> vecinos = new ArrayList<>();
		Iterator<Arista<V>> it = aristas.iterator();
		Arista<V> a = null;
		while (it.hasNext()) {
			a = it.next();
			if(a.getNodoDest().equals(n)) {
				vecinos.add(a.getNodoOrig());
			} else {
				if (a.getNodoOrig().equals(n)) {
					vecinos.add(a.getNodoDest());
				}
			}
		}
		return vecinos;
	}
	*/
}
