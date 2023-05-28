package aula_08_checked_exceptions;

@SuppressWarnings("serial")
public class ValorNegativoException  extends Exception{

		private double valor;
		

	public ValorNegativoException(double valor) {
		this.valor = valor;
	
	}

	public double getValor() {
		return valor;
	}

	
}
