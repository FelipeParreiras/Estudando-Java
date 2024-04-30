package aula17;

public class Teste {

	public static void main(String[] args) {
		
		Endereco endereco1 = new Endereco("Rua do Teste","TesteCity","TesteState","TesteCep");
		Telefone celular = new Telefone("31", "0000000");
		Telefone casa = new Telefone("31", "0000001");
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = celular;
		telefones[1] = casa;
		Contato contato1 = new Contato("Felipe", "Felipe@email.com", telefones,endereco1);
		
		contato1.exibirDados();
	}

}
