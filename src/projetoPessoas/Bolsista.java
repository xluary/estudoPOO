package projetoPessoas;

public class Bolsista extends Aluno{
	private float bolsa;
	
	public void RenovarBolsa() {
		System.out.print("Renovando bolsa");
	}

	@Override
	public void PagarMensalidade() {
		System.out.print("Pagamento facilitado, bolsista");
	}

	public float getBolsa() {
		return bolsa;
	}

	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}

	
}
