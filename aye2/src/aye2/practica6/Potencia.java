package aye2.practica6;

public class Potencia {
	private float base;
	private int exponente;
	
	public Potencia(float b, int e) {
		if ((e > 0) || (e == 0)) {
			base = b;
			exponente = e;
		} else {
			base = 0f;
			exponente = 1;
		}
	}
	
	public float Evaluar(Potencia P) {
		float b = P.base;
		int e = P.exponente;
		if (e > 1) {
			return b * Evaluar2(e, b);
		} else {
			return b;
		}
	}
	
	private float Evaluar2(int e, float b) {
		if (e > 1) {
			return b * Evaluar2(e - 1, b);
		} else {
			return b;
		}
	}
	
}
