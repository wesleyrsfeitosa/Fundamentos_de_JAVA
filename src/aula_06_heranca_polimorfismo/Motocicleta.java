package aula_06_heranca_polimorfismo;

public class Motocicleta extends Veiculo {

	@Override
	public void buzinar() {
		System.out.println("A Motocicleta esta buzinando");
	}
	
	public void empinar() {
		System.out.println("Estou empinando a moto");
	}
}
