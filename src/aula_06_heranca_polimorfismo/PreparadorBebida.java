package aula_06_heranca_polimorfismo;

public class PreparadorBebida {

	public void prepararBebida(Bebida bebida) {
		System.out.println("Preparando a Bebida " + bebida.getNome());

		bebida.preparar();

		if (bebida.getAquecer()) {
			System.out.println("Aquecendo a bebida " + bebida.getNome());
		}
		System.out.println("Bebida preparada com sucesso!");

	}

}
