package Practica7part2;

import java.util.Scanner;

public class AutoMediano extends Automovil{
	private Scanner f;
	
	public AutoMediano(String mod, String mar, String pat, Permiso per, double vel) {
		super(mod, mar, pat, per, vel);
	}
	
	public AutoMediano() {
		super();
	}
	
	@Override
	public void verificarPermiso() {
		String fechaAct;
		f = new Scanner(System.in);
		System.out.println("Ingrese fecha actual: ");
		fechaAct = f.nextLine();
		if (permiso.getFecha().equals(fechaAct)) { //NO OLVIDAR USAR EQUALS Y NO ==
			habilitado = true;
			System.out.println(habilitado);
		}
	}
	

}
