package aula_16_produtividade_eclipse;

public class ContaCorrente extends Conta {

	@Override
	public void sacar(double valor) throws SaldoInsuficienteException {
		if(getSaldo() - valor < 0) {
			throw new SaldoInsuficienteException("Saldo Insuficiente");
		}
		setSaldo(getSaldo() - valor);
		//TODO testar codigo
	}

	@Override
	public void depositar(double valor) {
		
		setSaldo(getSaldo() + valor);
	}

	

	}


