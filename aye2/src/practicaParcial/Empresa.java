package practicaParcial;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private String nombre;
	private List<Bien> bienes;
	private static Empresa instancia = null;
	
	private Empresa() {
		nombre = "Empresa BBD";
		bienes = new ArrayList<>();
	}
	
	public static Empresa getEmpresa() {
		if (instancia == null) {
			instancia = new Empresa();
		}
		return instancia;
	}
	
	public void agregarBien(Bien bien) throws BienInvalidoException{
		if(bien == null) {
			throw new BienInvalidoException("Bien vacío");
		}
		if(pertenece(bien, bienes)) {
			throw new BienInvalidoException("Bien ya existente");
		}
		if (!esBienValido()) {
			throw new BienInvalidoException("Bien de tipo inexistente");
		}
		this.bienes.add(bien);
	}

	private boolean pertenece(Bien bien, List<Bien> bienes2) {
		for(Bien b: bienes2) {
			if(b.equals(bien)) {
				return true;
			}
		}
		return false;
	}
	
	public void eliminarBien(Bien bien) throws BienInvalidoException {
		if(bien == null) {
			throw new BienInvalidoException("Bien vacío");
		}
		if(!bienes.remove(bien)) {
			throw new BienInvalidoException("Bien no existente");
		}
	}
	public void notificarTransferencia(Titular titular1, Titular titular2) throws SistemaEmpresaException {
		if (titular2 == null) {
			throw new TitularVacioException();
		}
		if(titular1.getDireccion() == null || titular2.getDireccion() == null) {
			throw new DireccionIncorrectaException();
		}
		System.out.println("Enviar mail al titular anterior" + titular1.getNombre() + " de cambio alñ nuevo titular " + titular2.getNombre());
	}
}
