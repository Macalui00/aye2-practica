package Practica8;

import java.util.Comparator;

public class ComparadorComponente implements Comparator<ComponenteQuimico>{

	@Override
	public int compare(ComponenteQuimico c1, ComponenteQuimico c2) {
		return c1.getComponente().compareTo(c2.getComponente());
	}

}
