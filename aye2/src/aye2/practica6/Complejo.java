package aye2.practica6;
/*Implemente la clase Complejo (n�meros complejos). Defina constructores y el
m�todo de multiplicaci�n de complejos. Adem�s programe tres funciones suma(),
una que reciba dos n�meros de tipo int, otra que reciba dos n�meros de tipo float,
y otra que reciba dos n�meros complejos.
*/
public class Complejo {
	private int a;
	private int b;
	
	public Complejo(int x, int y) {
		a = x;
		b = y;
	}
	public  Complejo Multipl(Complejo C2) {
		int n;
		int m;
		m = a;
		n = b;
		a = (m * C2.a) + (m * C2.b);
		b = n * C2.a + n * C2.b;

	}
	public static Complejo Suma(int w, int z) {
		int m;
		int n;
		m <-- a + w;
		n <-- b + z;
		Complejo C3 = new Complejo(m, n);
		return C3;
	}
	public static Complejo Suma(float w, float z) {
		int m;
		int n;
	}
	
}
