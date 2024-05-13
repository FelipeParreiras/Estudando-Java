package aula29;

public class UsandoMinhaException {

	public static void main(String[] args) {
		int[] numeros = {4,8,5,32,64,128};
		int[] denom = {2,0,4,8,0};
		
		for (int i = 0; i < numeros.length; i++) {
			try {
				if(numeros[i] % 2 != 0) {
					//lancar nossa exception
//					throw new Exception("Número ímpar, divisão não exata");
					throw new DivNaoExata(numeros[i],denom[i]);
				}
				System.out.println(numeros[i] + " / "+ denom[i] + " = " + (numeros[i]/denom[i]));
			}catch (ArithmeticException|ArrayIndexOutOfBoundsException|DivNaoExata e) {
				System.out.println("Erro ao dividir por 0 ou a posicao do array esta inválida!");
				e.printStackTrace();
			}
		}
	}

}
