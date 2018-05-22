package aye2.practica6;

public class pruebasPractica6 {

	public static void main(String[] args) {
		Lamparita lamp1 = new Lamparita();
		System.out.println("La Lamparita esta" + lamp1.getEstado().toString());
		
		lamp1.encender();
		
		System.out.println("la lamparita esta" + lamp1.getEstado());
		
		// ejercicio 6: prueba de hora
		Horas h1 = new Horas(1, 110, 110);
		Horas h2 = new Horas(1, 02, 03);
		
		System.out.println("la hora h1 es:" + h1);
		
		System.out.println("La suma de h1 y h2 es:" + Horas.Sumar(h1, h2));
		//System.out.println("La suma de h1 y h2 es(static):" + Hora.sumar(h1, h2));
		// h1.sumar(h2);
		//System.out.println("la suma de h1 y h2 es:" + h1);
		
		//ejercicio 7
		Empleado emp = new Empleado(1, "Pepe");
		emp.verDato();
		
		// ejercicio 8
		Coordenadas Co1 = new Coordenadas(1);
		Coordenadas Co2 = new Coordenadas(2, 5);
		Co1.mostrarCoordenada();
		Co1.Suma();
		System.out.println("¿las cordenadas son iguales?:" + Co1.Igualdad(Co2));
		System.out.println("suma:" + Co1.Suma());
		
		// ejercicio 9 //Dudas
		Vector3D V1 = new Vector3D(1);
		Vector3D V2 = new Vector3D(2, 5, 3);
		Vector3D V3 = Vector3D.Suma(V1, V2);
		V3.Coordenadas();
		System.out.println("vectores iguales:" + V1.Iguales(V2));
		
		//ejercicio 10
		Complejo C1 = new Complejo(2,5);
		Complejo C2 = new Complejo(3,4);
		
		C1.Multipl(C2);
		C1.Mostrar();
		
		C1.Suma(3.1f, 1.2f).Mostrar();
		C1.Suma(2, 3).Mostrar();
		C1.Suma(C1, C2).Mostrar();
		
	}

}
