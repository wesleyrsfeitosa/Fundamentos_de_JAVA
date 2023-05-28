package aula_04_Classes_Objetos;

public class Quadrado {
	//atributo------------------------------------------------------------------
	private double lado;
//metodo--------------------------------------------------------------------------
	public double calcularArea() {
		return lado * lado;
	}
//metodo especial set------------------------------------------------------------------
	public void setLado(double lado) {
		this.lado = lado;
	}
//construtor------------------------------------------------------------------
	//public Quadrado(double lado) {
	//	this.lado = lado;
	//}
	
	

}
