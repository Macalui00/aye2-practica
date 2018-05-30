package Practica8;

public class MiException extends Exception {
	public MiException() {
	}
	public MiException(String msg, Throwable e) {
		super(msg, e);
	}
	
	public MiException(String msg) {
		super(msg);
	}
}
