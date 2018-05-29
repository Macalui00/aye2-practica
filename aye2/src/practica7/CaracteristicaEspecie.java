package practica7;

import java.util.ArrayList;

public class CaracteristicaEspecie {
	private String TipoAlim; //autotrofos o heterotrofos
	private ArrayList<String> alimTipicos; //conejo, zanahorias, etc.
	private String TipoResp; //tipo de respiracion: anaerobica o aerobica
	private String TipoAmbiente; // Selva, acuatico, bosque
	private String cantcelulas; //unicelulares o pluricelulares
	private boolean enmanada; //animales solitarios o en manada
	
	public CaracteristicaEspecie() {
		TipoAlim = "";
		ArrayList<String> alimTipicos = new ArrayList<>();
		TipoResp = "";
		TipoAmbiente = "";
		cantcelulas = "";
		enmanada = false;
	}
	
	public CaracteristicaEspecie(String TAlim, ArrayList<String> Alim, String TResp, 
			String TAmb, String Cantc, boolean valor) {
		TipoAlim = TAlim;
		alimTipicos = Alim;
		TipoResp = TResp;
		TipoAmbiente = TAmb;
		cantcelulas = Cantc;
		enmanada = valor;
	}
}
