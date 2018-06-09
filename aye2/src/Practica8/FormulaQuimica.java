package Practica8;

import java.util.ArrayList;

/*Una fórmula química se representa utilizando un array ordenado de componentes químicos. 
 * Cada componente químico lleva esencialmente un String (el texto de su componente), y debe 
 * ser capaz de compararse con otro componente químico. Un componente químico es menor o igual a 
 * otro si su nivel de electronegatividad es menor o igual (el componente químico C posee la 
 * menor electronegatividad, luego H, y luego el resto de los componentes químicos ordenados 
 * lexicográficamente). Se solicita que se definan clases que implementen las interfaces Comparable
 * y Comparator para poder comparar dos componentes químicos con el objeto de ordenar listas
 * de componentes químicos, y llevarlos a una fórmula química, utilizando un algoritmo de 
 * ordenamiento que utilice alguna de estas dos interfaces de comparación.*/


public class FormulaQuimica {
	private ArrayList<ComponenteQuimico> formulaQuimica;
	
	public FormulaQuimica() {
	}
	
	public FormulaQuimica(ArratList<ComponenteQuimico> formula) {
		this.formilaQuimica = formula;
	}
	
	public FormulaQuimica(ComponenteQuimico comp) {
		this.formulaQuimica.add(comp);
	}
}
