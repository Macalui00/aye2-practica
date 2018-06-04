package practica7parte3;

public class OperacionUnaria extends ExpresionAritmetica {
	
	public OperacionUnaria() {
		super();
	}
	
	public OperacionUnaria(int a, char op) {
		super(a, op);
	}

	@Override
	public int evaluarResultado() {
		if (operacion == '-') {
			return (-1) * a;
		} else if (operacion == 'i') {
			int num = a + 1;
			return corregirExpresion(num);
		} else if (operacion == 'd') {
			int num = a - 1;
			return corregirExpresion(num);
		} else {
			return 0;
		}
	}

	@Override
	public void mostrar() {
		if (operacion == '-') {
			System.out.println("Operación de negacion: ");
			System.out.println(evaluarResultado());
		} else if (operacion == 'i') {
			System.out.println("Operacion de incremento: ");
			System.out.println(evaluarResultado());
		} else if (operacion == 'd') {
			System.out.println("Operacion de decremento: ");
			System.out.println(evaluarResultado());
		} else {
			System.out.println("Operacion incorrecta.");
		}
		
	}
	
	public static void main(String[] args) {
		OperacionUnaria op1 = new OperacionUnaria(111, '-');
		OperacionUnaria op2 = new OperacionUnaria(1001, 'i');
		OperacionUnaria op3 = new OperacionUnaria(11010, 'd');
		op1.mostrar();
		op2.mostrar();
		op3.mostrar();
	}
	
}
