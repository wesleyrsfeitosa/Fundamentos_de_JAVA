package aula_08_checked_exceptions;

public class Banco {

	public static void main(String[] args)  throws Exception{
	
		//public void realizarOperacao();
		
		ContaBancaria c = new ContaBancaria(1000);
		
		//try {
			try {
				c.sacar(300);
				System.out.println("Saque foi realizado com sucesso");
				
				
				
//			} catch (ValorNegativoException e) {
//				System.out.println("Erro de saque: valor negativo");
//			
//			}catch (SaldoInsuficienteException e) {
//				System.out.println("Erro de saque: saldo insuficiente");
//				
		}finally {
				System.out.println(c.getSaldo());
			}
			
			

		//} catch (Exception e) {
		//	System.out.println("Ocorreu um erro no saque: " + e.getMessage());
		//}

		

	}

}
