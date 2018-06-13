package Practica8;

import java.util.ArrayList;
import java.util.List;

/*9. Definir una clase EnumeradorString, que tome un String desde su 
 * constructor y que implemente las interfaces Iterator<Character> y 
 * List<Character> (asumir que cada elemento de un String corresponde 
 * a un Character).*/

public class EnumeradorString implements Estadistica<Character> {
	private List<Character> listaCaracter;
	
	public EnumeradorString() {
		this.listaCaracter = new ArrayList<Character>();
	}
	
	public EnumeradorString(String caracteres) {
		this.listaCaracter = obtenerLista(caracteres);
	}

	public List<Character> getListaCaracter() {
		return listaCaracter;
	}

	public void setListaCaracter(List<Character> listaCaracter) {
		this.listaCaracter = listaCaracter;
	}

	private List<Character> obtenerLista(String caracteres) {
		List<Character> lc = new ArrayList<>();
		for(int i = 0; i < caracteres.length(); i++) {
			lc.add(caracteres.charAt(i));
		}
		return lc;
	}

	@Override
	public Character minimo() throws Exception{
		Character c = null;
		if(listaCaracter.isEmpty()) {
			throw new MiException("Lista Vacia");
		}
		c = listaCaracter.get(0);
		for(Character ch: listaCaracter) {
			if(ch < c) {
				c = ch;
			}
		}
		return c;
	}

	@Override
	public Character maximo() throws Exception{
		Character c = null;
		if(listaCaracter.isEmpty()) {
			throw new MiException("Lista Vacia");
		}
		c = listaCaracter.get(0);
		for(Character ch: listaCaracter) {
			if(ch > c) {
				c = ch;
			}
		}
		return c;
	}

	@Override
	public int cantidadElementos() {
		return listaCaracter.size();
	}
	public boolean noHayNumeros() {
		boolean no_Hay = false;
		for(Character c: listaCaracter) {
			if(!esNumero(c)) {
				no_Hay = true;
			}
		}
		return no_Hay;
	}
	public boolean esNumero(Character c) {
		switch (c) {
			case '0':
        	case '1':
        	case '2':
        	case '3':
        	case '4':
        	case '5':
        	case '6':
        	case '7':
        	case '8':
        	case '9':
        	return true;
		default:
        	return false;
        }
	}
	
	@Override
	public int suma() throws Exception {
		if (listaCaracter.isEmpty()) {
			throw new MiException("ListaVacia");
		}
		if(noHayNumeros()) {
			throw new MiException("Hay elementos que no son numeros");
		}
		int suma = 0;
		for(Character c: listaCaracter) {
			suma = suma + getNumero(c);
		}
		return suma;
	}
	
	public int getNumero(Character c) {
		switch (c) {
			case '0':
				return 0;
        	case '1':
        		return 1;
        	case '2':
        		return 2;
        	case '3':
        		return 3;
        	case '4':
        		return 4;
        	case '5':
        		return 5;
        	case '6':
        		return 6;
        	case '7':
        		return 7;
        	case '8':
        		return 8;
        	case '9':
        		return 9;
		default:
        	return 0;
        }
	}

	@Override
	public float promedio() throws Exception {
		int suma = suma();
		int cantidad = listaCaracter.size();
		if(listaCaracter.isEmpty()) {
			throw new MiException("No hay elementos en la lista");
		}
		return (float) suma/cantidad;
	}
}
