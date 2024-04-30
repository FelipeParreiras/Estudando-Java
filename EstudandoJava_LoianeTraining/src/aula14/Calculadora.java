package aula14;

public class Calculadora {
	//sobrecarga/overload de metodos
	public int soma(int num1,  int num2) {
		return num1 + num2;
	}
	public double soma(int num1,  double num2) {
		return num1 + num2;
	}
	public double soma(double num1,  double num2) {
		return num1 + num2;
	}
    public int soma(int[] vetorInteiros) {
        int total = 0;
        for (int i : vetorInteiros) {
            total += i;
        }
        return total;
    }
    public double soma(double[] vetorDoubles) {
        double total = 0;
        for (double i : vetorDoubles) {
            total += i;
        }
        return total;
    }
}
