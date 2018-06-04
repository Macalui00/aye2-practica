package practica7parte3;

public class Trayecto {
	private Estacion eOrig;
	private Estacion eDest;
	
	public Trayecto(Estacion eorig, Estacion edest) {
		eOrig = eorig;
		eDest = edest;
	}
	
	public Trayecto() {
	}
	public Estacion geteOrig() {
		return eOrig;
	}

	public void seteOrig(Estacion eOrig) {
		this.eOrig = eOrig;
	}

	public Estacion geteDest() {
		return eDest;
	}

	public void seteDest(Estacion eDest) {
		this.eDest = eDest;
	}

	
}
