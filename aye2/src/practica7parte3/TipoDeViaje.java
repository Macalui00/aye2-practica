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

	public void setTipoViaje(String tipoViaje) {
		this.tipoViaje = tipoViaje;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}
	
	public abstract int tiempoDeDemora();
}
