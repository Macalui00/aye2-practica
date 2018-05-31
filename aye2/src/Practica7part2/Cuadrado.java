package Practica7part2;

public class Cuadrado extends Cuadrilatero{
	
	public Cuadrado(double a) {
		this.x = a;
	}

	@Override
	public double area() {
		return x * x;
	}
	
	public static void main(String[] args) {
		Cuadrado C = new Cuadrado(5);
		System.out.println("El area del cuadrado es de:" + C.area() + "cm2");
	}
	
}
