package uec;

import java.util.Random;

public class Luta {
	// Atributos
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	
	// Métodos personalizados
	
	public void marcarLuta(Lutador l1, Lutador l2) {
		if (l1.getCategoria().equals(l2.getCategoria()) && (l1 != l2)) {
			this.aprovada= true;
			this.desafiado = l1;
			this.desafiante= l2;
		} else {
			this.aprovada= false;
			this.desafiado = null;
			this.desafiante= null;
		}
	}
	
	public void lutar(){
		if (this.aprovada) {
			System.out.println("");
			System.out.println("### DESAFIADO ###");
			this.desafiado.apresentar();
			System.out.println("");
			System.out.println("### DESAFIANTE ###");
			this.desafiante.apresentar();
			System.out.println("");
			System.out.println("=== RESULTADO DA LUTA ===");

			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3);
			
			switch(vencedor) {
				case 0:
					System.out.println("Empatou! ");
					this.desafiado.empatarLuta();
					this.desafiante.empatarLuta();
					break;
				case 1:
					System.out.println("Vitória de "+ this.desafiado.getNome());
					this.desafiado.ganharLuta();
					this.desafiante.perderLuta();
					break;
				case 2:
					System.out.println("Vitória de " + this.desafiante.getNome());
					this.desafiado.perderLuta();
					this.desafiante.ganharLuta();
					break;
			}
			System.out.println("==================================");
		}else {
			System.out.println("A luta não pode acontecer");
		}
	}

	// Método especiais
	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador dasafiado) {
		this.desafiado = dasafiado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean isAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	

	
}
