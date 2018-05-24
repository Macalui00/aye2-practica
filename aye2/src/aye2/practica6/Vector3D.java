package aye2.practica6;

/*Implemente la clase Vector3D (ternas de coordenadas de tipo float x, y, z). Defina
constructores y métodos para asignar valores a las coordenadas de los vectores3D,
retornar el valor de cada coordenada, y sumar dos vectores3D, retornando su
resultado. Definir un método booleano de igualdad entre dos vectores3D.
Implementar esta clase a partir de la implementación de la clase Punto
*/

public class Vector3D {
	private float x; // Lo correcto seria Protected
	private float y;
	private float z;
	
	//publi class Punto{
	  /* Protected float x;
	   * protected float y;
	   * Public Punto(x, y){
	   * this.x = x;
	   * this.y = y;
	   * }*/
	
	public Vector3D (float m, float n, float o){
		x = m;
		y = n;
		z = o;
	}
	
	/*public class Vector#D extends Punto{
	 *  private float z;
	 *  super();
	 *  this.x = x;   super(x,y);
	 *  this.y = y    this.z = z;
	 *  this.z = z;
	 *  }*/
	
	public Vector3D (float o) {
		this(o, o, o);
	}
	
	public void Coordenadas() {
		System.out.println("(" + x + "," + y + "," + z + ")");
	}
	public static Vector3D Suma(Vector3D V1, Vector3D V2) {
		Vector3D V3 = new Vector3D(0);
		V3.x = V1.x + V2.x;
		V3.y = V1.y + V2.y;
		V3.z = V1.z + V2.z;
		return V3;
	}
	public boolean Iguales(Vector3D V2) {
		if ((x == V2.x) && (y == V2.y) && (z == V2.z)) {
			return true;
		}else {
			return true;
		}
	}
}
//Dudas