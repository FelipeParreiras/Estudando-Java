package aula17;

public class Telefone {
	private String dd;
	private String num;
	
	public Telefone(String dd, String num) {
		super();
		this.dd = dd;
		this.num = num;
	}
	
	public String getDd() {
		return dd;
	}
	
	public void setDd(String dd) {
		this.dd = dd;
	}
	
	public String getNum() {
		return num;
	}
	
	public void setNum(String num) {
		this.num = num;
	}
	
    public void exibirTelefone() {
        System.out.println("DD: " + dd);
        System.out.println("Numero: " + num);

    }
}
