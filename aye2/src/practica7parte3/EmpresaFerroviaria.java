package practica7parte3;

import java.util.ArrayList;

public class EmpresaFerroviaria {
	public static void main(String args[]) {
		ArrayList<Viaje> viajes = new ArrayList<>();
		Diesel diesel = new Diesel("Diesel", 500, 6, 4, 200);
		Electrico electrico = new Electrico("Electrico", 700, 7, 7);
		AltaVelocidad altavel = new AltaVelocidad("Alta Velocidad", 700, 7);
		AltaVelocidad altavelExtra = new AltaVelocidad("Minima Velocidad", 700, 7);
		Estacion estorig = new Estacion("Liniers", "Liniers 400");
		Estacion estdest = new Estacion("Caballito", "Avellaneda 300");
		Trayecto tray = new Trayecto(estorig, estdest);
		Viaje viajeD = new Viaje(tray, diesel);
		Viaje viajeE = new Viaje(tray, electrico);
		Viaje viajeA = new Viaje(tray, altavel);
		Viaje viajeExtra = new Viaje(tray, altavelExtra);
		viajes.add(viajeD);
		viajes.add(viajeE);
		viajes.add(viajeA);
		viajes.add(viajeExtra);
		
		Trayecto tr1 = new Trayecto();
		for(Viaje x: viajes) {
			tr1 = x.getTrayecto();
			System.out.println("Estacion de origen: " + tr1.geteOrig().getNombre());
			System.out.println("Estacion de destino: " + tr1.geteDest().getNombre());
			System.out.println("Tipo de viaje: " + x.getTipoDeViaje().tipoViaje);
			System.out.println("Tiempo de demora: " + x.tiempoDeDemora());
			System.out.println("Distancia en kilometros: " + x.getTipoDeViaje().distancia);
		}
		
	}
}
