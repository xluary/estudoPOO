package projetoPessoas;

public class ProjetoPessoas {

	public static void main(String[] args) {
		Visitante p1 = new Visitante();
		Aluno p2 = new Aluno();
		Professor p3= new Professor();
		Funcionario p4 = new Funcionario();
		
		p1.setNome("Paulo");
		p2.setNome("Maria");
		p3.setNome("Claudio");
		p4.setNome("Fabiana");
		

		p4.setSexo("F");
		p2.setIdade(18);
		
		p2.setCurso("Informatica");
		p3.setSalario(2500.75f);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
	}

}
