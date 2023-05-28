package aula_16_debug_multithred;

public class Contador {

	private int valor;
	
	public synchronized int incrementar() {
		return ++valor;
	}
	
}
