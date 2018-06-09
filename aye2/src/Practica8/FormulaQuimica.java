package Practica8;

import java.util.ArrayList;
import java.util.Collections;

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
		this.formulaQuimica = new ArrayList<ComponenteQuimico>();
	}
	
	public FormulaQuimica(ArrayList<ComponenteQuimico> formula) {
		this.formulaQuimica = new ArrayList<ComponenteQuimico>();
		this.formulaQuimica = formula;
	}
	
	public FormulaQuimica(ComponenteQuimico comp) {
		this.formulaQuimica = new ArrayList<ComponenteQuimico>();
		this.formulaQuimica.add(comp);
	}
	
	public ArrayList<ComponenteQuimico> getFormulaQuimica() {
		return formulaQuimica;
	}

	public void setFormulaQuimica(ArrayList<ComponenteQuimico> formulaQuimica) {
		this.formulaQuimica = formulaQuimica;
	}
	
	public void addComponente(ComponenteQuimico comp) {
		this.formulaQuimica.add(comp);
	}

	public void ordenarComponentes() {
		ArrayList<ComponenteQuimico> formulaFinal = new ArrayList<ComponenteQuimico>();
		ordenarComponentes2(formulaFinal);
		setFormulaQuimica(formulaFinal);
	}
	
	private void ordenarComponentes2(ArrayList<ComponenteQuimico> formulaFinal) {
		if (formulaQuimica != null) {
			seleccionarComponente(formulaFinal, "C");
			seleccionarComponente(formulaFinal, "H");
			if(formulaQuimica != null) {
				Collections.sort(formulaQuimica, new ComparadorComponente());
				pasarComponentes(formulaFinal);
				setFormulaQuimica(formulaFinal);
			}
			
		}
	}
	
	private void seleccionarComponente(ArrayList<ComponenteQuimico> formulaFinal, String comp) {
		int contador = 0;
		ComponenteQuimico componente;

		for(ComponenteQuimico c: formulaQuimica) {
			System.out.println(c.getComponente() + 1);
			if(c.getComponente().equals(comp)) {
				formulaFinal.add(c);
			}
		}
		int tama�o = formulaQuimica.size();
		while(!formulaQuimica.isEmpty() && contador < tama�o) {
			componente = formulaQuimica.get(contador);
			System.out.println(componente.getComponente() + 2);
			if(componente.getComponente().equals(comp)) {
				formulaQuimica.remove(contador);
				tama�o = tama�o - 1;
			}
			contador = contador + 1;
		}
	}
	
		
	private void pasarComponentes(ArrayList<ComponenteQuimico> formulaFinal) {
		
		for(ComponenteQuimico c: formulaQuimica) {
			formulaFinal.add(c);
		}

	}
	
	public void mostrarComponentes() {
		for(ComponenteQuimico c: formulaQuimica) {
			System.out.println(c.getComponente());
		}
	}
	public static void main(String[] args) {
		FormulaQuimica formula = new FormulaQuimica();
		ComponenteQuimico comp1 = new ComponenteQuimico("C");
		ComponenteQuimico comp2 = new ComponenteQuimico("H");
		ComponenteQuimico comp3 = new ComponenteQuimico("M");
		ComponenteQuimico comp4 = new ComponenteQuimico("N");
		ComponenteQuimico comp5 = new ComponenteQuimico("L");
		formula.addComponente(comp1);
		formula.addComponente(comp2);
		formula.addComponente(comp3);
		formula.addComponente(comp1);
		formula.addComponente(comp4);
		formula.addComponente(comp5);
		formula.mostrarComponentes();
		formula.ordenarComponentes();
		formula.mostrarComponentes();
	}
	
}
