package projetoAnimais;

public class ProjetoAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		Canguru c = new Canguru();
		Cachorro k = new Cachorro();
		
		c.locomover();
		k.locomover();
		c.emitirSom();
		k.emitirSom();
	}
	

}
