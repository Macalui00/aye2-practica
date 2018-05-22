package aye2.practica6;
/*Implemente la clase Complejo (números complejos). Defina constructores y el
método de multiplicación de complejos. Además programe tres funciones suma(),
una que reciba dos números de tipo int, otra que reciba dos números de tipo float,
y otra que reciba dos números complejos.
*/
public class Complejo {
	private int a;
	private int b;
	
	public Complejo(int x, int y) {
		a = x;
		b = y;
	}
	public  void Multipl (Complejo C2) {
		int n;
		int m;
		m = a;
		n = b;
		a = (m * C2.a) + (m * C2.b);
		b = n * C2.a + n * C2.b;

	}
	public Complejo Suma(int w, int z) {
		int m;
		int n;
		m = a + w;
		n = b + z;
		Complejo C3 = new Complejo(m, n);
		return C3;
	}
	
	public Complejo Suma(float w, float z) {
		int m;
		int n;
		m =(int)w;
		n =(int)z;
		Complejo C3 = new Complejo(m + a,n + b);
		return C3;
	}
	public Complejo Suma(Complejo C1, Complejo C2) {
		int m;
		int n;
		m = C1.a + C2.a;
		n = C1.b + C2.b;
		Complejo C3 = new Complejo(m, n);
		return C3;
	}
	public void Mostrar() {
		if (b == 0) {
			System.out.println(a);
		} else if (a == 0) {
			System.out.println(b);
		} else {
			System.out.println(a + "+" + b + "i");
		}
		
	}
}
