package aula_06_heranca_polimorfismo;

public class Veiculo {
	
	private String marca;
	private String modelo;
	private int ano;
	
	
	//metodos---------------------------------------------------------------
	public void buzinar() {
		System.out.println(" BI BI");
	}
	
		public void imprimirDados() {
			System.out.println("Marca: " + this.marca);
			System.out.println("Modelo: " + this.modelo);
			System.out.println("Ano: " + this.ano);
		}

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public int getAno() {
			return ano;
		}

		public void setAno(int ano) {
			this.ano = ano;
		}
		
		
		

	}


