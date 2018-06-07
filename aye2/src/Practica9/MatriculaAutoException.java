package Practica9;

public class MatriculaAutoException extends Exception {
 //una excepcion que sea checkeada (extends Exception)
	
	//creo este constructor para que pueda usar la excepcion sin necesidad de tener un mensaje
	public MatriculaAutoException() {
	}
	
	//si solo uso esta no me va a permitir una excepcion que no tenga mensaje
	public MatriculaAutoException(String msg) {
		super(msg);
	}
	
}
