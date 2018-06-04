package practica7parte3;

public class Electrico extends TipoDeViaje{
	private int cantDeEst;
	
	public Electrico(String tipo, int dist, int cantVag, int cantEst) {
		super(tipo, dist, cantVag);
		cantDeEst = cantEst;
	}

	public int getCantDeEst() {
		return cantDeEst;
	}

	public void setCantDeEst(int cantDeEst) {
		this.cantDeEst = cantDeEst;
	}

	@Override
	public int tiempoDeDemora() {
		return (distancia * cantDeEst) / 2;
	}
	
	
	
}
