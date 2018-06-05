package practica7parte3;

// geretics ejercicio 12

public class Box<T> {
	private T t;
	
	public Box() {
	}
	public Box(T t) {
		this.t= t;
	}
	
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;
	}
	
	// segun las convenciones de los nombres de los parametros de tipo usados comúnmente son los sigs:
	// E: elemento de una coleccion.
	// K: clave.
	// N: numero.
	// T: tipo.
	// V: valor.
	// S, U, V, etc: para segundos, terceros y cuartos tipos.
	
	
	public static void main(String[] args) {
		Box<Integer> integerBox1 = new Box<Integer>();
		Box<Integer> integerBox2 = new Box<>();
		/* para mantener la compatibilidad con vers anteriores de java, los tipos genericos que al usarse NO indican ARGUMENTOS 
		de tipo se denominan RAW. Compilador indicara una advertencia como un uso potencialm. peligroso ya que no podrá 
		validar los tipos (casteo)*/
		
		Box rawBoz = new Box();
	}
}
