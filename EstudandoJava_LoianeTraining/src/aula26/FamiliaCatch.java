package aula26;

public class FamiliaCatch {

	public static void main(String[] args) {

		int[] numeros = {4,8,16,32,64,128};
		int[] demon = {2,0,4,8,0};
		
		for (int i = 0; i < numeros.length; i++) {
			try {
				System.out.println(numeros[i] + " / "+ demon[i] + " = " + (numeros[i]/demon[i]));
			}catch (ArithmeticException|ArrayIndexOutOfBoundsException e1) {
				System.out.println("Erro ao dividir por 0 ou a posicao do array esta inválida!");
			}
		}
	}

}
