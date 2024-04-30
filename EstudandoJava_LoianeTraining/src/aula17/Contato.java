package aula17;

public class Contato {
	
    private String nome;
    private String email;
    private Telefone[] telefone;
    private Endereco endereco;
    
	public Contato(String nome, String email, Telefone[] telefone, Endereco endereco) {
		super();
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Telefone[] getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone[] telefone) {
		this.telefone = telefone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void exibirDados() {
		System.out.println("Nome:" + nome);
		System.out.println("Email:" + email);
		endereco.exibirEndereco();
		for (int i = 0; i < telefone.length; i++) {
			System.out.println("Telefone " + (i+1) +":");
			telefone[i].exibirTelefone();
		}
	}
    }
