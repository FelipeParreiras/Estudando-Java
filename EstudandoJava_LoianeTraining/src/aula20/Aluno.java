package aula20;

public class Aluno extends Pessoa{

	private double[] notas;

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public double calcMedia() {
		double media = 0;
		
		return media;
	}
	
	public boolean vrfAprov() {
		return false;
	}

	@Override
	public void imprimirNome() {
		System.out.println("O nome deste aluno é: " + getNome());
	}
}
