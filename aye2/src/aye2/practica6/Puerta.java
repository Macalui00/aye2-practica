package aye2.practica6;

public class Puerta {
	protected String estado;
	
	public Puerta(String e) {
		estado = e;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void Abrir(){
		estado = "abierta";
	}
	
	public void Cerrar() {
		estado = "Cerrada";
	}
}
