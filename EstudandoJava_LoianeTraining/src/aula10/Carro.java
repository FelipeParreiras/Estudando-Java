package aula10;

public class Carro {
	//Atributos
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	//Metodos
	void exibirAutonomia() {
		System.out.println("Autonomia é: " + obterAutonomia() + "Km");
	}
	
	double obterAutonomia() {
		return capCombustivel * consumoCombustivel;
	}
}
