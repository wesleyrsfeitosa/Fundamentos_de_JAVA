package aula_03_conceitos_iniciais;

public class Estrutura_Controle_Switch_Expression {
	
	public enum DiaDaSemana{
		SEGUNDA, TERÇA, QUARTA, QUINTA,	SEXTA, SABADO, DOMINGO
		
	}

	public static void main(String[] args) {
		
		DiaDaSemana d = DiaDaSemana.SEGUNDA;
		
		/*switch (d) {
		
		case SEGUNDA : System.out.println(1); break; 
		case TERÇA : System.out.println(2);  break; 
		case QUARTA : System.out.println(3);  break; 
		case QUINTA : System.out.println(4);  break; 
		case SEXTA : System.out.println(5);  break; 
		case SABADO : System.out.println(6);  break; 
		case DOMINGO : System.out.println(7);  break; 
		}
		*/
		switch (d) {
		
		case SEGUNDA -> System.out.println(1); 
		case TERÇA -> System.out.println(2);  
		case QUARTA -> System.out.println(3); 
		case QUINTA -> System.out.println(4); 
		case SEXTA -> System.out.println(5);  
		case SABADO -> System.out.println(6);  
		case DOMINGO -> System.out.println(7);
		
		}
		
		int i = switch(d) {
		case SEGUNDA -> 1;
		case TERÇA -> 2;
		case QUARTA -> 3;
		case QUINTA -> 4;
		case SEXTA -> 5;
		case SABADO -> 6; 
		case DOMINGO -> 7;
		default -> 0;
		};
		System.out.println(i);
	}

}
