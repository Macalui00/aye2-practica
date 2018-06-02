package Practica7part2;

public abstract class Automovil {
	protected String modelo;
	protected String marca;
	protected String patente;
	protected boolean habilitado;
	protected Permiso permiso;
	protected double velocidad;

	public Automovil() {
	}
	public Automovil(String mod, String mar, String pat, Permiso per, double vel) {
		modelo = mod;
		marca = mar;
		patente = pat;
		permiso = per;
		habilitado = false;
		velocidad = vel;
	}
	
	
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
	public boolean isHabilitado() {
		return habilitado;
	}
	public void setHabilitado(boolean habilitado) {
		this.habilitado = habilitado;
	}
	public Permiso getPermiso() {
		return permiso;
	}
	public void setPermiso(Permiso permiso) {
		this.permiso = permiso;
	}
	public double getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}
	public abstract void verificarPermiso();
	
}
