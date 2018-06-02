package Practica7part2;

import java.util.ArrayList;

public class Prueba {

	public static void main(String[] args) {
		ArrayList<String> autos = new ArrayList<>();
		Concecionaria concec = new Concecionaria("maras", autos);
		Permiso per = new Permiso("02/03/2018", false, concec);
		AutoMediano med = new AutoMediano("X5W", "Citroen", "sgd5t6", per, 300.0);
		
		System.out.println("El Auto Mediano: " + med.getPatente() + "Tiene permiso: " + med.isHabilitado());
		med.verificarPermiso();
		System.out.println("¿Tiene permiso? " + med.isHabilitado());
		
		if (concec.getAutosAutorizados().isEmpty()) {
			System.out.println("No hay camiones registrados.");
		} else {
			System.out.println("Hay camiones registrados.");
		}
		
		Camion cam = new Camion("JWL", "Wolvagen", "MX79OO", per, 400.0, true, true, true);
		System.out.println("El camion: " + cam.getPatente() + "Tiene permiso: " + cam.isHabilitado());
		cam.verificarPermiso();
		System.out.println("¿Tiene permiso? " + cam.isHabilitado());
		
		if (concec.getAutosAutorizados().isEmpty()) {
			System.out.println("No hay camiones registrados.");
		} else {
			System.out.println("Hay camiones registrados.");
			if (concec.getAutosAutorizados().contains(cam.getPatente())) {
				System.out.println("La patente: " + cam.getPatente() + " esta registrada en la concecionaria.");
			}
		}
		
	}

}
