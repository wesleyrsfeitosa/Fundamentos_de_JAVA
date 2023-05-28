package aula_13_arquivo_escrita;

import java.io.IOException;
import java.io.PrintWriter;

public class Projeto {

	public static void main(String[] args) throws IOException{

		String s = "Texto para ser gravado no arquivo";
		
//		try (OutputStream os = new FileOutputStream("saida.txt")){
//			
//			
//			
//			byte[] buffer = s.getBytes();
//			
//			os.write(buffer);
//			
//		}
		try (PrintWriter pw = new PrintWriter("saida.txt")){
			pw.println(s);
		}
		
		
		
	}

}
