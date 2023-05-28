package aula_10_Enums_Wrappers;

public class Projeto {
	
	private enum Sexo{
		MASCULINO, FEMININO
	}

	public static void main(String[] args) {
		
		DiaDaSemana  hoje = DiaDaSemana.SEXTA;
		System.out.println(hoje);
		
		int num = DiaDaSemana.QUARTA.getNum();
		
		System.out.println("Qual é o numero da semana para Quarta: " + num);
		
		
		String s = "TERCA";
		
		DiaDaSemana d = DiaDaSemana.valueOf(s);
		System.out.println("Qual é o numero da semana para terça: " + d.getNum());
		
		Sexo sexo = Projeto.Sexo.FEMININO;
		Sexo sexo1 = Sexo.MASCULINO;
		System.out.println("Sexo: " + sexo);
		System.out.println("Sexo: " + sexo1);
	}

}
