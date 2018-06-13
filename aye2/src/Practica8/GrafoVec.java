package Practica8;

import java.util.ArrayList;
import java.util.Iterator;

public class GrafoVec<V> implements Grafo<V> {
	private ArrayList<Nodo<V>> nodos;
	private ArrayList<Arista<V>> aristas;
	
	public GrafoVec(){
	}
	
	public GrafoVec(V n) {
		if (!pertenece(n)){
			Nodo<V> nodo = new Nodo<>(n);
			nodo.setNodosAdy(obtenerVecinos(nodo));
			this.nodos.add(nodo);
		}
	}
	
	public GrafoVec(Nodo<V> norig, Nodo<V> ndest) {
		if(!pertenece(norig.getV())) {
			norig.setNodosAdy(obtenerVecinos(norig));
			this.nodos.add(norig);
		}
		if(!pertenece(ndest.getV())) {
			norig.setNodosAdy(obtenerVecinos(ndest));
			this.nodos.add(ndest);
		}
		Arista<V> a = new Arista<>(norig, ndest);
		if (!aristas.contains(a)) {
			this.aristas.add(a);
		}
	}
	
	@Override
	public void addNodo(V n) {
		if (!pertenece(n)){
			Nodo<V> nodo = new Nodo<>(n);
			nodo.setNodosAdy(obtenerVecinos(nodo));
			this.nodos.add(nodo);
		}
	}
	
	public boolean pertenece(V n) {
		for(Nodo<V> v: nodos) {
			if (v.getV() == n) {
				return true;
			}
		}
		return false;
	}
	
	public boolean pertenece(Nodo<V> n) {
		for(Nodo<V> v: nodos) {
			if (v.getId() == n.getId()) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public void addArista(V vorig, V vdest) {
		
		Nodo<V> vOrig = new Nodo<V>(vorig);
		vOrig.setNodosAdy(obtenerVecinos(vOrig));	
		
		if (!pertenece(vorig)) {;
			this.nodos.add(vOrig);
		}
		
		Nodo<V> vDest = new Nodo<V>(vdest);
		vDest.setNodosAdy(obtenerVecinos(vDest));
		
		if(!pertenece(vdest)) {
			this.nodos.add(vDest);
		}
		
		Arista<V> a = new Arista<V>(vOrig, vDest);
		if (!aristas.contains(a)) {
			this.aristas.add(a);
		}
	}

	

	@Override
	public ArrayList<Nodo<V>> obtenerVecinos(Nodo<V> vertice) {
		ArrayList<Nodo<V>> vecinos = new ArrayList<>();
		Iterator<Arista<V>> it = aristas.iterator();
		Arista<V> a = null;
		while (it.hasNext()) {
			a = it.next();
			if(a.getNodoDest().equals(vertice)) {
				vecinos.add(a.getNodoOrig());
			} else {
				if (a.getNodoOrig().equals(vertice)) {
					vecinos.add(a.getNodoDest());
				}
			}
		}
		return vecinos;
	}
	
	
}
