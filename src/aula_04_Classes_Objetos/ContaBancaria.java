package aula_04_Classes_Objetos;

public class ContaBancaria {

	private int numConta;
	private boolean ativa;
	private double saldo;
	
	//metodos especiais get set---------------------------------------
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		if(numConta>0) {
		this.numConta = numConta;
		}
	}
	public boolean getAtiva() {
		return ativa;
	}
	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	public double getSaldo() {
		return saldo;
	}
	
	//metodos--------------------------------------------------------
	public void sacar(double valor) {
		if(valor < 0) {
			return;
		}
		
		saldo -= valor;
	}
	
	public void depositar(double valor) {
		if(valor < 0) {
			return;
			
		}
		
		saldo += valor;
	}
	
	public void status() {
		System.out.println("Numero da conta: " + numConta);
		System.out.println("Esta Ativa? " + ativa);
		System.out.println("Saldo: " + saldo);
	}
	
	
	
	
}
