package aula_07_classes_abstratas_interfaces;

public interface Automovel3 {

	void acelerar1();
	void frear1();
	
	default void derrapar() {
		acelerar1();
		acelerar1();
		frear1();
		
	}
	
	static int getVelocidadeMaxima() {
		return 300;
	}
}
