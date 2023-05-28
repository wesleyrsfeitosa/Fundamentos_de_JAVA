package aula_06_heranca_polimorfismo;

public class Carro extends Veiculo{
	
	private boolean quatroPortas;
	
	public boolean getQuatroPortas() {
		return quatroPortas;
	}

	public void setQuatroPortas(boolean quatroPortas) {
		this.quatroPortas = quatroPortas;
	}

	@Override
	public void buzinar() {
		System.out.println("O Carro esta buzinando");
	}
	
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("Quatro portas? " + this.getQuatroPortas());
		
	}
		
	}

