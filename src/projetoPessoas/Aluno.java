package projetoPessoas;

public class Aluno extends Pessoas{
	//Atributos
	private int mat;
	private String curso;
	
	// Métodos personalizados
	public void cancelarMatr() {
		System.out.print("Matrícula será cancelada");
	}
	
	public void PagarMensalidade() {
		System.out.print("Pagando Mensalidade de Aluno");
	}

	// Métodos especiais

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
}
