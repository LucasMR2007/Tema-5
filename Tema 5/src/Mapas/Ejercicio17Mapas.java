package Mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio17Mapas {

	public static void main(String[] args) {
		Map<String, String> coches = new HashMap<String, String>();
		Scanner teclado = new Scanner(System.in);
		char opcion = 0;
		String matricula;
		String marca;

		do {
			System.out.println("a. Comprobar coche existente");
			System.out.println("b. Añadir coche");
			System.out.println("c. Eliminar coche");
			System.out.println("d. Modificar coche");
			System.out.println("e. Mostrar coches ordenados por matricula");
			System.out.println("f. Salir");
			opcion = teclado.nextLine().charAt(0);

			switch (opcion) {
			case 'a':
				System.out.println("Introduce la matricula del coche: ");
				matricula = teclado.nextLine();
				coches.get(matricula);

				break;
			case 'b':
				System.out.println("Introduce la matrícula: ");
				matricula = teclado.nextLine();
				if (coches.containsKey(matricula) == true) {
					System.out.println("La matrícula introducida ya existe");

				} else {
					if (comprobarMatricula(matricula) == false) {
						System.out.println("Matrícula no válida");
					} else {
						System.out.println("Introduce la marca: ");
						marca = teclado.nextLine();
						coches.put(matricula, marca);
					}
				}
				break;

			case 'c':
				System.out.println("Indica el coche por la matricula: ");
				matricula = teclado.nextLine();
				if (coches.containsKey(matricula) == false) {
					System.out.println("El coche no existe");
				} else {
					coches.remove(matricula);
				}
				break;
			case 'd':
				System.out.println("Añade la matricula del coche: ");
				matricula = teclado.nextLine();
				if (coches.containsKey(matricula) == false) {
					System.out.println("El coche no existe");
				} else {
					System.out.println("Nueva marca del vehiculo: ");
					marca = teclado.nextLine();
					if (coches.containsValue(marca) == true) {
						System.out.println("La marca es similar a la antigua");
					} else {
						coches.put(matricula, marca);
					}
				}
				break;
			case 'e':
				Map<String, String> cochesOrdenados = new TreeMap<String, String>(coches);
				System.out.println(cochesOrdenados);
				break;
			case 'f':
				System.out.println("Hasta pronto!!");
				break;

			default:
				break;
			}
		} while (opcion != 'f');
		teclado.close();
	}

	public static boolean comprobarMatricula(String matricula) {

		if (matricula.length() >= 5 && matricula.length() <= 7) {

			for (int i = 0; i < 4; i++) {
				if (Character.isDigit(matricula.charAt(i))) {
					return true;
				} else {
					return false;
				}
			}
			for (int i = 4; i < 7; i++) {
				if (Character.isLetter(matricula.charAt(i))) {
					return true;
				} else {
					return false;
				}
			}
		}

		return false;
	}

}
