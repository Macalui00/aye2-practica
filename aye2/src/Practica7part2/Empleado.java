package Practica7part2;

import java.util.Scanner;

public abstract class Empleado extends Persona{
	protected int codigoEmpleado;
	protected int horasExtras;
	protected String companiaSeguro;
	private Scanner s;
	
	public Empleado() {
		super();
		codigoEmpleado = 0;
		horasExtras = 0;
		companiaSeguro = "";
	}
	
	public Empleado(String n, String d, String c, int ce, int h, String cS) {
		super(n, d, c);
		codigoEmpleado = ce;
		horasExtras = h;
		companiaSeguro = cS;
	}
	
	public abstract void EnviarSalario();

	@Override
	public void leer() {
		s = new Scanner(System.in);
		System.out.println("Ingrese nombre del empleado: ");
		nombre = s.nextLine();
		
		System.out.println("Ingrese direccion del empleado: ");
		direccion = s.nextLine();
		
		System.out.println("Ingrese ciudad del empleado: ");
		ciudad = s.nextLine();
		
		System.out.println("Ingrese codigo de empleado: ");
		codigoEmpleado = s.nextInt();
		
		System.out.println("Ingrese cantidad de horas extras del empleado: ");
		horasExtras = s.nextInt();
		
		System.out.println("Ingrese la compañia de seguro del empleado: ");
		companiaSeguro = s.nextLine();
		
	}

	@Override
	public void Mostrar() {
		System.out.println("Nombre: " + nombre + ".\nDireccion: " + direccion +
				".\nCiudad: " + ciudad + ".\nCodigo de empleado: " + codigoEmpleado +
				".\nHoras extras: " + horasExtras + ".\nCompañia de seguros: " + (String)companiaSeguro + ".");
	}
	
	
}
