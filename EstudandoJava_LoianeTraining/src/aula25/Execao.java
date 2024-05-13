package aula25;

public class Execao {
	public static void main(String[] args) {
		try {
			int vetor []= new int[4];
			System.out.println("Antes da exception");
			vetor[4]=1;
			System.out.println("O texto não será impresso!");
		}catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("Execão ao acessar um índice do vetor que não existe");
		}

		System.out.println("O texto erá impresso após a exception");
	}

}
