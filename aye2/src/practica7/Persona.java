package practica7;
import java.util.Date;
import java.util.Optional;

public abstract class Persona {
	protected String nombre;   // las que son objetos, se inicializan en null
	protected int dni;    // inicializa en 0
	protected Date FechaNacimiento;
	protected Persona pareja;
	protected Optional<Persona> pareja2; // Maybe(persona)
	
	public Persona() {
		nombre = ""; // lo mismo que poner nombre = new String("");
		FechaNacimiento = new Date();
		pareja2 = Optional.empty(); //Nothing
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public Date getFechaNacimiento() {
		return FechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		FechaNacimiento = fechaNacimiento;
	}
	public boolean tienePareja() {
		return pareja != null;
	}
	//pero
	public Persona getPareja() {
		return pareja; //peligroso porque puede devolver un null, habria que agregar una excepcion
	}
	// una opcion seria
	public boolean getPareja(Persona p) {
		if (tienePareja()) {
			//p.clone(pareja);  // devuelve una copia
			p = pareja2.get(); //cambia el origen
			return true;
		} else {
			return false;
		}
	}
	/*public Persona clone(Persona p) {
		Persona p2 = new Persona();
		p2.dni ) p.dni;
		p2.nombre = .nombre;
		return p2
	}*/
	
	// el tiene pareja se podria trabajar como:
	public boolean tienePareja() {
		return pareja2.isPresent(); //is Just()
	}
	
	public abstract int getIngresos(); //Solo la firma
}
