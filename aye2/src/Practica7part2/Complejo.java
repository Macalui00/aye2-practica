package Practica7part2;

public class Complejo extends Numero{
	
	public Complejo(int num1, int num2) {
		this.n1 = num1;
		this.n2 = num2;
	}
	
	public Complejo() {
		this.n1 = 0;
		this.n2 = 0;
	}
	
	@Override
	public Numero suma(Numero numero2) {
		int real = n1 + numero2.n1;
		int imaginario = n2 + numero2.n2;
		
		Complejo C = new Complejo(real, imaginario);
		return C;
	}
	
	@Override
	public Numero producto(Numero numero2) {
		int real = n1 * numero2.n1 + n2 * numero2.n2;
		int imaginario = n1 * numero2.n2 + n2 * numero2.n1;
		
		Complejo C = new Complejo(real, imaginario);
		return C;
	}
	
	@Override
	public void mostrar() {
		if(n1 == 0 && n2 == 0) {
			System.out.println(0);
		} else if (n1 == 0) {
			System.out.println(n2 + "i");
		} else if (n2 == 0) {
			System.out.println(n1);
		} else {
		System.out.println(n1 + "+" + n2 + "i");
		}
	}
	@Override
	public String toString() {
		if (n1 == 0 && n2 == 0) {
			return "0";
		} else if (n1 == 0){
			return n2 + "i";
		} else if (n2 == 0) {
			return String.format("%d", n1);
		} else {
			return n1 + "+" + n2 + "i";
		}
	}
	
	public static void main(String[] args) {
		Complejo C1 = new Complejo(-4, 5);
		Complejo C2 = new Complejo(3, 0);
		C1.mostrar();
		C2.mostrar();
		System.out.println("La suma entre: ");
		C1.mostrar();
		C2.mostrar();
		System.out.println("es de: " + C1.suma(C2));
		System.out.println("El producto entre los dos complejos es de: " + C1.producto(C2));
	}
}
