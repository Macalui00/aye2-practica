package Practica8;

import java.util.Scanner;

public class ProgramaPpal {
	private static Scanner leer = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Indique tipo de constructor: Auto, Camion o Moto: ");
		String lectura = leer.nextLine();
		int lecturaN;
		if(lectura.equals("Auto")) {
			Automovil auto = new Automovil();
			System.out.println("Ingrese fabricante: ");
			lectura = leer.nextLine();
			auto.setFabricante(lectura);
			System.out.println("Ingrese modelo: ");
			lectura = leer.nextLine();
			auto.setModelo(lectura);
			System.out.println("Ingrese año: ");
			lecturaN = leer.nextInt();
			auto.setAñoFabricacion(lecturaN);
			System.out.println("Ingrese kilometraje: ");
			lecturaN = leer.nextInt();
			auto.setKilometraje(lecturaN);
			System.out.println("Ingrese estilo: ");
			lectura = leer.nextLine();
			auto.setEstilo(lectura);
			auto.setLimitePasajeros();
			System.out.println(auto);
		} else {
			if (lectura.equals("Moto")) {
				Motocicleta moto = new Motocicleta();
				System.out.println("Ingrese fabricante: ");
				lectura = leer.nextLine();
				moto.setFabricante(lectura);
				System.out.println("Ingrese modelo: ");
				lectura = leer.nextLine();
				moto.setModelo(lectura);
				System.out.println("Ingrese año: ");
				lecturaN = leer.nextInt();
				moto.setAñoFabricacion(lecturaN);
				System.out.println("Ingrese kilometraje: ");
				lecturaN = leer.nextInt();
				moto.setKilometraje(lecturaN);
				System.out.println("Ingrese uso: ");
				lectura = leer.nextLine();
				moto.setModelo(lectura);
				System.out.println(moto);
			} else {
				if (lectura.equals("Camion")) {
					Camion camion = new Camion();
					System.out.println("Ingrese fabricante: ");
					lectura = leer.nextLine();
					camion.setFabricante(lectura);
					System.out.println("Ingrese modelo: ");
					lectura = leer.nextLine();
					camion.setModelo(lectura);
					System.out.println("Ingrese año: ");
					lecturaN = leer.nextInt();
					camion.setAñoFabricacion(lecturaN);
					System.out.println("Ingrese kilometraje: ");
					lecturaN = leer.nextInt();
					camion.setKilometraje(lecturaN);
					System.out.println("Ingrese cantidad de remolques (1 o más): ");
					lecturaN = leer.nextInt();
					camion.setKilometraje(lecturaN);
					System.out.println("Ingrese cantidad de pasajeros: ");
					lecturaN = leer.nextInt();
					camion.setKilometraje(lecturaN);
					System.out.println(camion);
				}
			}
		}
	}
}
