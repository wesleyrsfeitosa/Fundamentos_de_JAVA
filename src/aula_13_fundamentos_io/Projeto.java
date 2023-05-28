package aula_13_fundamentos_io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Projeto {

	public static void main(String[] args) throws IOException {

		
//		try (InputStream is = new FileInputStream("C:\\eclipse-workspace\\Softbrue\\src\\aula_13_fundamentos_io\\entrada.txt")){
//
//			byte[] buffer = new byte[1024];
//
//			int bytesLidos = is.read(buffer);
//
//			String s = new String(buffer, 0, bytesLidos);
//			System.out.println(s);
//			System.out.println(s.length());
//		
//		}
//		try (InputStream is = new FileInputStream("C:\\eclipse-workspace\\Softbrue\\src\\aula_13_fundamentos_io\\entrada.txt")){
//
//			byte[] buffer = new byte[4];
//
//			String s = "";
//			int bytesLidos;
//			while((bytesLidos = is.read(buffer)) > - 1) {
//			s += new String(buffer, 0, bytesLidos);
//			}
//			
//			System.out.println(s);
//			System.out.println(s.length());
//		
//		}
		
		try (BufferedReader reader = new BufferedReader(new  FileReader("C:\\eclipse-workspace\\Softbrue\\src\\aula_13_fundamentos_io\\entrada.txt"))){
			
//			String s ="";
//			String line;
//			while((line = reader.readLine()) != null) {
//				s += line + "\n";
//			}
//			
//			System.out.println(s);
//			
			//String line = reader.readLine();
			//System.out.println(line);
			
			try(Scanner entrada = new Scanner(new File("C:\\eclipse-workspace\\Softbrue\\src\\aula_13_fundamentos_io\\entrada.txt"))){
				
				String s = "";
				while(entrada.hasNextLine()) {
					String line = entrada.nextLine();
					s += line + "\n";
				}
				System.out.println(s);
			}
			
		}

	}

}
