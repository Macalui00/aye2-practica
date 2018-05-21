package aye2.practica6;

/*Implemente la clase Vector3D (ternas de coordenadas de tipo float x, y, z). Defina
constructores y métodos para asignar valores a las coordenadas de los vectores3D,
retornar el valor de cada coordenada, y sumar dos vectores3D, retornando su
resultado. Definir un método booleano de igualdad entre dos vectores3D.
Implementar esta clase a partir de la implementación de la clase Punto
*/

public class Vector3D {
	private float x;
	private float y;
	private float z;
	
	public Vector3D(float m, float n, float o){
		x = m;
		y = n;
		z = o;
	}
	public Vector3D(float m) {
		this(m, m, m);
	}
	
	public void Coordenadas() {
		System.out.println("(" + x + "," + y + ")");
	}
	public static Vector3D Suma(Vector3D V1, Vector3D V2) {
		Vector3D V3 = new Vector3D(0);
		V3.x = V1.x + V2.x;
		V3.y = V1.y + V2.y;
		V3.z = V1.z + V2.z;
		return V3;
	}
	public boolean Iguales(Vector3D V1, Vector3D V2) {
		if ((V1.x == V2.x) && (V1.y == V2.y) && (V1.z == V2.z)) {
			return true;
		}else {
			return true;
		}
	}
}
//Dudas