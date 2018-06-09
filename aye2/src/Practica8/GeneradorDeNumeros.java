package Practica8;

import java.util.ArrayList;
import java.util.List;

/*Definir una clase GeneradorDeNumeros, que a partir de un valor inicial, un valor final
 *y un incremento (indicados en su constructor), sea capaz de obtener números enteros ordenados 
 *a pedido cada vez que se lo requiera, entre el valor inicial y el final, con el incremento dado. 
 *La clase GeneradorDeNumeros deberá implementar las interfaces Iterator<Integer> y List<Integer>.*/

public class GeneradorDeNumeros {
	private int valorInicial;
	private int valorFinal;
	private int incremento;
	
	public GeneradorDeNumeros() {
	}
	
	public GeneradorDeNumeros(int valI, int valF, int inc) {
		this.valorInicial = valI;
		this.valorFinal = valF;
		this.incremento = inc;
	}
	
	public int getValorInicial() {
		return valorInicial;
	}

	public void setValorInicial(int valorInicial) {
		this.valorInicial = valorInicial;
	}

	public int getValorFinal() {
		return valorFinal;
	}

	public void setValorFinal(int valorFinal) {
		this.valorFinal = valorFinal;
	}

	public int getIncremento() {
		return incremento;
	}

	public void setIncremento(int incremento) {
		this.incremento = incremento;
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
		
	}
}
