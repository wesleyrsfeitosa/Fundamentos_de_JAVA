package aula_06_heranca_polimorfismo;

public class Bebida {
	
	private String nome;
	private boolean aquecer;
	
	//construtor-----------------------------------------------------
	public Bebida(String nome, boolean aquecer) {
		super();
		this.nome = nome;
		this.aquecer = aquecer;
	}
	
	//metodos----------------------------------------------------------
	
	public String getNome() {
		return nome;
	}
	
	public boolean getAquecer() {
		return aquecer;
	}
	public void preparar() {
		
	}
	

}
