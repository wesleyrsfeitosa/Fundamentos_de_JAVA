package aula_08_checked_exceptions;

public class Projeto1 {

	public static void main(String[] args) {
	
		Object o1 = new Object();
		Object o2 = new Object();
		
		boolean iguais = Comparador1.comparar(o1,o2);
		System.out.println(iguais);
		
	}

}
