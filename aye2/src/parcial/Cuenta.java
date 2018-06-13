package parcial;

public class Cuenta extends Bien implements Transferible {
	
	public Cuenta(Titular titular) {
		//super(titular);
		super();
		asignarTitular(titular);
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
