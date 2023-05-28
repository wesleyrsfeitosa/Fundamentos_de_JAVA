package aula_14threads_problemas;


public class Projeto {

	public static void main(String[] args) throws Exception{
		
		MyThreads[] threads = new MyThreads [1000];

		Contador contador = new Contador();
		
		for(int i = 0; i < threads.length; i++) {
			threads[i] = new MyThreads(contador);
		}
		for(int i = 0; i < threads.length; i++) {
			threads[i].start();
		}	
		for(int i = 0; i < threads.length; i++) {
			threads[i].join();
		}
		
		System.out.println("Valor = " + contador.getValor());
	}

}
