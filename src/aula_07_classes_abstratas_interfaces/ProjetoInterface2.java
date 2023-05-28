package aula_07_classes_abstratas_interfaces;

public class ProjetoInterface2 {

	public static void main(String[] args) {
		
		Ferrari2 f = new Ferrari2();
//		Rota2 rota = new Rota2();
//		rota.ir(f);
		
		AnelBrilhante2 a = new AnelBrilhante2();
		
		Vendedor2 v = new Vendedor2();
		
		v.mostrarPreco(f);
		v.mostrarPreco(a);
	}

}
