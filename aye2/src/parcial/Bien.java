package parcial;

public abstract class Bien {

	protected Titular titular;
	protected float valorMercado;
	protected float valorFiscal;
	protected int codigo;
	
	private static int proximoCodigo = 0;
	
	/*
	public Bien() {
		Empresa.getInstancia().obtenerproximoCodig();   //es valido pero si yo quiero usar el bien para otra cosa, lo tengo que modificar,
	}*/
	
	public Bien() {
		codigo = proximoCodigo;
		proximoCodigo++;
	}
	
	public Bien(Titular titular) {
		this(); //llama al constructor tambien generio para no repetir codigo
		this.titular = titular;
	}
	
	public void setValorMercado(float valor) throws ValorMercadoInvalidoException{
		if (valor < 0) {
			throw new ValorMercadoInvalidoException();
		}
		valorMercado = valor;
	}

	public void setValorFiscal(float valor) throws ValorFiscalInvalidoException{
		if (valor < 0) {
			throw new ValorFiscalInvalidoException();
		}
		valorMercado = valor;
	}
	
	public float getValorMercado() {
		return valorMercado;
	}
	
	public float getValorFiscal() {
		return valorFiscal;
	}
	
	public void asignarTitular(Titular titular) {
		this.titular = titular;
	}
	
	public boolean equals(Bien bien2) { //le saco el override porque deberia ir object mas que bien, es una sobrecarga mas que una sobreescritura
		return codigo == bien2.getCodigo();
	}

	private int getCodigo() {
		return codigo;
	}

	public Titular getTitular() {
		return titular;
	}
	
}
