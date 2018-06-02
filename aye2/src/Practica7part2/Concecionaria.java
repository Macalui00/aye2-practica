package Practica7part2;

import java.util.ArrayList;

public class Concecionaria {
	private String nombre;
	private ArrayList<String> autosAutorizados;
	
	public Concecionaria() {
	}
	
	public Concecionaria(String n, ArrayList<String> aa) {
		nombre = n;
		autosAutorizados = aa;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<String> getAutosAutorizados() {
		return autosAutorizados;
	}

	public void setAutosAutorizados(ArrayList<String> autosAutorizados) {
		this.autosAutorizados = autosAutorizados;
	}
	
	public boolean verificarTodoEnOrden(boolean matafuegos, boolean ruedaExtra, boolean lucesEnOrden, String patente) {
		if (matafuegos == true && ruedaExtra == true && lucesEnOrden == true) {
			autosAutorizados.add(patente);
			return true;
		} else {
			return false;
		}
	}
}
