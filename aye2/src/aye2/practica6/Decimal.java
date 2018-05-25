package aye2.practica6;

public class Decimal {
	protected String decimal;
	
	public Decimal() {
		decimal = new String("");
	}
	
	public Decimal(String deci) {
		this.decimal = deci;
	}
	
	public Decimal(int n) {
		this.decimal = String.valueOf(n);
	}
	
	public Binario aBinario() {
		int num = Integer.parseInt(decimal);
		int suma = 0;
		int cont = 0;
		
		while (num != 0) {
			int r = num % 2;
			suma = r * (int) Math.pow(10, cont) + suma;
			cont = cont + 1;
			num = num / 2;
		}
		Binario bin = new Binario(String.valueOf(suma));
		return bin;
	}
	
	@Override
	 public String toString() {
	  	return "el numero en decimal es:" + String.format("%d", Integer.parseInt(decimal));
	  }
}
