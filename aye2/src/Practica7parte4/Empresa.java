package Practica7parte4;

import java.util.ArrayList;
import java.util.Iterator;

public class Empresa {
	private String nombre;
	private ArrayList<Area> areas;
	
	public Empresa(String nombre, ArrayList<Area> areas) {
		this.nombre = nombre;
		this.areas = areas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Area> getAreas() {
		return areas;
	}

	public void setAreas(ArrayList<Area> areas) {
		this.areas = areas;
	}
	
	public Area obtenerAreaEmpleado(Empleado e) {
		Iterator<Area> itarea = areas.iterator();
		Area area = new Area();
		while (itarea.hasNext()) {
			area = itarea.next();
			Iterator<Empleado> itemp = area.getEmpleados().iterator();
			while (itemp.hasNext()){
				if(itemp.next().equals(e)) {
					return area;
				}
			}
		}
		System.out.println("Empleado inexistente.");
		return area;
	}
	
	public void MostrarAreaEmpleado(Empleado e) {
		Iterator<Area> itarea = areas.iterator();
		Area area = new Area();
		boolean existe = false;
		while (itarea.hasNext() && !existe) {
			area = itarea.next();
			Iterator<Empleado> itemp = area.getEmpleados().iterator();
			while (itemp.hasNext() && !existe){
				if(itemp.next().equals(e)) {
					System.out.println("El área del empleado es: " + area.getNombreArea() + ", código de área: "+ area.getNombreArea());
				}
			}
		}
		if (!existe) {
			System.out.println("El empleado no existe en la Empresa");
		}
	}
	
	public boolean existeEmpleado(Empleado e) {
		Iterator<Area> itarea = areas.iterator();
		Area area = new Area();
		boolean existe = false;
		while (itarea.hasNext() && !existe) {
			area = itarea.next();
			Iterator<Empleado> itemp = area.getEmpleados().iterator();
			while (itemp.hasNext() && !existe){
				if(itemp.next().equals(e)) {
					existe = true;
				}
			}
		}
		return existe;
	}
	
	public void registrarNuevoEmpleado(Empleado e, int codigoA) {
		if (!existeEmpleado(e) && existeArea(codigoA)) {
			Iterator<Area> ita = areas.iterator();
			Area area = new Area();
			boolean encontrado = false;
			while(ita.hasNext() && !encontrado) {
				area = ita.next();
				if (area.getCodigoArea() == codigoA) {
					area.getEmpleados().add(e);
					encontrado = true;
				}
			}
		} else {
			if (existeEmpleado(e)) {
				System.out.println("Empleado existente, no se puede agregar nuevamente.");
			} else {
				System.out.println("No existe el area solicitada.");
			}
		}
	}
	
	public void registrarNuevoEmpleado(Empleado e, String nombreA) {
		if (!existeEmpleado(e) && existeArea(nombreA)) {
			Iterator<Area> ita = areas.iterator();
			Area area = new Area();
			boolean encontrado = false;
			while(ita.hasNext() && !encontrado) {
				area = ita.next();
				if (area.getNombreArea() == nombreA) {
					area.getEmpleados().add(e);
					encontrado = true;
				}
			}
		} else {
			if (existeEmpleado(e)) {
				System.out.println("Empleado existente, no se puede agregar nuevamente.");
			} else {
				System.out.println("No existe el area solicitada.");
			}
		}
	}
	
	public boolean existeArea(int codigoA) {
		Iterator<Area> ita = areas.iterator();
		Area area = new Area();
		boolean encontrado = false;
		while(ita.hasNext() && !encontrado) {
			area = ita.next();
			if (area.getCodigoArea() == codigoA) {
				encontrado = true;
			}
		}
		return encontrado;
	}
	
	public boolean existeArea(String nombreA) {
		Iterator<Area> ita = areas.iterator();
		Area area = new Area();
		boolean encontrado = false;
		while(ita.hasNext() && !encontrado) {
			area = ita.next();
			if (area.getNombreArea() == nombreA) {
				encontrado = true;
			}
		}
		return encontrado;
	}
	
	public boolean borrarEmpleado(Empleado empl, String nombreArea) {
		Iterator<Area> ita = areas.iterator();
		Area area = new Area();
		Empleado e = new Empleado();
		boolean encontrado = false;
		if (existeArea(nombreArea)) {
			while(ita.hasNext() && !encontrado) {
				area = ita.next();
				Iterator<Empleado> ite = area.getEmpleados().iterator();
				while(ite.hasNext() && !encontrado) {
					e = ite.next();
					if (e.getNumeroEmpleado() == empl.getNumeroEmpleado()) {
						encontrado = true;
						area.getEmpleados().remove(e);
					}
				}
			}
		} else {
			System.out.println("Area inexistente");
		}
		
		return encontrado;
	}
	
	public void transferirEmpleado(Empleado empl, String nombreArea) {
		boolean exitoso = borrarEmpleado(empl, nombreArea);
		if (exitoso) {
			registrarNuevoEmpleado(empl, nombreArea);
		} else {
			System.out.println("Empleado no existente en el area: " + nombreArea);
		}
	}
	
}
