package aula22;

public class Teste {

	public static void main(String[] args) {

		Aluno aluno01 = new Aluno();
		
		aluno01.setCurso("Eng De Software");
		double[] notas1 = {5,4,7,10};
		aluno01.setNotas(notas1);
		
		System.out.println(aluno01);
		
		Aluno aluno02 = new Aluno();
		
		aluno01.setCurso("Eng De Software");
		double[] notas2 = {5,4,7,7};
		aluno01.setNotas(notas2);
		
		System.out.println(aluno02);
		
		System.out.println(aluno02.equals(aluno01));
	}

}
