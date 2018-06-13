package practicaParcial;

public class Cuenta extends Bien implements Transferible {

	@Override
	public void transferir(Titular titular) throws SistemaEmpresaException {
		if (this.titular.equals(titular)) {
			throw new TitularInvalidoException("Es el mismo titular.");
		}
		try {
			Empresa.notificarTransferencia(this.titular, titular);
		} catch(TitularVacioException e) {
			System.out.println("El titular insertado esta vacío.");
		} catch(DireccionIncorrectaException e) {
			System.out.println("Email no enviado.");
		}
	}
	
}
