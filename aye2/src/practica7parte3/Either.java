package practica7parte3;

public class Either<A,B> {
	private A a;
	private B b;
	
	public Either() {
	}
	
	public Either(A a, B b) {
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
	
	public boolean isLeft() {
		if (a != null) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isRight() {
		if (b != null) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean iguales(Either<A,B> e) {
		if ((isLeft() && e.isLeft()) || (isRight() && e.isRight())) {
			return true;
		} else {
			return false;
		}
	}
	
}
