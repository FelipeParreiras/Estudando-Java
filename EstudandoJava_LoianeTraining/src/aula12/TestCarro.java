package aula12;

public class TestCarro {

	public static void main(String[] args) {
		Carro van = new Carro("Fiat","Ducato",10,100,0.2);
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		van.exibirAutonomia();
		System.out.println("O carro vai gastar "+ van.calcularCombustivel(10)+"L de combustivel");
		
		Carro fusca = new Carro("Volkswagen","Fusca",4,30,0.15);
		
		System.out.println(fusca.marca);
		System.out.println(fusca.modelo);
		fusca.exibirAutonomia();
		System.out.println("O carro vai gastar "+ fusca.calcularCombustivel(12)+"L de combustivel");
	}

}
