package Conjuntos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ejercicio14Conjuntos {

	public static void main(String[] args) {
		System.out.println(generarListaNumeros());
		Set<Integer> conjunto = new HashSet<Integer>(generarListaNumeros());
		System.out.println(conjunto);
		System.out.println(comprobarRango(conjunto));
	}

	public static List<Integer> generarListaNumeros() {
		List<Integer> lista = new ArrayList<Integer>();
		for (int i = 0; i < 101; i++) {
			int random = (int) (Math.random() * 25 + 1);
			lista.add(random);
		}
		return lista;
	}

	public static boolean comprobarRango(Set<Integer> conjunto) {
		for (int i = 1; i <= 25; i++) {
			if (!conjunto.contains(i)) {
				return false;

			}
		}
		return true;
	}

}
