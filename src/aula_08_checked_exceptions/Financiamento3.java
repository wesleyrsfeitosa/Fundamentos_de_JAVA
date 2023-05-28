package aula_08_checked_exceptions;

public class Financiamento3 {
	
	public double valorTotal;
	public double entrada;
	public int parcelas;
	
	public Financiamento3(double valorTotal, double entrada, int parcelas) {
	
		if (entrada < valorTotal * 0.2) {
			throw new RuntimeException("A entrada deve ser pelo menos 20% do valor total");
		} else if (parcelas < 6) {
			throw new RuntimeException("O numero minimo de parcelas deve ser 6");
		} 
		
		this.valorTotal = valorTotal;
		this.entrada = entrada;
		this.parcelas = parcelas;
	}
	
public double prestacao() {
	return(valorTotal - entrada) / parcelas;
}
	
}
