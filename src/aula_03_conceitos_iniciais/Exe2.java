package aula_03_conceitos_iniciais;

public class Exe2 {

	public static void main(String[] args) {

		// exercicio1-----------------------------------------------------
		//o for inicia em 10 e termina em 25
				for (int i = 10; i <= 25; i++) {
				
					System.out.print(" " + i);
				}
				System.out.println(" ");

		// exercicio2------------------------------------------------------
				//variável para aculular a soma dos valores (inicia em 0)
				int soma = 0;
				
				//for de 1 até 100
				for (int i = 1; i <= 100; i += 2) {
					//para cada iteração do for, soma recebe o seu valor anterior somado com o valor de i
					soma = soma + i;
				}
				
				System.out.print(" " + soma);
				System.out.println(" ");
		// exercicio3----------------------------------------------------------------
				//r acumula o valor da soma para checar se o loop deve parar
				int r = 0;
				
				//i representa cada iteração do bloco while
				int i = 0;
				
				//para checar se a próxima iteração passará de 100, é necessário verificar se a soma de
				//r e i é menor do que 100
				while (r + i < 100) {
					
					System.out.print(" " + i);
					
					//r recebe o seu valor somado com i
					r += i;
					
					//i é incrementado, indicando que esta iteração terminou
					i++;
				}
				System.out.println(" ");
		// exercicio4-------------------------------------------------------------------
		
		System.out.println(" ");
		int num = 9;

		for (int j = 0; j < 10; j++) {
			int conta = num * j;
			System.out.println(num + " * " + j + " = " + conta);
		}

	}

}
