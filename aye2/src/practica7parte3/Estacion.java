package practica7parte3;

public class Estacion {
	private String nombre;
	private String direccion;
	
	public Estacion(String nom, String dir) {
		nombre = nom;
		direccion = dir;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
}
