package Practica7part2;

public class Rectangulo extends Cuadrilatero{
	private double y;
	
	public Rectangulo(double a, double b) {
		super(a);
		y = b;
	}

	@Override
	public double area() {
		return x*y;
	}
	
	public static void main(String[] args) {
		Rectangulo R = new Rectangulo(4, 5);
		System.out.println("El area del rectangulo es de:" + R.area() + "cm2");
	}
}
