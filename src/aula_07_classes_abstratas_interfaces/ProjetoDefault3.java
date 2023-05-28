package aula_07_classes_abstratas_interfaces;

public class ProjetoDefault3 {

	public static void main(String[] args) {
		
		Ferrari3 f = new Ferrari3();
		Porsche3 p = new Porsche3();
		
		f.derrapar();
		p.derrapar();
		
		int vm = Automovel3.getVelocidadeMaxima();
		System.out.println(vm);
	}

}
