package aula32;

import aula31.DiaSemana;

public class TesteEnum {

	public static void main(String[] args) {
		
		DiaSemana[] dias = DiaSemana.values();
		
		for(int i=0;i<dias.length;i++) {
			System.out.println(dias[i]);
		}
	}

}
