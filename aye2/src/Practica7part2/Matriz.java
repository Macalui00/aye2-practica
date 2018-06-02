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

	@Override
	public Numero suma(Numero numero2) {
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
