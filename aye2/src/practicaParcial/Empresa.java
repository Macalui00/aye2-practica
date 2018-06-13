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
}
