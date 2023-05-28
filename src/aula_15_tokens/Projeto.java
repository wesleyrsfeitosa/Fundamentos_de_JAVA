package aula_15_tokens;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Projeto {

	public static void main(String[] args) throws Exception {

		Scanner s = new Scanner(new File("C:\\eclipse-workspace\\Softbrue\\src\\aula_15_tokens\\dados.txt"));

		while(s.hasNextLine()) {
			String line = s.nextLine();
			
		String [] tokens = line.split("\t");
		
		for(int i = 0; i < tokens.length; i++) {
			tokens[i] = tokens[i].replace("'", "");
		
		}
		
		System.out.println(Arrays.toString(tokens));
		
	}
		
	}

}
