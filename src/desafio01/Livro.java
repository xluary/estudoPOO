package desafio01;

public class Livro implements Publicacao{
	// Atributos
	private String titulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;

	//Métodos personalizados
	public String detalhes() {
		return "Livro [titulo=" + titulo + "\n autor=" + autor + "\n totPaginas=" + totPaginas + ", pagAtual=" + pagAtual
				+ "\n aberto=" + aberto + "\n leitor=" + leitor.getNome() + ", idade=" + leitor.getIdade() + ", sexo=" + leitor.getSexo() + "]";
	}
	
	@Override
	public void abrir() {
		this.aberto = true;
		
	}





	@Override
	public void fechar() {
		this.aberto = false;
		
	}

	@Override
	public void folear(int p) {
		if (p > this.totPaginas) {
			this.pagAtual=0;
		} else {
			this.pagAtual=p;
		}	
	}

	@Override
	public void avancarPag() {
		if (this.pagAtual>=this.totPaginas) {
			this.pagAtual = 0;
		} else {
			this.pagAtual++;
		}
	}

	@Override
	public void voltarPag() {
		if (this.pagAtual==0) {
			this.pagAtual = 0;
		} else {
			this.pagAtual--;
		}
		
	}
		
	//Métodos especiais
	public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.totPaginas = totPaginas;
		this.aberto=false;
		this.pagAtual=0;
		this.leitor = leitor;
	}

	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getTotPaginas() {
		return totPaginas;
	}

	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}

	public int getPagAtual() {
		return pagAtual;
	}

	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}

	public boolean isAberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public Pessoa getLeitor() {
		return leitor;
	}

	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}

	
}
