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
		
		C1.Multipl(C2).Mostrar();
		C1.Mostrar();
		
		C1.Suma(3.1f, 1.2f).Mostrar();
		C1.Suma(2, 3).Mostrar();
		C1.Suma(C1, C2).Mostrar();
		
		// ejercicio 12
		Fecha F1 = new Fecha(30, 2, 2018);
		F1.Mostrar();
		Fecha F2 = new Fecha(40, 12, 2018);
		Fecha F3 = new Fecha(1, 1, 2018);
		F1.EsMayor(F2);
		F1.EsMayor(F3);
		
		//Ejercicio 13
		Fraccion Fr1= new Fraccion(-2, 5);
		Fraccion Fr2= new Fraccion(1);
		Fr1.Mostrar();
		Fr2.Mostrar();
		//Fr1.Suma(Fr2).Mostrar();
		System.out.println("La suma de la fraccion 1 y 2 es de:" + Fr1.Suma(Fr2));
		//Fr1.Resta(Fr2).Mostrar();
		System.out.println("La resta de la fracion 1 y 2 es de:" + Fr1.Resta(Fr2));
		//Fr1.Multipl(Fr2).Mostrar();
		System.out.println("La multiplicacion entre la fraccion 1 y 2 es de:" + Fr1.Multipl(Fr2));
		//Fr1.Division(Fr2).Mostrar();
		System.out.println("La division entre fraccion 1 y 2 es de:" + Fr1.Division(Fr2));
		
		//ejercicio 14
		Ecuacion Ec = new Ecuacion(2.0f, 0f, -4.0f);
		Ec.Raices(Ec);
		
		//ejercicio 15
		Potencia P = new Potencia(3.0f, 4);
		float r = P.Evaluar(P);
		System.out.println("el resultado es:" + r);
		
		// ejercicio 16) a)
		String d = new String("24");
		Decimal D = new Decimal(d);
		System.out.println(D.aBinario());
		String b = new String("10111");
		Binario B = new Binario(b);
		System.out.println(B.aDecimal());
		
		//ejercicio 17
		
		Monedero M = new Monedero(500.0f);
		M.AgregarDinero(23.0f);
		M.DineroActual();
		M.SacarDinero(23.0f);
		M.DineroActual();
	}

}
