package desafioFinal;

public class DesafioFinal {

	public static void main(String[] args) {
		Video v[]= new Video[3];
		v[0]= new Video("Aula 1 POO");
		v[1]= new Video("Aula 2 POO");
		v[2]= new Video("Aula 3 POO");
		
		
		
		Gafanhoto g[]= new Gafanhoto[2];
		g[0] = new Gafanhoto("Isabella", 26, "F", "xluary");
		g[1]= new Gafanhoto("Alex", 31, "M", "xtrash");
		
		Visualizacao vis[] = new Visualizacao[3]; 
				
		vis[0] = new Visualizacao(g[0], v[0]);
		vis[0].avaliar();
		System.out.println(vis[0].toString());
		
		vis[1]= new Visualizacao(g[0], v[1]);
		vis[1].avaliar(87.0f);
		System.out.println(vis[1].toString());
	}

}
