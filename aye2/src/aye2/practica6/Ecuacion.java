package aye2.practica6;

public class Ecuacion {
	private float T1;
	private float T2;
	private float T3;
	
	public Ecuacion(float m, float n, float o) {
		T1 = m;
		T2 = n;
		T3 = o;
	}
	public void Raices(Ecuacion E) {
		float R1;			
		float R2;
		
		float r = (T2 * T2) - (4 * T1 * T3);
		R1 = (float) ((-1)*T2 + Math.sqrt(r));
		R1 = R1 / (2 * T1);
		
		R2 = (float)((-1 * T2 - Math.sqrt(r)));
		R2 = R2 / (2 * T1);
		
		System.out.println("raiz 1:" + R1 + "raiz 2:" + R2);
		
	}
}
