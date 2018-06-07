package Practica8;

public class CuentaBancaria implements Medible {
	private float salario;
	
	public CuentaBancaria() {
	}

	@Override
	public float obtencionMedida() {
		return salario;
	}

	@Override
	public void incrementar(float f) {
		this.salario = salario + f;
	}

	@Override
	public boolean decrementar(float f) {
		if (salario == 0) {
			return true;
		} else {
			this.salario = salario - f;
			return false;
		}
	}
	
	

}
