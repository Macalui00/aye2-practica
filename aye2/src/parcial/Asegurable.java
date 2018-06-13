package parcial;

public interface Asegurable {
	
	public void setPrima(float prima) throws PrimaInvalidaException;
	
	float getPrima(); //no hace falta el public porque todos los miembros de una interface son publicos SIEMPRE
}
