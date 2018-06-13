package Practica8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*Definir una clase GeneradorDeNumeros, que a partir de un valor inicial, un valor final
 *y un incremento (indicados en su constructor), sea capaz de obtener números enteros ordenados 
 *a pedido cada vez que se lo requiera, entre el valor inicial y el final, con el incremento dado. 
 *La clase GeneradorDeNumeros deberá implementar las interfaces Iterator<Integer> y List<Integer>.*/

public class GeneradorDeNumeros {
	List<Integer> enteros;
	
	public GeneradorDeNumeros() {
	}
	
	public GeneradorDeNumeros(int valI, int valF, int inc) {
		this.enteros = new ArrayList<Integer>();
		this.enteros = obtemerListaNumeros();
	}
	
	

	public List<Integer> obtenerListaNumeros(){
		if (valorInicial > valorFinal) {
			int val = valorInicial;
			setValorInicial(valorFinal);
			setValorFinal(val);
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
		Iterator<Integer> itent = new valores.iterator();
		List<Integer> valfinal = new ArrayList<>();
		if(itent.hasNext()) {
			Integer m = itent.next();
			valfinal.add(m);
			Integer n;
			while(itent.hasNext()) {
				n = itent.next();
				if (n > m) {
					
				}
			}
		}
	}
}
