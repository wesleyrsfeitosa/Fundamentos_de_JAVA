package aula_04_Classes_Objetos;

public class ProjetoOperacao {

	public static void main(String[] args) {
		
		//Operacao o = new Operacao();
		Operacao1 o = new Operacao1();
		// int x = 10;
		// o.trocar(x);
		//System.out.println(x);
		 
		Valor valor = new Valor();
		valor.v = 10;
		
		o.alterarValor(valor);
		
		System.out.println(valor.v);
		
		
	}

}
