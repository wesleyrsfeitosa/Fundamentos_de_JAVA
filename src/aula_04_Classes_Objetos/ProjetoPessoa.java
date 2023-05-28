package aula_04_Classes_Objetos;

public class ProjetoPessoa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		
		p1.nome = "Wesley";
		p2.nome = "Maria";
		
		p1.receber(5);
		p1.receber(10);
		
		p1.dar(6, p2);
		
		System.out.println(p1.nome +" => " + p1.numfigurinhas );
		System.out.println(p2.nome +" => " + p2.numfigurinhas );
		
		
		
	}

}
