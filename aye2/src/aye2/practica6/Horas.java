package aye2.practica6;

public class Horas {
	private int horas;
	private int minutos;
	private int segundos;
  
	public Horas() {
		horas = 0;
		minutos = 0;
		segundos = 0;
	}
	public Horas(int h, int m, int s) {
		horas = h;
		minutos = m;
		segundos = s;
		corregirHora();
	}
	private void corregirHora() {
	  if (segundos < 0) {
		  segundos = 0;
	  } else if (segundos > 59) {
		  segundos = segundos - 60;
		  //segundos -= 60;  // segundos = segundos % 60
		  minutos = minutos + 1;
		  //minutos += 1;  // segundos += segundos / 1
	  } else if (minutos < 0) {
		  minutos = 0;
	  } else if (minutos > 59){
		  minutos = minutos - 60;
		  //minutos -= 60;
		  //horas += 1;
		  horas = horas + 1;
	  }
	  if (horas < 0) {
		  horas = 0;
	  } 
  }
  @Override
  public String toString() {
  	return "Hora" + String.format("%02d", horas) + ":" + minutos + ":" + segundos;
  }
  
  public void clone(Horas h) {
	  segundos = h.segundos;
	  minutos = h.minutos;
	  horas = h.horas;
  }
  public void sumar(Horas h2) {
	  segundos += h2.segundos;
	  minutos += h2.minutos;
	  horas += h2.horas;
	  corregirHora();
  }
  public static Horas Sumar(Horas h1, Horas h2) {
	  Horas h3 = new Horas();
	  h3.clone(h1);
	  
	  h3.sumar(h2);
	  return h3;
  }
}
