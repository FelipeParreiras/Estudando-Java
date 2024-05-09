package aula22;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public class Aluno {

	private double[] notas;
	private String curso;
	
	public Aluno() {

	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
// 	gambiarra feita a mao
//	public String toString() {
//		String s = curso + "/n";
//		for (int i = 0; i < notas.length; i++) {
//			s+= notas +" ";
//		}
//		return s;
//	}
// feito usando a ide(Eclipse)
	@Override
	public String toString() {
		return "Aluno [notas=" + Arrays.toString(notas) + ", curso=" + curso + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(curso, other.curso) && Arrays.equals(notas, other.notas);
	}
	
	
}
