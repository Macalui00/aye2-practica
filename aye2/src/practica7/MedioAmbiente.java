package practica7;

public class MedioAmbiente {
	
	public static void main(String[] args) {
		CaractCat Caract = new CaractCat("escamas","huevos","ninguna", "reptan");
		Categoria reptiles = Categoria();
		
		System.out.println(reptiles.categoria);
		CaractCat CaractRept = new CaractCat();
		CaractRept = reptiles.Caractcat;
		//System.out.println("Caracteristicas de estos: " + 
		//Caract);
	}


}
