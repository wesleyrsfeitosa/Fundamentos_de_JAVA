package aula_14threads_problemas;

public class MyThreads extends Thread {

	private Contador contador;

	public MyThreads(Contador c) {
		contador = c;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			contador.incrementar();
		}
	}

}
