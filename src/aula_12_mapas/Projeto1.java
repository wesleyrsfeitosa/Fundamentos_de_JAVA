package aula_12_mapas;

import java.util.HashMap;
import java.util.Map;

public class Projeto1 {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		
		map.put("User", "Maria");
		map.put("phone", "11976334211");
		
		for(String key : map.keySet()) {
		System.out.println("Chave: " + key + ", Valor: " + map.get(key));	
		}
		
		System.out.println(map.get("User") + " : " + map.get("phone"));

	}

}
