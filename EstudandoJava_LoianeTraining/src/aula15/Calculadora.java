package aula15;

public class Calculadora {
	//metodos estaticos
	public static int soma(int num1,  int num2) {
		return num1 + num2;
	}
	public static double soma(int num1,  double num2) {
		return num1 + num2;
	}
	public static double soma(double num1,  double num2) {
		return num1 + num2;
	}
    public static int soma(int[] vetorInteiros) {
        int total = 0;
        for (int i : vetorInteiros) {
            total += i;
        }
        return total;
    }
    public static double soma(double[] vetorDoubles) {
        double total = 0;
        for (double i : vetorDoubles) {
            total += i;
        }
        return total;
    }
}
