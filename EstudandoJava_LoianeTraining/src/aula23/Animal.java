package aula23;

public abstract class Animal {
	
	private String nome;

	public Animal() {
		super();
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public abstract void emitirSom();
	
}
