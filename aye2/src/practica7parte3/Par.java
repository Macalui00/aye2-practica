package practica7parte3;

//import javax.rmi.CORBA.Util;

public class Par<A, B> {
	private A a;
	private B b;
	
	public Par(A a, B b) {
		this.a = a;
		this.b = b;
	}
	
	public A getA() {
		return a;
	}
	
	public void setA(A a) {
		this.a = a;
	}
	
	public B getB() {
		return b;
	}
	
	public void setB(B b) {
		this.b = b;
	}
	
	/*Además de las clases, los métodos también pueden tener su propia definición de tipos
	 * genéricos*/
	
	public static <A, B> boolean compare(Par<A, B> p1, Par<A, B> p2) {
		return p1.getA().equals(p2.getA()) && p1.getB().equals(p2.getB());
	}
	
	public static void main(String[] args) {
		Par<Integer, Integer> p1 = new Par<>(2, 4);
		Par<Integer, Integer> p2 = new Par<>(3, 4);
		Par<Integer, Integer> p3 = new Par<>(2, 4);
		System.out.println(Par.compare(p1, p2));
		System.out.println(Par.compare(p1, p3));
		
		/* boolean same = Util.compare(p1, p2);
		System.out.println(same); */
	}
}
