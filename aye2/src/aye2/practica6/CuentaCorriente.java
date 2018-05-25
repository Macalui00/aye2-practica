package aye2.practica6;

public class CuentaCorriente {
	private float saldo;
	private int OperValidas;
	private int OperFallidas;
	
	public CuentaCorriente(float s) {
		saldo = s;
		OperValidas = 0;
		OperFallidas = 0;
	}
	
	public void Saldo() {
		System.out.println("El saldo actual de la cuenta es de:" + saldo);
	}
	
	public void Deposito(float imp) {
		saldo = saldo + imp;
		OperValidas = OperValidas + 1;
	}
	
	public void Extraccion(float imp) {
		if (saldo <= 0) {
			OperFallidas = OperFallidas + 1;
		} else {
			saldo = saldo - imp;
			OperValidas = OperValidas + 1;
		}
	}
	
	public void CantidadOperaciones() {
		System.out.println("La cantidad de operaciones validas realizadas es de:" + OperValidas);
	}
	
	public void CantidadExtraccionesInvalidas() {
		System.out.println("La cantidad de extracciones invalidas es de:" + OperFallidas);
	}
}
