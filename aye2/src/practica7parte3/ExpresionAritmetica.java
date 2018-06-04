package practica7parte3;

public abstract class ExpresionAritmetica {
	protected int a;
	protected char operacion;
	
	public ExpresionAritmetica() {
	}
	
	public ExpresionAritmetica(int n, char op) {
		a = n;
		operacion = op;
	}
	
	protected int corregirExpresion(int n) {
		int result = n;
		int cont = 0;
		boolean hay = false;
		while (n != 0) {
			int ult = n % 10;
			if (ult == 2) {
				result = result - 2 * (int) Math.pow(10, cont) + 1 * (int) Math.pow(10, cont + 1);
				System.out.println(result);
			} else if (ult > 2) {
				result = result - (ult - 1) * (int) Math.pow(10, cont) + (ult + 1) * (int) Math.pow(10, cont + 1);
				hay = true; //verificar esta mal
			}
			cont = cont + 1;
			n = n / 10;
		}
		if (hay) {
			return corregirExpresion(result);
		} else {
			System.out.println(result);
			return result;
		}
	}
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public char getOperacion() {
		return operacion;
	}

	public void setOperacion(char operacion) {
		this.operacion = operacion;
	}

	public abstract int evaluarResultado();
	public abstract void mostrar();
	
}
