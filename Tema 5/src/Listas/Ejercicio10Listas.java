package Listas;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio10Listas {

	public static void main(String[] args) {
		List<String> equipos = new ArrayList<String>();

		equipos.add("Barça");
		equipos.add("Athletic Club");
		equipos.add("Átletico de Madrid");
		equipos.add("Villareal");
		equipos.add("Deportivo Alaves");
		equipos.add("Getafe");
		equipos.add("Real Betis");
		equipos.add("Sevilla");
		equipos.add("Real Sociedad");
		equipos.add("Celta de Vigo");
		equipos.add("Espanyol");
		equipos.add("Osasuna");
		equipos.add("Girona");
		equipos.add("Rayo Vayecano");
		equipos.add("Valencia");
		equipos.add("Levante");
		equipos.add("Elche");
		equipos.add("Real Oviedo");
		equipos.add("Mallorca");

		imprimirEnfrentamientos("Real Madrid", equipos);

	}

	public static void imprimirEnfrentamientos(String miEquipo, List<String> equipos) {
		int puntos = 0;
		System.out.println("PARTIDOS DE IDA: ");
		for (int i = 0; i < equipos.size(); i++) {
			int random = (int) (Math.random() * 3);
			
			if (i % 2 == 0) {
				System.out.println(equipos.get(i) + " vs " + miEquipo + ": " + random);
				if(random==2) {
					puntos = puntos + 3;
					
				} else if (random==0) {
					puntos = puntos + 1;
				}
			} else {
				System.out.println(miEquipo + " vs " + equipos.get(i) + ": " + random);
				if(random==1) {
					puntos = puntos + 3;
					
				} else if (random==0) {
					puntos = puntos + 1;
				}
			}
			

		}
		System.out.println();
		System.out.println("PARTIDOS DE VUELTA: ");
		for (int i = 0; i < equipos.size(); i++) {
			int random = (int) (Math.random() * 3);
			
			
			if (i % 2 == 0) {
				System.out.println(miEquipo + " vs " + equipos.get(i) + ": " + random);
				if(random==1) {
					puntos = puntos + 3;
					
				} else if (random==0) {
					puntos = puntos + 1;
				}
			} else {
				System.out.println(equipos.get(i) + " vs " + miEquipo + ": " + random);
				if(random==2) {
					puntos = puntos + 3;
					
				} else if (random==0) {
					puntos = puntos + 1;
				}
			}

		}
		

		System.out.println("Los puntos de tu equipo son: " + puntos);
	}

}
