package Practica7part2;

import java.util.Scanner;

public class Planta extends Empleado{
	protected float salario;
	private int aniosAntiguedad;
	private Scanner s;
	
	public Planta() {
		super();
		salario = 0;
		aniosAntiguedad = 0;
	}
	
	public Planta(String n, String d, String c, int ce, int h, String cS, float s, int a) {
		super(n, d, c, ce, h, cS);
		salario = s;
		aniosAntiguedad = a;
	}
	
	public void PagarSalario() {
		System.out.println("Pagar salario al empleado: " + nombre + " codigo de empleado: " + codigoEmpleado
				+ " de un total de: " + salario + "acorde a sus años de antiguedad: " + aniosAntiguedad);
	}
	
	@Override
	public void EnviarSalario() {
		s = new Scanner(System.in);
		System.out.println("Ingrese salario del empleado: ");
		salario = s.nextFloat();
	}
	
	
}
