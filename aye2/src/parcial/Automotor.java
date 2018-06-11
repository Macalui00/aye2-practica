package parcial;

public class Automotor extends Bien implements Asegurable, Transferible, Gravable {
	
	private float prima; //Asegurable
	private float alicuota; //Gravable
	@Override
	public void setAlicuota(float alicuota) throws AlicuotaInvalidaException {
		if (alicuota <= 0) {
			throw new AlicuotaInvalidaException();
		}
		this.alicuota = alicuota;
		
	}
	
	@Override
	public float getAlicuota() {
		return alicuota;
	}
	
	@Override
	public float calcularImpuesto() {
		return alicuota * valorFiscal;
	}
	
	@Override
	public void setPrima(float prima) throws PrimaInvalidaException{
		if (prima < 0 || prima > valorMercado) {
			throw new PrimaInvalidaException();
		}
		this.prima = prima;
	}
	@Override
	public float getPrima() {
		return prima;
	}

	@Override
	public void transferir(Titular nuevoTitular) throws TransferenciaInvalidaException{
		if (titular.equals(nuevoTitular)) {
			throw new TransferenciaInvalidaException();
		}
		try {
			Empresa.notificarTransferencia(titular, codigo);
		} catch (EmailNotSendException e) {
			System.out.println("Email no enviado.");
		}
		
		titular = nuevoTitular;
	}
	
	
}
