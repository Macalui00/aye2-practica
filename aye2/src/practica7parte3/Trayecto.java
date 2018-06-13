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

	public void seteOrig(Estacion eorig) throws EstacionErroneaException {
		if (eorig == null) {
			throw new EstacionErroneaException();
		}
		this.eOrig = eorig;
	}

	public Estacion geteDest() {
		return eDest;
	}

	public void seteDest(Estacion edest)throws EstacionErroneaException {
		if (edest == null) {
			throw new EstacionErroneaException();
		}
		this.eDest = edest;
	}

	
}
