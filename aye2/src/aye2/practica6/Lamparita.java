package aye2.practica6;

public class Lamparita {
	enum EstadoLampara{ENCENDIDA, APAGADA};
	
	private EstadoLampara estado;
	// private boolean estado;
	
	public Lamparita() {
		estado = EstadoLampara.APAGADA;
	}
	public void encender() {
		estado = EstadoLampara.ENCENDIDA;
	}
	public void apagar() {
		estado = EstadoLampara.APAGADA;
	}
	public EstadoLampara getEstado() {
		return estado;
	}

}
