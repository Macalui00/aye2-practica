package Practica7part2;

public class Clinica {

	public static void main(String[] args) {
		Paciente pac1 = new Paciente("Mauro", "Rivadavia 1300", "Buenos Aires", 24, 44375623, "07/08/1998", 500.0f);
		pac1.Mostrar();
		pac1.EnviarFactura();
		Planta plant1 = new Planta("miguel", "Repetto", "Capital", 34, 10, "Compan23", 233.0f, 10);
		plant1.EnviarSalario();
		plant1.PagarSalario();
		plant1.Mostrar();
		
		Eventual event1 = new Eventual("","", "", 24, 12, "", 245.0f, 18.0f);
		event1.leer();
		event1.PagarSalario();
		event1.EnviarSalario();
	}

}
