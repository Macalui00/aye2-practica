package Practica8;

/*Definir una interfaz ArbolBinUniH<A,B,C,D> con métodos de armado de un
*nodo hoja con un valor de la clase A, de un nodo unario con un valor de la 
*clase B y un subárbol, de un nodo binario con un valor de la clase C y 
*dos subárboles,y una función de recorrida recursiva que retorne un valor 
*de la clase D. Tener en cuenta que los métodos constructores de una clase
*no pueden figurar como métodos de una interfaz implementada por esa clase.*/

public interface ArbolBinUniH<A,B,C,D> {
	public void nodoHoja(A a);
	public void nodoUnario(B b, ArbolBinUniH<A, B, C, D> subarbol);
	public void nodoBinario(C c, ArbolBinUniH<A, B, C, D> suba1, ArbolBinUniH<A, B, C, D> suba2);
	public D recorrer();
}
