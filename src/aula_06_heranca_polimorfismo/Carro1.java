package aula_06_heranca_polimorfismo;

public class Carro1 extends Veiculo1{

	public Carro1(String marca) {
		super(marca);
		System.out.println("Carro1(String)");
		
	}
	public void status() {
		System.out.println("Esse é o Status");
	}
}
