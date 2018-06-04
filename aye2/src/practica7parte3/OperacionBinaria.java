package practica7parte3;

public class OperacionBinaria extends ExpresionAritmetica{
	private int b;
	
	public OperacionBinaria() {
		super();
	}
	
	public OperacionBinaria(int a, int c, char op) {
		super(a, op);
		this.b = c;
	}
	
	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	@Override
	public int evaluarResultado() {
		
		int ult1 = 0;
		int ult2 = 0;
		int cont = 0;
		
		if (operacion == '+') {
			int suma = 0;
			while (a != 0 || b != 0) {
				if (a != 0) {
					ult1 = a % 10;
				}
				if (b != 0) {
					ult2 = b % 10;
				}
				suma = suma + (ult1 + ult2) * (int) Math.pow(10, cont);
				cont = cont + 1;
				if (a != 0) {
					a = a / 10;
				}
				if (b != 0) {
					b = b / 10;
				}
			}
			int result = corregirExpresion(suma);
			return result;
			
		} else if (operacion == '*') {
			int prod = 0;

			while (a != 0 && b != 0) {
				ult1 = a % 10;
				ult2 = b % 10;
				prod = prod + (ult1 * ult2) * (int) Math.pow(10, cont);
				cont = cont + 1;
				a = a / 10;
				b = b / 10;
			}
			System.out.println(prod);
			return prod;
		} else {
			return 0;
		}
	}

	@Override
	public void mostrar() {
		if (operacion == '+') {
			System.out.println("La operacion entre los numeros binarios es de suma.");
			System.out.println(evaluarResultado());
		} else if (operacion == '*') {
			System.out.println("La operacion entre los numeros binarios es de producto.");
			System.out.println(evaluarResultado());
		} else {
			System.out.println("Operación errónea.");
		}
	}
	
	public static void main(String[] args) {
		OperacionBinaria op1 = new OperacionBinaria(1001, 1110, '+');
		OperacionBinaria op2 = new OperacionBinaria(111000, 1010, '*');
		op1.mostrar();
		op2.mostrar();
	}
}
