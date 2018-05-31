package Practica7part2;

public class Vector extends Numero{
	
	public Vector(int a, int b) {
		this.n1 = a;
		this.n2 = b;
	}
	
	public Vector() {
		this.n1 = 0;
		this.n2 = 0;
	}

	@Override
	public Numero suma(Numero numero2) {
		int a = n1 + numero2.n1;
		int b = n2 + numero2.n2;
		Vector V = new Vector(a, b);
		return V;
	}

	@Override
	public Numero producto(Numero numero2) {
		int a = n1 * numero2.n1;
		int b = n2 * numero2.n2;
		Vector V = new Vector(a, b);
		return V;
	}

	@Override
	public void mostrar() {
		System.out.println("(" + n1 + "," + n2 + ")");	
	}
	
	@Override
	public String toString() {
		return "(" + n1 + "," + n2 + ")";
	}
	
	public static void main(String[] args) {
		Vector V1 = new Vector(3, 5);
		Vector V2 = new Vector(7, -2);
		V1.mostrar();
		V2.mostrar();
		System.out.println("La suma entre vectores es de: " + V1.suma(V2));
		System.out.println("La multiplicacion entre vectores es de: " + V1.producto(V2));
	}
}
