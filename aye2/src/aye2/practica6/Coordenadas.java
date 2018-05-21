package aye2.practica6;
/*  Implemente la clase Punto (pares de coordenadas de tipo float x, y). Defina
constructores y métodos para asignar valores a las coordenadas de los puntos,
retornar el valor de cada coordenada, y sumar dos puntos, retornando su resultado.
Definir un método booleano de igualdad entre dos puntos.
*/
public class Coordenadas {
	private float x;
	private float y;
	
	public Coordenadas(float w, float z) {
		x = w;
		y = z;
	}
	public Coordenadas(float z) {
		this(z, z);
	}
	public void mostrarCoordenada() {
		System.out.println("(" + x + "," + y + ")");
	}
	public float Suma() {
		float m;
		m = x + y;
		return m;
	}
	public boolean Igualdad(Coordenadas C2) {
		if ((x == C2.x) && (y == C2.y)) {
			return true;
		}else {
			return false;
		}
	}
	
}
