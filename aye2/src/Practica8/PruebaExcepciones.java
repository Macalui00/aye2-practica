package Practica8;
import Practica8.MiAppException;

import java.util.InputMismatchException;
import java.util.Scanner;
//import javax.swing.plaf.basic;

public class PruebaExcepciones {
	private static final int SIZE_ARREGLO = 10;
	private static Integer[] arregloInt;
	private static Scanner tecladoMain;
	
	public static void ingresarDatoArray(int indice) {//metodo q la lanza
		try{
			arregloInt[indice] = 15;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("El indice esta fuera de rango");
			System.out.println(e.getMessage());
			System.out.println(e.getClass());
			for (StackTraceElement elemento : e.getStackTrace()) {
					System.out.println("Archivo: " + elemento.getFileName());//devuelve nombre del archivo
					System.out.println("Linea de error: " + elemento.getLineNumber());
					System.out.println("Clase: " + elemento.getClassName());
		}
	}
}
	public static void ingresarDatoArray2(int indice) throws MiAppException{
		try {
			arregloInt[indice] = 15;
		}catch(ArrayIndexOutOfBoundsException e) {
			throw new Exception("Nueva Ecxeption por indice fuera de rango", e);
		}
	}
	public static int leerIndice() {
		Scanner teclado = new Scanner(System.in);
		int indice = 0;
		boolean ingresoOk = false;
		while(!ingresoOk) {
			
		}
		try {
			System.out.println("Ingrese el indice: ");
			indice = teclado.nextInt();//string d datos q se pasa a entero
			ingresoOk = true;
		}catch (InputMismatchException e) {
			System.out.println("Error en ingreso numerico. Intente nuevamente.");
			teclado.next();
		}
		teclado.close();
		
		return indice;
	}
	public static int leerIndice2() {
		tecladoMain = new Scanner(System.in);
		return tecladoMain .nextInt();
	}
	public static void main(String[] args) {
		Scanner tecladoMain;
	
		tecladoMain = new Scanner(System.in);
		arregloInt = new Integer[SIZE_ARREGLO];	
		//int indice = leerIndice();
			//ingresarDatoArray(indice); //metodo q la invoca
				//arregloInt[indice] = 15;
		try {
			int indice = leerIndice2();
			ingresarDatoArray2(indice);
		} catch (MiAppException e) {
			System.out.println(e);
		}catch (InputMismatchException e) {
		tecladoMain.close();
		System.out.println("Termina OK");
		}
	}
}
