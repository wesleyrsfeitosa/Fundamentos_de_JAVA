package aula_04_Classes_Objetos;

public class Contador {
	
	private static int valor;
	
	static {
		valor = 1;
	}

	//construtor------------------------------------------------
	//public Contador() {
	//	valor = 1;
	//}
	
	public static void incrementar() {
		valor++;
	}
	
	
	//metodo get---------------------------------------------------
	public static int getValor() {
		return valor;
	}
	

}
