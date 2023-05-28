package aula_16_produtividade_eclipse;

import java.util.ArrayList;
import java.util.List;

public class Projeto {

	public static void main(String[] args) {

	ContaCorrente c1 = new ContaCorrente();
	c1.depositar(1000);
	
	try {
		c1.sacar(200);
	} catch (SaldoInsuficienteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	List<ContaCorrente> lista = new ArrayList<ContaCorrente>();
	
		lista.add(new ContaCorrente());
		lista.add(new ContaCorrente());
		lista.add(new ContaCorrente());
		lista.add(new ContaCorrente());
		
	
			
	
	
		
	}

}
