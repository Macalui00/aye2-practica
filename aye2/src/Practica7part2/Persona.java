package Practica7part2;

public abstract class Persona {
	protected String nombre;
	protected String direccion;
	protected String ciudad;

	
	public Persona() {
		nombre = "";
		direccion = "";
		ciudad = "";
	}
	
	public Persona(String n, String d, String c) {
		nombre = n;
		direccion = d;
		ciudad = c;
	}
	
	public abstract void leer();
	public abstract void Mostrar();
}
