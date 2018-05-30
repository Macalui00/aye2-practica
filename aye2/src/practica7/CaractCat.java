package practica7;

public class CaractCat {
	protected String CuerpoCubierto; //"de pelo", "de escamas", "caparazon", "piel humeda", "plumas"
	protected String NacenDe; //"vientre materno", "huevos"
	protected String Extremidades; // "patas", "aletas", "alas y patas", "tienen o no"
	protected String Desplazamiento; // caminan, nadan, vuelan, reptan o caminan
	
	public CaractCat() {
		CuerpoCubierto = "";
		NacenDe = "";
		Extremidades = "";
		Desplazamiento= "";
	}
	
	public CaractCat(String CC, String ND, String E, String D) {
		CuerpoCubierto = CC;
		NacenDe = ND;
		Extremidades = E;
		Desplazamiento = D;
	}

	public String getCuerpoCubierto() {
		return CuerpoCubierto;
	}

	public void setCuerpoCubierto(String cuerpoCubierto) {
		CuerpoCubierto = cuerpoCubierto;
	}

	public String getNacenDe() {
		return NacenDe;
	}

	public void setNacenDe(String nacenDe) {
		NacenDe = nacenDe;
	}

	public String getExtremidades() {
		return Extremidades;
	}

	public void setExtremidades(String extremidades) {
		Extremidades = extremidades;
	}

	public String getDesplazamiento() {
		return Desplazamiento;
	}

	public void setDesplazamiento(String desplazamiento) {
		Desplazamiento = desplazamiento;
	}
	
	
	
}
