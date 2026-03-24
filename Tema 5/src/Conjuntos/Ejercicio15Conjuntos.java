package Conjuntos;

import java.util.Set;
import java.util.TreeSet;

public class Ejercicio15Conjuntos {
	public static void main(String[] args) {
		Set<Integer> A = new TreeSet<Integer>(generarSet(16));
		System.out.println("En conjunto A es: " + A);
		Set<Integer> B = new TreeSet<Integer>(generarSet(11));
		System.out.println("En conjunto B es: " + B);
		Set<Integer> C = new TreeSet<Integer>(generarSet(6));
		System.out.println("En conjunto C es: " + C);
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Union de A-B: " + union(A, B));
		System.out.println("Union de A-C: " + union(A, C));
		System.out.println("Union de B-C: " + union(B, C));
		System.out.println("Union de A-B-C: " + union(union(A, B), C));
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Interseccion de A-B: " + interseccion(A, B));
		System.out.println("Interseccion de A-C: " + interseccion(A, C));
		System.out.println("Interseccion de B-C: " + interseccion(B, C));
		System.out.println("Union de A-B-C: " + interseccion(interseccion(A, B), C));
		System.out.println("----------------------------------------------------------------------");
		System.out.println("¿Es A conjunto de B ? " + subconjunto(A, B));
		System.out.println("¿Es B conjunto de A ? " + subconjunto(B, A));
		System.out.println("¿Es A conjunto de C ? " + subconjunto(A, C));
		System.out.println("¿Es B conjunto de C ? " + subconjunto(B, C));
		System.out.println("¿Es C conjunto de A ? " + subconjunto(C, A));
		System.out.println("¿Es C conjunto de B ? " + subconjunto(C, B));

	}

	public static Set<Integer> generarSet(int tamanno) {
		Set<Integer> lista = new TreeSet<Integer>();
		for (int i = 0; i < tamanno; i++) {
			int random = (int) (Math.random() * 20 + 1);
			lista.add(random);
		}
		return lista;
	}

	public static Set<Integer> union(Set<Integer> conjunto, Set<Integer> conjunto2) {
		Set<Integer> union = new TreeSet<Integer>();
		union.addAll(conjunto);
		union.addAll(conjunto2);
		return union;
	}

	public static Set<Integer> interseccion(Set<Integer> conjunto, Set<Integer> conjunto2) {
		Set<Integer> interseccion = new TreeSet<Integer>(conjunto);
		interseccion.retainAll(conjunto2);
		return interseccion;

	}

	public static boolean subconjunto(Set<Integer> conjunto, Set<Integer> conjunto2) {
		if (!conjunto.containsAll(conjunto2)) {
			return false;
		} else {
			return true;
		}
	}

}
