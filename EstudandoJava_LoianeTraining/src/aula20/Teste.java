package aula20;

public class Teste {

	public static void main(String[] args) {
		Aluno aluno01 = new Aluno();
		aluno01.setNome("Felipe");
		Professor professor01 = new Professor();
		professor01.setNome("Luiz");
		aluno01.imprimirNome();
		professor01.imprimirNome();
	}

}
