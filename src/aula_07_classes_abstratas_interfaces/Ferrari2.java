package aula_07_classes_abstratas_interfaces;

public class Ferrari2 implements Carro2, ItemCaro2{

	@Override
	public void virarEsquerda() {
		System.out.println("Ferrari virou a esquerda");
		
	}

	@Override
	public void virarDireita() {
		System.out.println("Ferrari virou a direita");
		
	}

	@Override
	public void acelerar() {
		System.out.println("Ferrari acelerou");
		
	}

	@Override
	public void abrirPorta() {
		System.out.println("Ferrari abriu a porta");
		
	}

	@Override
	public double getPreco() {
		return 1000000;
	}

}
