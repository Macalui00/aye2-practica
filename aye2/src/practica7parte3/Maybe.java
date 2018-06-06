package practica7parte3;

public class Maybe<A> {
	private A a;
	
	public Maybe(A a) {
		this.a = a;
	}
	
	public Maybe() {
	}
	
	public boolean isNothing() {
		if (a == null) {
			return true;
		} else {
			return false;
		}
	}

	public A getA() {  // funcion valor
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}
	
	public boolean igual(Maybe<A> m) {
		if (a.equals(m.a)) {
			return true;
		} else {
			return false;
		}
	}
	
}
