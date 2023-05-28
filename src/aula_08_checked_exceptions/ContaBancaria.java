package aula_08_checked_exceptions;

public class ContaBancaria {

	private double saldo;
	
	//construtor----------------------------------------
	public ContaBancaria(double saldo) {
		this.saldo = saldo;
	}
	
	//metodo--------------------------------------------------------------
	public void sacar(double valor) throws ValorNegativoException, SaldoInsuficienteException {
		
		if(valor <=0) {
			throw new ValorNegativoException(valor);
		}
		if(saldo - valor < 0) {
			throw new SaldoInsuficienteException(valor, saldo);
		}
		this.saldo -= valor;
		
	}
//metodos especiais get e set

	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
}
