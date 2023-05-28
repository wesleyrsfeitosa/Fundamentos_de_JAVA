package aula_06_heranca_polimorfismo;

public class ProjetoVeiculo {

	public static void main(String[] args) {
		//-------------------------------------------------
		

		System.out.println("-----------CARRO-------------");
		Carro v = new Carro();
		
		v.setMarca("Fiat");
		v.setModelo("Uno");
		v.setAno(2015);
		v.setQuatroPortas(true);
		v.imprimirDados();
		v.buzinar();
		//-------------------------------------------------------
		System.out.println("-----------MOTOCICLETA-------------");
		Motocicleta m = new Motocicleta();
		
		m.setMarca("Yamaha");
		m.setModelo("Tenere");
		m.setAno(2014);
		m.imprimirDados();
		m.buzinar();
		m.empinar();
		
		System.out.println("-----------CAMINHAO-------------");
		
		Caminhao c = new Caminhao();
		
		c.setMarca("Volvo");
		c.setModelo("Truck");
		c.setAno(2020);
		c.imprimirDados();
		c.buzinar();
		
		
	}

}
