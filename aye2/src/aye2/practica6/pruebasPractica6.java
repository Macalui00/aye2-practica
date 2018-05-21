package aye2.practica6;

public class pruebasPractica6 {

	public static void main(String[] args) {
		Lamparita lamp1 = new Lamparita();
		System.out.println("La Lamparita esta" + lamp1.getEstado().toString());
		
		lamp1.encender();
		
		System.out.println("la lamparita esta" + lamp1.getEstado());
		
		// ejercicio 6: prueba de hora
		Hora h1 = new Hora(1, 140, 160);
		
		System.out.println("la hora h1 es:" + h1);
		
		System.out.println("La suma de h1 y h2 es:" + Hora.sumar(h1, h2));
		//System.out.println("La suma de h1 y h2 es(static):" + Hora.sumar(h1, h2));
		// h1.sumar(h2);
		//System.out.println("la suma de h1 y h2 es:" + h1);
		
		//ejercicio 7
		Empleado emp = new Empleado(1, "Pepe");
		emp.verDato();

	}

}
