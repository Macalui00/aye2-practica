package practica7;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemasEscuela {
	private final static int LONGITUD_ARREGLO = 5;
	
	// una vez inicializada una variable, no se puede inicializar = final;
	//si solo la defino sin poner = 5 --> blank final (tiene que ser variable de instancia)(porque estamos hablando de una variable estatica.
	//no me va a definir de forma asegurada esta variable estatica, solo me la va a definir cuando ejecute la variable escuela.


	public static void main(String[] args) {
		//Arreglo de personas
		Persona[] aPersona = new Persona[LONGITUD_ARREGLO]; //arreglo estatico de 5 elementos
		
		aPersona[0] = new Empleado();
		aPersona[1] = new Alumno();
		
		for (int i = 0; i < aPersona.length; i++) {
			System.out.println(i + ":" + aPersona[i]);
		}
		//arreglo dinamico
		ArrayList<Persona> aPersona2 = new ArrayList<>();
		aPersona2.add(new Empleado());
		aPersona2.add(new Empleado());
		aPersona2.add(new Empleado());
		
		for (int i = 0; i < aPersona2.size(); i++) {
			System.out.println(i + ": " + aPersona2.get(i));
		}
		
		//estos dos for van a ser iguales solo que uno tiene indice y el otro no
		
		for(Persona p: aPersona2) {     //for each
			System.out.println(p);
		}
		
		//covarianza del tipo parametrico => NO
		ArrayList<Empleado> emp1 = new ArrayList<>();
		ArrayList<Persona> per1;
		//per1 = emp1;   El tipo no coincide, no son covariantes
		ArrayList<? extends Persona> per2;
		per2 = emp1; //aca si es covariante, se puede decir qeu ArrayList<Empleado> es SUBTIPO de ArrayList<? extends Persona>
		
		Empleado empl = new Empleado();
		empl.leer();
		empl.mostrar();	
	}
	
}
