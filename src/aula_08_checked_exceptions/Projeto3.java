package aula_08_checked_exceptions;

public class Projeto3 {

	public static void main(String[] args) {

		double valorTotal = 1000.0;
		double entrada = 100;
		int parcelas = 10;

		
		try {

			Financiamento3 f = new Financiamento3(valorTotal, entrada, parcelas);
			System.out.println(f.prestacao());
		
		} catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
