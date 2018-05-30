package practica7parte3;

public abstract class TipoDeViaje {
	protected String tipoViaje;
	protected int distancia; // en KM
	protected int cantDeVag;
	
	public TipoDeViaje(String tipo, int dist, int cantVag) {
		tipoViaje = tipo;
		distancia = dist;
		cantDeVag = cantVag;
	}

	public String getTipoViaje() {
		return tipoViaje;
	}

	public void setTipoViaje(String tipoViaje) throws TipoViajeException {
		if (tipoViaje == "Diesel" || tipoViaje == "Electrico" || tipoViaje == "Alta Velocidad") {
			throw new TipoViajeException();
		}
		this.tipoViaje = tipoViaje;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(int dist) throws DistanciaException {
		if(dist <= 0) {
			throw new DistanciaException();
		}
		this.distancia = dist;
	}
	
	public abstract int tiempoDeDemora();
}
