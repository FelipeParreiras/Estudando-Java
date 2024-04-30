package aula11;

public class TestCarro {

	public static void main(String[] args) {
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel= 0.2;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		van.exibirAutonomia();
		System.out.println("O carro vai gastar "+ van.calcularCombustivel(10)+"L de combustivel");
		
		Carro fusca = new Carro();
		fusca.marca = "Volkswagen";
		fusca.modelo = "Fusca";
		fusca.numPassageiros = 4;
		fusca.capCombustivel = 30;
		fusca.consumoCombustivel= 0.15;
		
		System.out.println(fusca.marca);
		System.out.println(fusca.modelo);
		fusca.exibirAutonomia();
		System.out.println("O carro vai gastar "+ fusca.calcularCombustivel(12)+"L de combustivel");
	}

}
