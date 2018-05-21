package aye2.practica6;

public class pruebasPractica6 {

	public static void main(String[] args) {
		Lamparita lamp1 = new Lamparita();
		System.out.println("La Lamparita esta" + lamp1.getEstado().toString());
		
		lamp1.encender();
		
		System.out.println("la lamparita esta" + lamp1.getEstado());

	}

}
