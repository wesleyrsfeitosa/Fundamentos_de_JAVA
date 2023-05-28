package aula_04_Classes_Objetos;

public class ProjetoMatematica {

	public static void main(String[] args) {
		Matematica m = new Matematica();

		int soma = m.somar(10, 20);
		System.out.println("= " + soma);
		
		int somar = m.somar(10, 25, 15);
		System.out.println("= " + somar);
		
		double soma2 = m.somar(10.5, 10.5);
		System.out.println("= " + soma2);
	}

}
