package aula_11_javadoc;

public class Projeto {

	public static void main(String[] args) {

		Contato c = new Contato("jose", "wesley@.com");
		c.definirEndereco(null, 0);
		
		System.out.println(c.getNome());
		
	}

}
