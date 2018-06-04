package practica7parte3;

public class Diesel extends TipoDeViaje {
	private int cantDeEst;
	private int cantMaxDePas;
	
	public Diesel(String tipo, int dist, int cantEst, int cantVag, int cantMaxPas) {
		super(tipo, dist, cantVag);
		cantDeEst = cantEst;
		cantMaxDePas = cantMaxPas;
	}
	public int getCantDeEst() {
		return cantDeEst;
	}
	public void setCantDeEst(int cantDeEst) {
		this.cantDeEst = cantDeEst;
	}
	public int getCantDeVag() {
		return cantDeVag;
	}
	public void setCantDeVag(int cantDeVag) {
		this.cantDeVag = cantDeVag;
	}
	public int getCantMaxDePas() {
		return cantMaxDePas;
	}
	public void setCantMaxDePas(int cantMaxDePas) {
		this.cantMaxDePas = cantMaxDePas;
	}
	@Override
	public int tiempoDeDemora() {
		return ((distancia * cantDeEst)/2) + ((cantDeEst + cantMaxDePas)/10);
	}
	
}
