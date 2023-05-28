package aula_03_conceitos_iniciais;

public class Estrutura_Controle_Switch {

	public static void main(String[] args) {

		int num = 15;

		switch (num) {

		case 5:
			System.out.println("O número é 5");
			break;

		case 10:
			System.out.println("O número é 10");
			break;

		case 15:
			System.out.println("O número é 15");
			break;
			default:
				System.out.println("O número é outro");
		}
	}

}
