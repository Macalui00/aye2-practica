package practica7parte3;

public class Viaje {
	private Trayecto trayecto;
	private	TipoDeViaje tipoDeViaje;
	
	public Viaje(Trayecto tr, TipoDeViaje tdv) {
		trayecto = tr;
		tipoDeViaje = tdv;
	}
	
	
	public Trayecto getTrayecto() {
		return trayecto;
	}

	public void setTrayecto(Trayecto trayecto) {
		this.trayecto = trayecto;
	}

	public TipoDeViaje getTipoDeViaje() {
		return tipoDeViaje;
	}

	public void setTipoDeViaje(TipoDeViaje tipoDeViaje) {
		this.tipoDeViaje = tipoDeViaje;
	}

	public int tiempoDeDemora() {
		if (tipoDeViaje.getTipoViaje() == "Diesel" || tipoDeViaje.getTipoViaje() == "Electrico" || tipoDeViaje.getTipoViaje() == "Alta Velocidad") {
			return tipoDeViaje.tiempoDeDemora();
		} else {
			System.out.println("Tipo de viaje erróneo");
			return 0;
		}
	}
}
