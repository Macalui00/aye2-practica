package aye2.practica6;

public class Microondas {
	protected Puerta puerta;
	protected Comida comida;
	protected int timer;
	protected String estado;
	protected int intensidad;
	
	public Microondas() {
		Puerta puerta = new Puerta("abierta");
		Comida comida = new Comida();
		timer = 0;
		estado = "";
		intensidad = 0;
	}
	
	public Microondas(Comida C) {
		Puerta puerta = new Puerta("Cerrada");
		comida = C;
		estado = "encoccion";
	}
	
	public void IniciarCoccion(int i, int t) {
		if (esPuertaCerrada(puerta) && !(comida.nombre.isEmpty())) {
			intensidad = i;
			timer = t;
		}
	}
	
	public String getEstado() {
		if (esPuertaCerrada(puerta)) {
			System.out.println("La puerta se encuentra cerrada" );
			
		} else {
			
		}
	}
	
	public void DetenerCoccion() {
		if (esPuertaCerrada(puerta) && (getEstado() == "standby")) {
			puerta.Abrir();
			comida = new Comida();
			timer = 0;
			intensidad = 0;
		} else if (esPuertaCerrada(puerta)) {
			if (timer - )
		}
	}
	
}
