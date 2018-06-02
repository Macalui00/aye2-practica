package Practica7part2;

public class Camion extends Automovil{
	private boolean matafuegos;
	private boolean ruedaExtra;
	private boolean lucesEnOrden; //luces funcionando correctamente o no
	
	public Camion() {
		super();
	}
	
	public Camion(String mod, String mar, String pat, Permiso per, double vel, boolean mf, boolean re, boolean lo) {
		super(mod, mar, pat, per, vel);
		matafuegos = mf;
		ruedaExtra = re;
		lucesEnOrden = lo;
	}

	public boolean isMatafuegos() {
		return matafuegos;
	}

	public void setMatafuegos(boolean matafuegos) {
		this.matafuegos = matafuegos;
	}

	public boolean isRuedaExtra() {
		return ruedaExtra;
	}

	public void setRuedaExtra(boolean ruedaExtra) {
		this.ruedaExtra = ruedaExtra;
	}

	public boolean isLucesEnOrden() {
		return lucesEnOrden;
	}

	public void setLucesEnOrden(boolean lucesEnOrden) {
		this.lucesEnOrden = lucesEnOrden;
	}

	@Override
	public void verificarPermiso() {
		Concecionaria con = new Concecionaria();
		con = permiso.getConcecionaria();
		if ((con.getAutosAutorizados().contains(patente)) && (habilitado == false)){
			habilitado = true;
		} else {
			habilitado = con.verificarTodoEnOrden(matafuegos, ruedaExtra, lucesEnOrden, patente);
		}
	}
	
	
}
