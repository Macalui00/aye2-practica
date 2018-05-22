package aye2.practica6;

public class Fecha {
	private int dia;
	private int mes;
	private int año;
	
	 public Fecha(int d, int m, int a) {
		dia = d;
		mes = m;
		año = a;
		revisarFecha();
	}
	 private void revisarFecha() {
		 if (mes = 2) {
			 if (esBisiesto(año)) && () {
				 
			 }
		 }
	 }
	 public boolean esBisiesto(int a) {
		 if (a / 100 != 0) && (a / 4 = 0) && (a/400) = 0) {
			 return true;
		 } else {
			 return false;
		 }
	 }
}
