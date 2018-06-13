package practicaParcial;

public class Bien {
	private Titular titular;
	private float valorMercado;
	private float valorFiscal;
	
	public Bien() {
	}
	
	public Bien(Titular titular, float valorMercado, float valorFiscal) {
		this.titular = titular;
		this.valorFiscal = valorFiscal;
		this.valorMercado = valorMercado;
	}

	public Titular getTitular() {
		return titular;
	}

	public void setTitular(Titular titular) throws TitularVacioException{
		if(titular == null) {
			throw new TitularVacioException();
		}
		this.titular = titular;
	}

	public float getValorMercado() {
		return valorMercado;
	}

	public void setValorMercado(float valorMercado) {
		this.valorMercado = valorMercado;
	}

	public float getValorFiscal() {
		return valorFiscal;
	}

	public void setValorFiscal(float valorFiscal) {
		this.valorFiscal = valorFiscal;
	}
	
	
	
	
}
