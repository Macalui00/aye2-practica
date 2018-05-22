package aye2.practica6;
/*13. Implemente la clase Fraccion con las operaciones aritméticas comunes (suma, resta,
multiplicación y división), dos constructores, y el método toString().
*/

public class Fraccion {
	private int a;
	private int b;
	
	public Fraccion(int x, int y) {
		a = x;
		b = y;
	}
	public Fraccion(int z) {
		a = z;
		b = 1;
	}
	public Fraccion Suma(Fraccion F2) {
		int m;
		int n;
		int x;
		int y;
		int w;
		int z;
		if (b == F2.b) {
			x = a + F2.a;
			if (x % b == 0) {
				m = x % b;
				n = b % b;
			} else {
				m = x;
				n = b;
			}
		}else {
			y = b * F2.b;
			w = b * a;
			z = F2.b * F2.a;
			m = w + z;
			n = y;
			if (m % n == 0) {
				m = m % n;
				n = n % n;
			}
		}
		Fraccion F3 = new Fraccion(m, n);
		return F3;
	}
	
	public Fraccion Resta(Fraccion F2) {
		int m;
		int n;
		if (b == F2.b) {
			int x = a - F2.a;
			if (x % b == 0) {
				m = x % b;
				n = b % b;
			} else {
				m = x;
				n = b;
			}
		} else {
			int y = b * F2.b;
			int w = b * a;
			int z = F2.b * F2.a;
			m = w - z;
			n = y;
			if (m % n == 0) {
				m = m % n;
				n = n % n;
			}
		}
		Fraccion F3 = new Fraccion(m, n);
		return F3;
	}
	public Fraccion Multipl(Fraccion F2) {
		int x;
		int y;
		int m;
		int n;
		x = a * F2.a;
		y = b * F2.b;
		if (x % y == 0) {
			m = x % y;
			n = y % y;
		} else {
			m = x;
			n = y;
		}
		Fraccion F3 = new Fraccion(m, n);
		return F3;
	}
	public Fraccion Division(Fraccion F2) {
		int x;
		int y;
		if (F2.a < 0) {
			x = (-1) * F2.b;
			y = (-1) * F2.a;
		} else {
			x = F2.b;
			y = F2.a;
		}
		Fraccion F3 = new Fraccion(x, y);
		Fraccion F4 = new Fraccion(a, b);
		F4.Multipl(F3);
		return F4;
	}
	public void Mostrar() {
		System.out.println(a + "/" + b);
	}
}
