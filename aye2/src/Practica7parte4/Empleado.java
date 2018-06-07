package Practica7parte4;

public class Empleado {
	private String nombre;
	private String apellido;
	private int numeroEmpleado;
	
	public Empleado() {
		
	}
	
	public Empleado(String nombre, String apellido, int numero) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.numeroEmpleado = numero; 
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getNumeroEmpleado() {
		return numeroEmpleado;
	}

	public void setNumeroEmpleado(int numeroEmpleado) {
		this.numeroEmpleado = numeroEmpleado;
	}
	
}
