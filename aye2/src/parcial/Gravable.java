package parcial;

public interface Gravable {

	void setAlicuota(float alicuota) throws AlicuotaInvalidaException;
	
	float getAlicuota();
	
	float calcularImpuesto();
}
