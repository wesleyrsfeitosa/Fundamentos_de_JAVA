package aula_03_conceitos_iniciais;

public class Estrututa_Controle_While {

	public static void main(String[] args) {
	
		int x = 0;
		
		while (x < 10) {
			x++;
			
			if(x==5) {
				continue;
			}
			System.out.println(x);
			
			
		}

	}

}
