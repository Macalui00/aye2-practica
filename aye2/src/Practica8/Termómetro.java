package Practica8;

public class Termómetro implements Medible {
	private float temperatura;
	
	public Termómetro(float temp) {
		if (!(temp < -273)) {
			this.temperatura = temp;
		} else {
			this.temperatura = -273; // que por default se inicialice en -273 K
		}
	}

	@Override
	public float obtencionMedida() {
		return temperatura;
	}

	@Override
	public void incrementar(float f) {
		this.temperatura = temperatura + f;
	}

	@Override
	public boolean decrementar(float f) {
		if((temperatura - f) < -273) {
			return true;
		} else {
			this.temperatura = temperatura - 1;
			return false;
		}
	}
	
	
}
