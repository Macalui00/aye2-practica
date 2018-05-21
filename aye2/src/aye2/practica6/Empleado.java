package aye2.practica6;

public class Empleado {
	private int numero;
	private string nombre;
	
	public Empleado() {
		numero = 0;
		nombre = "";
	}
	public Empleado(int n, String nombre){ //Shadowing
		numero = n;
		this.nombre = nombre; 
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public string getNombre(){
		return nombre;
	}
	public void setNombre(string nombre) {
		this.nombre = nombre;
	}
	public void verDatos() {
		System.out.println("empleado nro:" + numero + "nombre:" + nombre);
	}
	
}
