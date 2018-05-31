package Practica7part2;

public class Fraccion extends Numero{

	public Fraccion(int num1, int num2) {
		this.n1 = num1;
		this.n2 = num2;		
	}
	
	public Fraccion(int num1) {
		this.n1 = num1;
		this.n2 = 1;
	}

	@Override
	public Numero suma(Numero numero2) {
		int m;
		int n;

		if (n2 == numero2.n2) {
			int x = n1 + numero2.n1;
			if (x % n2 == 0) {
				m = x % n2;
				n = n2 % n2;
			} else {
				m = x;
				n = n2;
			}
		}else {
			
			int y = n2 * numero2.n2;
			int w = numero2.n2 * n1;
			int z = n2 * numero2.n1; //dudas
			m = w + z;
			n = y;
			if (m % n == 0) {
				m = m % n;
				n = n % n;
			}
		}
		Fraccion N = new Fraccion(m, n);
		return N;
	}

	@Override
	public Numero producto(Numero numero2) {
		int x;
		int y;
		int m;
		int n;
		x = n1 * numero2.n1;
		y = n2 * numero2.n2;
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

	@Override
	public void mostrar() {
		if (n1 == 0) {
			System.out.println("0");
		} else {
			System.out.println(n1 + "/" + n2);
		}
	}
	
	@Override
	public String toString() {
		if (n1 == 0) {
			return "0";
		} else {
			return n1 + "/" + n2;
		}
	}
	public static void main(String[] args) {
		Fraccion F1 = new Fraccion(0);
		F1.mostrar();
		Fraccion F2 = new Fraccion(3, 2);
		F2.mostrar();
		System.out.println("La suma de las dos fracciones es de: " + F1.suma(F2));
		System.out.println("La multiplicacion entre las dos fracciones es de: " + F1.producto(F2));
	}
}
