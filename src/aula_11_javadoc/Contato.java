package aula_11_javadoc;
/**
 * Classe que representa um contato
 * @author Wesley
 */


public class Contato {

	/** Nome do Contato
	 * 
	 */
	private String nome;
	/**Email do COntato
	 * 
	 */
	private String email;
	/**
	 * Endereço do Contato
	 * 
	 */
	private Endereco endereco = new Endereco();

	/**
	 * Construtor
	 * @param nome Nome do contato
	 * @param email Email do contato
	 */
	public Contato(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}

	/**
	 * Defini o endereço do contato
	 * @param rua Rua do contato
	 * @param numero Numero do contato
	 */
	public void definirEndereco(String rua, int numero) {
		endereco.setRua(rua);
		endereco.setNumero(numero);
	}

	/**
	 * Retorna o nome
	 * @return Nome do Contato
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Retorna o email
	 * @return Nome do Contato
	 */
	public String getEmail() {
		return email;
	}

}
