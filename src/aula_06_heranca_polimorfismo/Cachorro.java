package aula_06_heranca_polimorfismo;

public class Cachorro extends Animal {

	@Override
	public void falar() {
		System.out.println("AU! AU!");
	}
	
	public void morder() {
		System.out.println("Estou Mordendo");
	}
}
