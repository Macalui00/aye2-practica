package Practica9;

public class Ejercicio5 {
/* RETORNA
 Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Unreachable code

	at Practica9.Ejercicio5.unMetodo(Ejercicio5.java:10)
	at Practica9.Ejercicio5.main(Ejercicio5.java:16)
 */
	
	
	
		public int unMetodo(){
			try {
					System.out.println("Va a retornar 1");
					return 1;
			 } finally {
					System.out.println("Va a retornar 2");
					return 2;
			}
		}
		public static void main(String[] args) {
			Ejercicio5 res = new Ejercicio5();
			System.out.println(res.unMetodo());
		}
}
