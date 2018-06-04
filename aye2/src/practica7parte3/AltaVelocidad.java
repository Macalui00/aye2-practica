package practica7parte3;

public class AltaVelocidad extends TipoDeViaje {
     
	public AltaVelocidad(String tipo, int dist, int cantVag) {
		super(tipo, dist, cantVag);
	}

	@Override
	public int tiempoDeDemora() {
		return distancia / 10;
	}
	
	
}
