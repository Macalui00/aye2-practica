package Practica7part2;

public abstract class Numero {
	protected int n1;
	protected int n2;
	
/*	public Numero(int num1, int num2) {
		n1 = num1;
		n2 = num2;
	} */
	
	public abstract Numero suma(Numero numero2);
	public abstract Numero producto(Numero numero2);
	public abstract void mostrar();
}
