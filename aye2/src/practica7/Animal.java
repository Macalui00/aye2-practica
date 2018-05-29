package practica7;

public abstract class Animal {
	private String nombre;
	private String habitat;
	private int cantEjemplares;
	private int edad;
	private CaracteristicaEspecie Caracteristicas;
	
	public Animal() {
		nombre = "";
		habitat = "";
		cantEjemplares = 0;
		edad = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public int getCantEjemplares() {
		return cantEjemplares;
	}

	public void setCantEjemplares(int cantEjemplares) {
		this.cantEjemplares = cantEjemplares;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public abstract String getClasificacion();
}
