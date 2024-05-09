package Aula18;

public class Aluno extends Pessoa{

	private double[] notas;
	

	public Aluno() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Aluno(String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
		// TODO Auto-generated constructor stub
	}

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
}
