package aula_06_heranca_polimorfismo;

public class ProjetoBebida {

	public static void main(String[] args) {
		
		PreparadorBebida preparador = new PreparadorBebida();
		
		LeiteQuente leite = new LeiteQuente();
		preparador.prepararBebida(leite);
System.out.println("");
		Refrigerante refrigerante = new Refrigerante();
		preparador.prepararBebida(refrigerante);
	}

}
