package aye2.practica6;

public class Binario {
	protected String binario;
	
	public Binario() {
		binario = new String("");
	}
	
	public Binario (String b) {
		this.binario = b;
	}
	
	public Decimal aDecimal() {
		int suma = 0;
		int cont = 0;
		int bin = Integer.parseInt(binario);
		
		while (bin != 0) {
			int ult = bin % 10;
			suma = suma + ult * (int) Math.pow(2, cont);
			cont = cont + 1;
			bin = bin / 10;
		}
		
		Decimal dec = new Decimal(suma);
		return dec;
	}
	
	@Override
	  public String toString() {
	  	return "el numero en binario es:" + String.format("%d", Integer.parseInt(binario));
	  }
	
}
