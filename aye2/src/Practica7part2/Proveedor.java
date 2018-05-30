package Practica7part2;

import java.util.Scanner;

public class Proveedor extends Persona {
	private int codigoVendedor;
	private float saldo;
	private String fax;
	private int telefono;
	private float descuentos;
	private Scanner s;
	
	public Proveedor() {
		super();
		codigoVendedor = 0;
		saldo = 0;
		fax = "";
		telefono = 0;
		descuentos = 0;
	}
	
	public Proveedor(String n, String d, String c, int cv, float s, String f, int t, float des) {
		super(n, d, c);
		codigoVendedor = cv;
		saldo = s;
		fax = f;
		telefono = t;
		descuentos = des;
	}

	@Override
	public void leer() {
		s = new Scanner(System.in);
		System.out.println("Ingrese nombre del proveedor: ");
		nombre = s.nextLine();
		
		System.out.println("Ingrese direccion del provedoor: ");
		direccion = s.nextLine();
		
		System.out.println("Ingrese ciudad del provedoor: ");
		ciudad = s.nextLine();
		
		System.out.println("Ingrese codigo del proveedor: ");
		codigoVendedor = s.nextInt();
		
		System.out.println("Ingrese saldo del proveedor: ");
		saldo = s.nextFloat();
		
		System.out.println("Ingrese fax del proveedor: ");
		fax = s.nextLine();
		
		System.out.println("Ingrese telefono del proveedor: ");
		telefono = s.nextInt();
		
		System.out.println("Ingrese descuentos del proveedor: ");
		descuentos = s.nextFloat();
	}

	@Override
	public void Mostrar() {
		System.out.println("Nombre: " + nombre + ".\nDireccion: " + direccion +
				".\nCiudad: " + ciudad + ".\nCodigo de proveedor: " + codigoVendedor +
				".\nTelefono: " + telefono + ".\nSaldo: " + saldo + ".\nFax: " + fax +
				".\nDescuentos: " + descuentos + ".");
	}
	
	public void PagarFactura() {
		if (saldo != 0) {
			if (descuentos != 0) {
				System.out.print("El saldo total a pagar es de: " + saldo*descuentos);
			} else {
				System.out.println("El saldo total a pagar es de: " + saldo);
			}
		} else {
			System.out.println("No hay saldo a pagar.");
		}
	}
	
}
