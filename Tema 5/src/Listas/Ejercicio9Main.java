package Listas;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Ejercicio9Main {

	public static void main(String[] args) {

		ArrayList<Tienda> tiendas = new ArrayList<>();
		System.out.println("Las tiendas son: ");

		for (int i = 1; i <= 20; i++) {
			tiendas.add(new Tienda(i));
		}

		System.out.println(tiendas);
		ordenarTiendas(tiendas);
		System.out.println("----------------------------------------");
		System.out.println(tiendas);
		System.out.println("----------------------");

		for (int i = 0; i < tiendas.size(); i++) {
			tiendas.get(i).imprimirGanancias();
		}

		cerrarTiendas(tiendas);

		System.out.println("=====================================");
		for (int i = 0; i < tiendas.size(); i++) {
			tiendas.get(i).imprimirGanancias();
		}

	}

	public static void ordenarTiendas(ArrayList<Tienda> tiendas) {
		for (int i = 0; i < tiendas.size() - 1; i++) {
			int menosGanancias = i;

			for (int j = i; j < tiendas.size(); j++) {
				if (tiendas.get(j).calcularGanancias() < tiendas.get(menosGanancias).calcularGanancias()) {
					menosGanancias = j;
				}
			}

			Tienda aux = tiendas.get(i);
			tiendas.set(i, tiendas.get(menosGanancias));
			tiendas.set(menosGanancias, aux);

		}

	}

	public static void cerrarTiendas(ArrayList<Tienda> tiendas) {
		for (int i = 0; i < tiendas.size(); i++) {
			tiendas.remove(0);
		}
	}

}
