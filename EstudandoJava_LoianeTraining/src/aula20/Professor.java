package aula20;

public class Professor extends Pessoa{

	private double salario;
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double calcSalarLiqui() {
		return 0;
	}

	@Override
	public void imprimirNome() {
		System.out.println("O nome deste Professor é: " + getNome());
	}
	
}
