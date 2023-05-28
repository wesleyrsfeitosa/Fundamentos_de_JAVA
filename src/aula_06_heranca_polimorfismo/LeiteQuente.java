package aula_06_heranca_polimorfismo;

public class LeiteQuente extends Bebida{

	public LeiteQuente() {
		super("Leite Quente", true);
		
	}
	
	@Override
	public void preparar() {
		System.out.println("Pegando um copo");
		System.out.println("Colocando o leite no copo");
	}

}
