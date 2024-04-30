package aula15;

public class TestCalculadora {
	
	public static void main(String[] args) {
		
		System.out.println(Calculadora.soma(1, 2));
		 
		System.out.println(Calculadora.soma(1.3, 2));
		 
		 System.out.println(Calculadora.soma(1, 2.4));
		 
		 System.out.println(Calculadora.soma(1.3, 2));
		 
		 int[] vetorInt = {1,2,3};
		 System.out.println(Calculadora.soma(vetorInt));
		 
		 double[] vetorDou = {1.4,2.5,3.6};
		 System.out.println(Calculadora.soma(vetorDou));
	}
}
