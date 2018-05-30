package Practica8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*Definir una clase GeneradorDeNumeros, que a partir de un valor inicial, un valor final
 *y un incremento (indicados en su constructor), sea capaz de obtener números enteros ordenados 
 *a pedido cada vez que se lo requiera, entre el valor inicial y el final, con el incremento dado. 
 *La clase GeneradorDeNumeros deberá implementar las interfaces Iterator<Integer> y List<Integer>.*/

public class GeneradorDeNumeros implements Estadistica<Integer> {
	private List<Integer> listaNumeros;
	
	public GeneradorDeNumeros() {
		this.listaNumeros = new ArrayList<Integer>();
	}
	
	public GeneradorDeNumeros(int valI, int valF, int inc) {
		this.listaNumeros = new ArrayList<Integer>();
		this.listaNumeros = obtenerListaNumeros(valI, valF, inc);
	}

	public List<Integer> obtenerListaNumeros(int valorInicial, int valorFinal, int incremento){
		if (valorInicial > valorFinal) {
			return obtenerListaNumeros(valorFinal, valorInicial, incremento);
		}
		List<Integer> valores = new ArrayList<>();
		Integer vi = (Integer) valorInicial;
		Integer vf = (Integer) valorFinal;
		Integer incrementar = (Integer) incremento;
		while(vi <= vf) {
			valores.add(vi);
			vi = vi + incrementar;
		}
		return ordenarLista(valores);
	}
	
	private List<Integer> ordenarLista(List<Integer> valores){
		List<Integer> resultado = new ArrayList<>();
		Integer menor;
		while(!valores.isEmpty()) {
			menor = buscarMenor(valores);
			if(menor != null) {
				valores.remove(menor);
				resultado.add(menor);
			}
		}
		return resultado;
	}

	private Integer buscarMenor(List<Integer> valores) {
		Iterator<Integer> it = valores.iterator();
		Integer menor = null;
		Integer numero;
		if (it.hasNext()) {
			menor = it.next();
			while(it.hasNext()) {
				numero = it.next();
				if (numero < menor) {
					menor = numero;
				}
			}
		}
		return menor;
	}
	public void mostrarGenerador() {
		for(Integer i: listaNumeros) {
			System.out.println((int) i);
		}
	}
	
	public static void main(String[] args) {
		GeneradorDeNumeros g = new GeneradorDeNumeros(2, 9, 3);
		g.mostrarGenerador();
		System.out.println("OK");
	}

	@Override
	public Integer minimo() {
		Integer minimo = null;
		if(!listaNumeros.isEmpty()) {
			minimo = listaNumeros.get(0);
		}
		for(Integer i: listaNumeros) {
			if (i < minimo) {
				minimo = i;
			}
		}
		return minimo;
	}

	@Override
	public Integer maximo() {
		Integer maximo = null;
		if (!listaNumeros.isEmpty()) {
			maximo = listaNumeros.get(0);
		}
		for(Integer i: listaNumeros) {
			if (i > maximo) {
				maximo = i;
			}
		}
		return maximo;
	}

	@Override
	public int cantidadElementos() {
		return listaNumeros.size();
	}

	@Override
	public int suma() {
		int suma = 0;
		for(Integer i: listaNumeros) {
			suma = suma + (int) i;
		}
		return suma;
	}

	@Override
	public float promedio() {
		int suma = suma();
		int cantidad = listaNumeros.size();
		float div = 0;
		try {
			if (cantidad != 0) {
				div =(float) suma/cantidad;
			}
		}catch (ArithmeticException e) {
			System.out.println("No posee elementos la lista");
			System.out.println(e);
		}
		return div;
	}
}
