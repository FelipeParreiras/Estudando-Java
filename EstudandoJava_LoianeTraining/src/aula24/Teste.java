package aula24;

public class Teste {

	public static void main(String[] args) {
//	//upcasting
//		Aluno aluno01 = new Aluno();
//		Pessoa pessoa01 = aluno01;
//		
//	//dowcasting
//		Pessoa pessoa02 = new Pessoa();
//		Aluno aluno02 = (Aluno) pessoa02;
		
	//instanceof	
		Pessoa pessoa = new Pessoa();
		Aluno aluno = new Aluno();
		Professor professor = new Professor();
		
	if(pessoa instanceof Pessoa) {
		System.out.println("É do tipo Pessoa");
	}
	if(aluno instanceof Aluno) {
		System.out.println("É do tipo Aluno");
	}
	if(professor instanceof Professor) {
		System.out.println("É do tipo Professor");
	}
	}
}
