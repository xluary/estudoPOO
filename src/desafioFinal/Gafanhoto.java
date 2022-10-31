package desafioFinal;

public class Gafanhoto extends Pessoa {

	private String login;
	private int totAssistido;
	
	public Gafanhoto(String nome, int idade, String sexo, String login) {
		super(nome, idade, sexo);
		this.login = login;
		this.totAssistido = 0;
	}
	
	@Override
	public String toString() {
		return "Gafanhoto [" + super.toString() + "login=" + login + ", totAssistido=" + totAssistido + "]";
	}

	public void viuMaisUm() {
		this.totAssistido++;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getTotAssistido() {
		return totAssistido;
	}

	public void setTotAssistido(int totAssistido) {
		this.totAssistido = totAssistido;
	}
	
	
}
