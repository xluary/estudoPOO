package projetoPessoas;

public class Professor extends Pessoas {
	private String especialidade;
	private double salario;
	
	// Métodos personalizados
	public void ReceberAumento(double a) {
		this.salario += a;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
