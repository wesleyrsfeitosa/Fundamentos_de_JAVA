package aula_04_Classes_Objetos;

public class Retangulo {
	
	private double largura;
	private double altura;
	
	
	//construtores-------------------------------------------------------------
	public Retangulo() {
		this(10,20);
		//largura = 10;
		//altura = 15;
				
	}
	
	
	
	public Retangulo(double largura, double altura) {
	this.largura = largura;
	this.altura  = altura;
	}
	
	
	
	//metodos---------------------------------------------------------------------
	public double calcularArea() {
		return largura * altura;
	}
	
	
	

}
