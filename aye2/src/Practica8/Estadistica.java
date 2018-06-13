package Practica8;

public abstract interface Estadistica<T> {
	public T minimo() throws Exception;
	public T maximo() throws Exception;
	public int cantidadElementos();
	public abstract int suma() throws Exception;
	public abstract float promedio() throws Exception;
}
