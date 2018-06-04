package Practica7part2;

public class Matriz extends Numero{
	private int[][] mat; //muchas dudas
	
	public Matriz(int a, int b) {
		super(a, b);
		this.mat = new int[a][b];
	}
	
	public Matriz() {
		super(0, 0);
	}
	
	

	public int[][] getMat() {
		return mat;
	}

	public void setMat(int[][] mat) {
		this.mat = mat;
	}

	@Override
	public Numero suma(Numero numero2) {
		int i;
		int j;
		int[][] m3 = new int[n1][n2];
		if(numero2 instanceof Matriz) {
			for (i = 0; i < n1; i++) {
				for (j = 0; j < n2; j++) {
					m3[i][j] = mat[i][j] + ((Matriz)numero2).mat[i][j];
				}
			}
		}
		Matriz mat3 = new Matriz(n1, n2);
		mat3.mat = m3;
		return mat3;
	}

	@Override
	public Numero producto(Numero numero2) {
		int i;
		int j;
		Matriz mat3 = new Matriz(n1, n2);
		if (numero2 instanceof Matriz) {
			for (i = 0; i < n1; i++) {
				for (j = 0; j < n2; j++) {
					mat3.mat[i][j] = mat[i][j] * ((Matriz)numero2).mat[i][j];
				}
			}
		}
		return mat3;
	}

	@Override
	public void mostrar() {
		int j;
		int i;
		for (i = 0; i < n1; i++) {
			for (j = 0; j < n2; j++) {
				System.out.println("fila: " + i + ", columna: " + j + " : " + mat[i][j]);
			}
		}
	}
	
	public static void main(String[] args) {
		Matriz m = new Matriz(2, 2);
		m.mat[0][0] = 4;
		m.mat[0][1] = -2;
		m.mat[1][0] = 5;
		m.mat[1][1] = -3;
		
		Matriz m2 = new Matriz(2, 2);
		m2.mat[0][0] = 0;
		m2.mat[0][1] = 1;
		m2.mat[1][0] = 3;
		m2.mat[1][1] = -3;
		
		m.suma(m2).mostrar();
		m.producto(m2).mostrar();
	}
}
