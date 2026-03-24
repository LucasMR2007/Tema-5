package Conjuntos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EjercicioxConjuntos {

	public static void main(String[] args) {
		Set<String> conjunto = new HashSet<String>();
		//Si quieres que se ordene alfabeticamente pones TreeSet en vez de HashSet
		
		conjunto.add("Lucas");
		conjunto.add("Nele");
		conjunto.add("Iker");
		conjunto.add("Rubio");
		
		List<String> lista = new ArrayList<String>(conjunto);
		System.out.println(lista);
	
		System.out.println(conjunto);
		
		conjunto.remove("Rubio");
		System.out.println(conjunto);
		System.out.println(conjunto.contains("Nele"));
		
		for(String nombre : conjunto) {
			System.out.println(nombre.toUpperCase());
		}

	}

}
