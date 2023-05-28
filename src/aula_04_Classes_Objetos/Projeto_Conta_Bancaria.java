package aula_04_Classes_Objetos;

public class Projeto_Conta_Bancaria {

	public static void main(String[] args) {
		
		ContaBancaria c = new ContaBancaria();
		
		c.setNumConta(54334);
		c.setAtiva(true);
		c.depositar(500);
		c.depositar(150);
		
		c.status();
		
	}

}
