package Practica7part2;

import java.util.Scanner;

public class Paciente extends Persona {
	private int codigodiagnostico;
	private int telefono;
	private String fechanacimiento;
	private float Factura;
	private Scanner s;
	
	public Paciente() {
		super();
		codigodiagnostico = 0;
		telefono = 0;
		fechanacimiento = "";
		Factura = 0;
	}
	
	public Paciente(String n, String d, String c, int cd, int t, String fn, float fact) {
		super(n, d, c);
		codigodiagnostico = cd;
		telefono = t;
		fechanacimiento = fn;
		Factura = fact;
	}
	
	public void EnviarFactura() {
		System.out.println("Enviar factura de: " + Factura + "a la direccion: " + direccion +
				", " + ciudad);
	}

	@Override
	public void leer() {
		s = new Scanner(System.in);
		System.out.println("Ingrese nombre del paciente: ");
		nombre = s.nextLine();
		
		System.out.println("Ingrese direccion del paciente: ");
		direccion = s.nextLine();
		
		System.out.println("Ingrese ciudad del paciente: ");
		ciudad = s.nextLine();
		
		System.out.println("Ingrese codigo de diagnostico del paciente: ");
		codigodiagnostico = s.nextInt();
		
		System.out.println("Ingrese telefono del paciente: ");
		telefono = s.nextInt();
		
		System.out.println("Ingrese fecha de nacimiento del paciente: ");
		fechanacimiento = s.nextLine();
		
		System.out.println("Ingrese la factura del paciente en pesos: ");
		Factura = s.nextFloat();
	}

	@Override
	public void Mostrar() {
		System.out.println("Nombre: " + nombre + ".\nDireccion: " + direccion +
				".\nCiudad: " + ciudad + ".\nCodigo de diagnostico: " + codigodiagnostico +
				".\nTelefono: " + telefono + ".\nFecha de nacimiento: " + (String)fechanacimiento +
				".\nFactura: " + Factura + ".");
	}
	
}
