package aye2.practica6;

public class Fecha {
	private int dia;
	private int mes;
	private int a�o;
	
	 public Fecha(int d, int m, int a) {
		dia = d;
		mes = m;
		a�o = a;
		revisarFecha();
	}
	 private void revisarFecha() {
		while (dia > CantDias(mes, a�o)){
			if (dia > CantDias(mes, a�o)) {
				dia = dia - CantDias(mes, a�o);
				mes = mes + 1;
				if (mes > 12) {
					mes = 1;
					a�o = a�o + 1;
				}
			} 
		}
	 }
	 
	 private int CantDias(int m, int a) {
		 if (m == 2) {
			 if (EsBisiesto(a)) {
				 return 29;
			 } else {
				 return 28;
			 }
		 } else if ((m == 4) || (m == 6) || (m == 9) || (m == 11)) {
			 return 30;
		 } else {
			 return 31;
		 }
	 }
	 
	 private boolean EsBisiesto(int a) {
		 if ((a/100 != 0) && (a/4 == 0) &&(a/400 == 0)) {
				 return true;
		 } else {
			 return false;
		 }
	 }
	 
	 public void Mostrar() {
		 System.out.println(dia + "/" + mes + "/" + a�o);
	 }
	 
	 public void EsMayor(Fecha F2) {
		 if (a�o > F2.a�o) {
			 System.out.println("true");
		 } else if (a�o < F2.a�o) {
			 System.out.println("false");
		 } else {
			 if (mes > F2.mes) {
				 System.out.println("true");
			 } else if (mes < F2.mes) {
				 System.out.println("false");
			 } else {
				 if (dia > F2.dia) {
					 System.out.println("true");
				 } else {
					 System.out.println("false");
				 }
			 }
		 }
	 }
	 @Override
	  public String toString() {
	  	return "Fecha" + String.format("%02d/%02d/%02d", dia, mes, a�o);
	  }
}
