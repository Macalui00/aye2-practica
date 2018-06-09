package Practica8;

import java.util.ArrayList;

/*Una f�rmula qu�mica se representa utilizando un array ordenado de componentes qu�micos. 
 * Cada componente qu�mico lleva esencialmente un String (el texto de su componente), y debe 
 * ser capaz de compararse con otro componente qu�mico. Un componente qu�mico es menor o igual a 
 * otro si su nivel de electronegatividad es menor o igual (el componente qu�mico C posee la 
 * menor electronegatividad, luego H, y luego el resto de los componentes qu�micos ordenados 
 * lexicogr�ficamente). Se solicita que se definan clases que implementen las interfaces Comparable
 * y Comparator para poder comparar dos componentes qu�micos con el objeto de ordenar listas
 * de componentes qu�micos, y llevarlos a una f�rmula qu�mica, utilizando un algoritmo de 
 * ordenamiento que utilice alguna de estas dos interfaces de comparaci�n.*/


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
