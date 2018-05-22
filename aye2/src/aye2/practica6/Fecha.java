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
		while (dia > CantDias(mes)){
			if (dia > CantDias(mes, año)) {
				dia = dia - CantDias(mes, año);
				mes = mes + 1;
				if (mes > 12) {
					mes = 1;
					año = año + 1;
				}
			} 
		}
	 }
	 private int CantDias(int m, int a) {
		 if (m=2) {
			 if esBisiesto(a) {
				 return 29;
			 } else {
				 return 28;
			 }
		 }
	 }
	 private boolean esBisiesto(int a) {
		 if ((a/100 != 0) && (a/4 == 0) &&(a/400 == 0)) {
				 return true;
		 } else {
			 return false;
		 }
	 }
}
