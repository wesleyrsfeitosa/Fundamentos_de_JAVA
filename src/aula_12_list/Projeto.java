package aula_12_list;

import java.util.ArrayList;
import java.util.List;

public class Projeto {

	public static void main(String[] args) {
		
		List <String> l = new ArrayList<>();
		
		l.add("Wesley");
		l.add("Sofia");
		l.add(0, "Primeiro");
		//l.set(0, "Primeiro");
		
		String e = l.get(0);
		System.out.println(e);
		
		for(String s : l) {
			System.out.println(s);
			
			for ( int i =0; i< l.size(); i++) {
				System.out.println(l.get(i));
			}
		}
	}

}
