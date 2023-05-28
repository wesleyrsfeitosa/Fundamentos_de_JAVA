package aula_13_arquivo_escrita;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Projeto1 {

	public static void main(String[] args) throws IOException{
		
		String imputFile = "C:\\eclipse-workspace\\Softbrue\\src\\aula_13_arquivo_escrita\\entrada.txt";
		String outputFile = "C:\\eclipse-workspace\\Softbrue\\src\\aula_13_arquivo_escrita\\saida.txt";
		
		try ( InputStream in = new FileInputStream(imputFile);
		OutputStream out = new FileOutputStream(outputFile)){

			byte [] buffer = new byte[1024];
			
			int bytesLidos;
			while ((bytesLidos = in.read(buffer)) > -1 ) {
				out.write(buffer, 0, bytesLidos);
			}
			
		}
		
	}

}
