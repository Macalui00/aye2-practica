package Practica7part2;

public class Permiso {
	private String fecha;
	private boolean autorizadoConcec;
	private Concecionaria concecionaria;
	
	public Permiso() {
	}
	
	public Permiso(String f, boolean a, Concecionaria c) {
		fecha = f;
		autorizadoConcec = a;
		concecionaria = c;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public boolean isAutorizadoConcec() {
		return autorizadoConcec;
	}

	public void setAutorizadoConcec(boolean autorizadoConcec) {
		this.autorizadoConcec = autorizadoConcec;
	}

	public Concecionaria getConcecionaria() {
		return concecionaria;
	}

	public void setConcecionaria(Concecionaria concecionaria) {
		this.concecionaria = concecionaria;
	}
	
}
