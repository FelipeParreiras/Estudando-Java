package aula31;

public class Test {
	
	public static void main(String[] args) {
		DiaSemana dia = DiaSemana.DOMINGO;
		System.out.println(dia.toString()+"-"+dia.getValor());
		
		
		Data data = new Data(4,7,2003, DiaSemana.SEXTA);
		System.out.println(data.getDia()+"/"+data.getMes()+"/"+data.getAno()+" - "+data.getDiaSemana());
	}

}
