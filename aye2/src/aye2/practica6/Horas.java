package aye2.practica6;

public class Horas {
  private int horas;
  private int minutos;
  private int segundos;
  
  public Hora() {
	  horas = 0;
	  minutos = 0;
	  segundos = 0;
  }
  public Hora(int h, int m, int s) {
	  horas = h;
	  minutos = m;
	  segundos = s;
	  corregirHora();
  }
  private void corregirHora() {
	  if (segundos < 0) {
		  segundos = 0;
	  } else if (segundos > 59) {
		  segundos -=60;  // segundos = segundos % 60
		  minutos += 1;  // segundos += segundos / 1
	  } else if (minutos < 0) {
		  minutos = 0;
	  } else if (minutos > 59){
		  minutos -= 60;
		  horas += 1;
	  }
	  if (horas < 0) {
		  horas = 0;
	  } 
  }
  @Override
  public String toString() {
  	return "Hora" + string.format("%02d", horas) + ":" + minutos + ":" + segundos;
  }
  
  public void clone(Hora h) {
	  segundos = h.segundos;
	  minutos = h.minutos;
	  horas = h.horas;
  }
  public void sumar(Hora h2) {
	  segundos += h2.segundos;
	  minutos += h2.minutos;
	  horas += h2.horas;
	  corregirHora();
  }
  public static Hora sumar(Hora h1, Hora h2) {
	  Hora h3 = new Hora();
	  h3.clone(h1);
	  
	  h3.sumar(h2);
	  retornar h3;
  }
}
