package Practica7part2;

import java.util.Scanner;

public class Eventual extends Empleado {
	private float salario;
	private float honorariosPorHora;
	private Scanner s;
	
	public Eventual() {
		super();
		salario = 0;
		honorariosPorHora = 0;
	}
	
	public Eventual(String n, String d, String c, int ce, int h, String cS, float s, float hon) {
		super(n, d, c, ce, h, cS);
		salario = s;
		honorariosPorHora = hon;
	}

	public void PagarSalario() {
		System.out.println("El salario a pagar del empleado: " + nombre + ", codigo del empleado: " + codigoEmpleado
				+ ", es de: " + salario + ", donde los honorarios por hora es de: " + honorariosPorHora);
	}
	
	@Override
	public void EnviarSalario() {
		s = new Scanner(System.in);
		System.out.println("Ingrese salario del empleado: ");
		salario = s.nextFloat();
	}
	
}
