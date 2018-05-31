package Practica7part2;

public class Matriz extends Numero{
	private int[][] mat;
	
	public Matriz(int a, int b) {
		this.n1 = a;
		this.n2 = b;
		mat = new int[a][b];
	}
	
	public Matriz() {
		this.n1 = 0;
		this.n2 = 0;
	}

	@Override
	public Numero suma(Matriz numero2) {
		int i;
		int j;
		int[][] m3 = new int[n1][n2];
		for (i = 0; i < n1; i++) {
            for (j = 0; j < n2; j++) {
                m3[i][j] = mat[i][j] + numero2.mat[i][j];
            }
        }
		Matriz mat3 = new Matriz(n1, n2);
		mat3.mat = mat3;
		return null;
	}

	@Override
	public Numero producto(Numero numero2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
	
	}
}
