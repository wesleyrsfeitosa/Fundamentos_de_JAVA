package aula_12_conjuntos;

//import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;



public class Projeto {

	public static void main(String[] args) {
		
		//Set<String> set = new HashSet<>();
		
		Set<String> set = new LinkedHashSet<>();
		
		set.add("A7");
		set.add("B6");
		set.add("C5");
		set.add("D4");
		set.add("E5");
		set.add("F6");
		set.add("G1");
		
		
		for(String s : set) {
			System.out.println(s);
		}
		
		
	}

}
