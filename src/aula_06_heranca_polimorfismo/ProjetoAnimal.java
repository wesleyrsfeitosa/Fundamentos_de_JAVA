package aula_06_heranca_polimorfismo;

public class ProjetoAnimal {

	public static void main(String[] args) {
		
//		Animal a = new Cachorro();
//		
//		//Casting explicito---------------------
//		// verifica na memoria se o objeto "a" referencia a classe Cachorro
//		if (a instanceof Cachorro) {
//			Cachorro c = (Cachorro) a;
//			c.falar();
//			c.morder();
//		}
		
		Cachorro c = new Cachorro();
		Gato g = new Gato();
		
		falar(c);
		falar(g);
		
		
	}
	private static void falar(Animal a ) {
		a.falar();
	}
	

}
