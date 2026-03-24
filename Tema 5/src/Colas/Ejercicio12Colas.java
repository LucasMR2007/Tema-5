package Colas;

import java.util.ArrayDeque;
import java.util.Deque;


public class Ejercicio12Colas {

	public static void main(String[] args) {
		Deque<Integer> cola = new ArrayDeque<Integer>();
		cola.add(2);
		cola.add(6);
		cola.add(3);
		cola.add(23);
		cola.add(18);
		cola.add(30);
		cola.add(30);
		cola.add(30);

		System.out.println("Cola original" + cola);
		System.out.println("Cola invertida: " + invertirCola(cola));
		System.out.println("Cola sin numero 2: " + eliminarValor(cola, 2));
		System.out.println("Cola sin repetidos: " + eliminarRepetidos(cola));

	}

	public static Deque<Integer> invertirCola(Deque<Integer> cola) {
		Deque<Integer> colaCopia = new ArrayDeque<Integer>(cola);
		Deque<Integer> colaInvertida = new ArrayDeque<Integer>();

		while (!colaCopia.isEmpty()) {
			int elemento = colaCopia.removeLast();
			colaInvertida.add(elemento);
		}
		return colaInvertida;
	}

	public static Deque<Integer> eliminarValor(Deque<Integer> cola, Integer elemento2) {
		Deque<Integer> colaCopia = new ArrayDeque<Integer>(cola);
		Deque<Integer> eliminarElemento = new ArrayDeque<Integer>();

		while (!colaCopia.isEmpty()) {
			int elemento = colaCopia.remove();

			if (elemento2 != elemento) {
				eliminarElemento.add(elemento);
			}
		}

		return eliminarElemento;
	}

	public static Deque<Integer> eliminarRepetidos(Deque<Integer> cola) {
		Deque<Integer> colaCopia = new ArrayDeque<Integer>(cola);
		Deque<Integer> eliminarElemento = new ArrayDeque<Integer>();
		while (!colaCopia.isEmpty()) {
			int elemento = colaCopia.remove();

			if (eliminarElemento.contains(elemento)) {
				
			} else {
				eliminarElemento.add(elemento);
			}
		}

		return eliminarElemento;
	}

}
