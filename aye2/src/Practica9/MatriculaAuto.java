package Practica9;

public class MatriculaAuto {
	
	private char letra;
	private int numero;
	private boolean esValido;
	
	public MatriculaAuto(char letra, String digitos) throws MatriculaAutoException {
		if(letra != 'A' && letra != 'B') {
			throw new LetraInvalidaException("La letra (" + letra + ") es invalida."); //creamos una excepcion la cual vamos a tener que definir
		}
		if (digitos.length() != 8) {
			throw new CantidadDigitosInvalida("La cantidad de digitos (" + digitos.length() + ")");
		}
		numero = Integer.parseInt(digitos);
		
		this.letra = letra;
		esValido = true;
	}
	
	public MatriculaAuto() {
		esValido = true;
	}
	
	public void setNumero(String digitos) {
		
		try {
		if (digitos.length() != 8) {
			throw new CantidadDigitosInvalida("La cantidad de digitos (" + digitos.length() + ") es invalida");
		}
		numero = Integer.parseInt(digitos);
		} catch (CantidadDigitosInvalida e) {
			System.out.println("El numero es invalido");
			esValido = false;
	
		} catch(NumberFormatException e) {
			System.out.println("El numero no tiene 8 dígitos");
			esValido = false;
		}
		
	}
	
	public void setLetra(char letra) {
		try {
			if(letra != 'A' && letra != 'B') {
				throw new LetraInvalidaException("La letra (" + letra + ") es invalida."); //creamos una excepcion la cual vamos a tener que definir
			}
			this.letra = letra;
		} catch (LetraInvalidaException e) {
			System.out.println("Letra invalida");
			esValido = false;
			this.letra = '_';
		}
	}
	
	public boolean esValido() {
		return esValido;
	}
	
	@Override
	public String toString() {
		return "Matricula Auto: " + letra + "-" + numero;
	}
	
	public static void main(String[] args) {
		MatriculaAuto mat;
		/*mat = new MatriculaAuto('A', "12345678");
		 * */
		/*try {
			mat = new MatriculaAuto('z', "12345678");
		} catch (MatriculaAutoException e) {
			System.out.println("Error de instanciacion: " + e);
			//e.printStackTrace();
		}
		*/
		try {
			mat = new MatriculaAuto('z', "123xxxx678");
		} catch (MatriculaAutoException e) {
			System.out.println("Error de instanciacion: " + e);
			//e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println("Error en formato de numero: ");
			System.out.println(e);
		}
		//System.out.println(mat);
		
		System.out.println("TERMINA OK");
		
		// version con validacion de metodos
		
		MatriculaAuto mat2 = new MatriculaAuto();
		mat2.setLetra('A');
		mat2.setNumero("81242341");
		if (mat2.esValido()) {
			System.out.println(mat2);
		}
		System.out.println("TERMINA OK");
	}
	
}
