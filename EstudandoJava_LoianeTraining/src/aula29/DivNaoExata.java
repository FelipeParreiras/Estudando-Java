package aula29;

public class DivNaoExata extends Exception {

	private int num;
	private int den;
	
	public DivNaoExata(int num, int den) {
		super();
		this.num = num;
		this.den = den;
	}

	@Override
	public String toString() {
		return "Resultado de " + num + "/" + den + " não é um inteiro";
	}
	
	
}
