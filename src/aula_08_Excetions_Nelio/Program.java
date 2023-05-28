package aula_08_Excetions_Nelio;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

			
		
		System.out.println("Informe os dados da conta");
		System.out.println("Numero: ");
		int number = entrada.nextInt();
		
		System.out.println("Titular: ");
		entrada.nextLine();
		String holder = entrada.nextLine();
		
		System.out.println("Saldo inicial: ");
		double balance = entrada.nextDouble();
		
		System.out.println("Limite de Saque: ");
		double withdrawLimit = entrada.nextDouble();
		
		Account acc = new Account(number, holder, balance, withdrawLimit);
		
		System.out.println();
		
		
		System.out.println("Informe uma quantia para sacar: ");
		double amount = entrada.nextDouble();
		
		try {
		acc.withdraw(amount);
		System.out.printf("Novo saldo: %.2f%n ",  acc.getBalance());
		}catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		
 entrada.close();	
	}

}
