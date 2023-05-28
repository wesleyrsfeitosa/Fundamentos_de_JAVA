package aula_07_classes_abstratas_interfaces;

public class ProjetoAbstrato1 {

	public static void main(String[] args) {

		Diamante1 d = new Diamante1();
		d.pegar();
		
		Cogumelo1 c = new Cogumelo1();
		c.pegar();
		
		Moeda1 m = new Moeda1();
		m.pegar();
		
		Item1 maca = new Maca1();
		maca.pegar();
	}

}
