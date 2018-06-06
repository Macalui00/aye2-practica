package practica7parte3;

public class ArbolBinarioHoja<T, H> {
	private Either<T, H> raiz; //dudas de como definir la raiz
	private ArbolBinarioHoja<T, H> si;
	private ArbolBinarioHoja<T, H> sd;
	
	public ArbolBinarioHoja(Either<T, H> e) {
		this.raiz = e;
	}

	public Either<T, H> getRaiz() {
		return raiz;
	}

	public void setRaiz(Either<T, H> raiz) {
		this.raiz = raiz;
	}

	public ArbolBinarioHoja<T, H> getSi() {
		return si;
	}

	public void setSi(ArbolBinarioHoja<T, H> si) {
		this.si = si;
	}

	public ArbolBinarioHoja<T, H> getSd() {
		return sd;
	}

	public void setSd(ArbolBinarioHoja<T, H> sd) {
		this.sd = sd;
	}
	
	public T getNodoT() {         //get nodo NO hoja
		return raiz.getA();
	}
	
	public H getNodoH() {         // get nodo hoja
		return raiz.getB();
	}
	
	
	public boolean esHoja() {
		if (si == null && sd == null) {
			return true;
		} else {
			return false;
		}
	}
	
	public void insertar(Either<T, H> e) {
		if ((esHoja()) || (si == null)) {
			si = new ArbolBinarioHoja<T, H>(e);
		} else if(sd == null) {
			sd = new ArbolBinarioHoja<T, H>(e);
		} else {
			if (si.altura() > sd.altura()) {
				sd.insertar(e);
			} else {
				si.insertar(e);
			}
		}
	}
	
	public int altura() {
		if (esHoja()) {
			return 1;
		} else {
			int alturaI = 0;
			int alturaD = 0;
			if (si != null) {
				alturaI = si.altura();
			} 
			if (sd != null) {
				alturaD = sd.altura();
			}
			return 1 + Math.max(alturaI, alturaD);
		}
	}
	
}
