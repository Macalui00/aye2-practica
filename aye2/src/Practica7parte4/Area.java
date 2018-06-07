package Practica7parte4;

import java.util.ArrayList;

public class Area {
	private int codigoArea;
	private String nombreArea;
	private ArrayList<Empleado> empleados;
	
	public Area() {
	}
	
	public Area(int codigo, String nombre, ArrayList<Empleado> empleados) {
		this.codigoArea = codigo;
		this.nombreArea = nombre;
		this.empleados = empleados;
	}

	public int getCodigoArea() {
		return codigoArea;
	}

	public void setCodigoArea(int codigoArea) {
		this.codigoArea = codigoArea;
	}

	public String getNombreArea() {
		return nombreArea;
	}

	public void setNombreArea(String nombreArea) {
		this.nombreArea = nombreArea;
	}

	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}
	
	
}
