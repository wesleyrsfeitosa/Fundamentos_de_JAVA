package aula_04_Classes_Objetos;

public class Matematica {

	int somar(int x, int y) {
		System.out.println("somar(int x, int y) ");
		System.out.println(" x + y ");
		System.out.println(x + " + " + y);
		return x + y;
	}
	
	int somar(int x, int y, int z) {
		System.out.println("somar(int x, int y, int z)");
		System.out.println(" x + y + z ");
		System.out.println(x + " + " + y + " + " + z);
		return x + y + z;
	}
	
	double somar( double x, double y) {
		System.out.println("somar(double x, double y) ");
		System.out.println(" x + y ");
		System.out.println(x + " + " + y);
		return x + y;
		
	}

}
