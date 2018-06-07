package Practica8;

public class MedidorDePresion implements Medible {
	private float presion;
	private int cantIncrementos;
	
	public MedidorDePresion() {
	}
	
	public MedidorDePresion(float presion) {
		this.presion = presion;
	}

	@Override
	public float obtencionMedida() {
		return presion;
	}

	@Override
	public void incrementar(float f) {
		this.presion = presion + f;
		this.cantIncrementos = cantIncrementos + 1;
	}

	@Override
	public boolean decrementar(float f) {
		if (cantIncrementos == 0) {
			return true;
		} else {
			this.presion = presion - (f/cantIncrementos);
			cantIncrementos = 0;
			return false;
		}
	}
	
	
}
