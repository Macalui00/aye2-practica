package Practica7part2;

public class Cola<T> extends Lista<T>{

	public Cola() {
		super();
	}
	
	public Cola(T dato) {
		super(dato);
	}
	
	@Override
	public void addElem(T dato) {
		if (esVacia()) {
			head = dato;
		} else {
			if (tail == null) {
				tail = new Cola<T>(dato);
			} else {
				tail.addElem(dato);
			}
		}
	}

	@Override
	public boolean esVacia() {
		if (head == null) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public T sacarElem() {
		if (tail.esVacia()) {
			return head;
		} else {
			tail.sacarElem();
		}
	}
	
}
