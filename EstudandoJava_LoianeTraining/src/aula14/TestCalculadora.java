package aula14;

public class TestCalculadora {
	public static void main(String[] args) {
		
		 Calculadora calc = new Calculadora();
		 
		 calc.soma(1, 2);
		 
		 calc.soma(1.3, 2);
		 
		 calc.soma(1, 2.4);
		 
		 calc.soma(1.3, 2);
		 
		 int[] vetorInt = {1,2,3};
		 calc.soma(vetorInt);
		 
		 double[] vetorDou = {1.4,2.5,3.6};
		 calc.soma(vetorDou);
	}
}
