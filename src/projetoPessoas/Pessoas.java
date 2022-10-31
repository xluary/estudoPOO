package projetoPessoas;

public abstract class Pessoas {
		
		// Atributos
		private String nome;
		private int idade;
		private String sexo;

		//Métodos personalizados
		public final void fazerAniversario(){
			this.idade++;
		}
		
		@Override
		public String toString() {
			return "Pessoas [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "]";
		}

		
		//Métodos especiais


		public String getNome() {
			return nome;
		}


		public void setNome(String nome) {
			this.nome = nome;
		}


		public int getIdade() {
			return idade;
		}


		public void setIdade(int idade) {
			this.idade = idade;
		}


		public String getSexo() {
			return sexo;
		}


		public void setSexo(String sexo) {
			this.sexo = sexo;
		}
}
