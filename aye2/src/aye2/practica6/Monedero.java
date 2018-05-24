package aye2.practica6;

public class Monedero {
	private double dinero;
	
	public Monedero(double d) {
		dinero = d;
	}
	
	public void AgregarDinero(double d) {
		dinero = dinero + d;
	}
	
	public void SacarDinero(double d) {
		if (dinero - d >= 0) {
			dinero = dinero - d;
		} else {
			System.out.println("Dinero insuficiente");
		}
	}	
	
	public void DineroActual() {
		System.out.println("El dinero actual es de:" + dinero);
	}
}
