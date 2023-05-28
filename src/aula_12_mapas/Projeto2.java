package aula_12_mapas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Projeto2 {

	
		public static void main(String[] args) throws ParseException {

			Scanner sc = new Scanner(System.in);

			Map<String, Integer> votos = new HashMap<>();

			System.out.print("Digite o Caminho do Arquivo");
			String path = sc.nextLine();

			try (BufferedReader br = new BufferedReader(new FileReader(path))) {

				String line = br.readLine();
				while (line != null) {
					
			
					System.out.println(line);
					
					String[] fields = line.split(",");
					String name = fields[0];
					int count = Integer.parseInt(fields[1]);
					
					

					if (votos.containsKey(name)) {
						int votosSoFar = votos.get(name);
						votos.put(name, count + votosSoFar);
					}
					else {
						votos.put(name, count);
					}
					
					line = br.readLine();
				}
				System.out.println("");
				for (String key : votos.keySet()) {
					System.out.println(key + ": " + votos.get(key));
				}
				
			} catch (IOException e) {
				System.out.println("Error: " + e.getMessage());
			}

			sc.close();
		}
	}