package Colecciones;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcion = 0;
		Integer num = 0;
		Integer num2 = 0;
		float flo = 0;
		float flo2 = 0;
		char cha;
		char cha2;

		do {
			System.out.println("----MENU----");
			System.out.println("0) Salir");
			System.out.println("1) Sumar Entero");
			System.out.println("2) Sumar Float");
			System.out.println("3) Sumar Character");
			System.out.println("4) Restar Entero");
			System.out.println("5) Restar Float");
			System.out.println("6) Restar Character");
			System.out.println("7) Multiplicar Entero");
			System.out.println("8) Multiplicar Float");
			System.out.println("9) Multiplicar Character");
			System.out.println("10) Dividir Entero");
			System.out.println("11) Dividir Float");
			System.out.println("12) Dividir Character");

			opcion = teclado.nextInt();
			switch (opcion) {
			case 0:
				System.out.println("Hasta otra");
				break;
			case 1:
				System.out.println("Dime 2 números enteros");
				num = teclado.nextInt();
				num2 = teclado.nextInt();
				System.out.println(suma(num, num2));
				break;
			case 2:
				System.out.println("Dime 2 números en float");
				flo = teclado.nextFloat();
				flo2 = teclado.nextFloat();
				System.out.println(suma(flo, flo2));
				break;
			case 3:
				System.out.println("Dime 2 character");
				cha = teclado.next().charAt(0);
				cha2 = teclado.next().charAt(0);
				System.out.println(suma(cha, cha2));
				break;
			case 4:
				System.out.println("Dime 2 números enteros");
				num = teclado.nextInt();
				num2 = teclado.nextInt();
				System.out.println(resta(num, num2));
				break;
			case 5:
				System.out.println("Dime 2 números en float");
				flo = teclado.nextFloat();
				flo2 = teclado.nextFloat();
				System.out.println(resta(flo, flo2));
				break;
			case 6:
				System.out.println("Dime 2 character");
				cha = teclado.next().charAt(0);
				cha2 = teclado.next().charAt(0);
				System.out.println(resta(cha, cha2));
				break;
			case 7:
				System.out.println("Dime 2 números enteros");
				num = teclado.nextInt();
				num2 = teclado.nextInt();
				System.out.println(multiplicacion(num, num2));
				break;
			case 8:
				System.out.println("Dime 2 números en float");
				flo = teclado.nextFloat();
				flo2 = teclado.nextFloat();
				System.out.println(multiplicacion(flo, flo2));
				break;
			case 9:
				System.out.println("Dime 2 character");
				cha = teclado.next().charAt(0);
				cha2 = teclado.next().charAt(0);
				System.out.println(multiplicacion(cha, cha2));
				break;
			case 10:
				System.out.println("Dime 2 números enteros");
				num = teclado.nextInt();
				num2 = teclado.nextInt();
				System.out.println(division(num, num2));
				break;
			case 11:
				System.out.println("Dime 2 números en float");
				flo = teclado.nextFloat();
				flo2 = teclado.nextFloat();
				System.out.println(division(flo, flo2));
				break;
			case 12:
				System.out.println("Dime 2 character");
				cha = teclado.next().charAt(0);
				cha2 = teclado.next().charAt(0);
				System.out.println(division(cha, cha2));
				break;
			default:
			
				break;
			}
		} while (opcion != 0);
		teclado.close();
	}

	public static <T> T suma(T a, T b) {
		T suma = null;
		if (a instanceof Integer) {
			Integer sumaEnteros = (Integer) a + (Integer) b;
			suma = (T) sumaEnteros;
		}
		if (a instanceof Float) {
			Float sumaEnteros = (float) a + (float) b;
			suma = (T) sumaEnteros;
		}
		if (a instanceof Character) {
			Character sumaEnteros = (char) ((Character) a + (Character) b);
			suma = (T) sumaEnteros;
		}
		return suma;
	}

	public static <T> T resta(T a, T b) {
		T resta = null;

		if (a instanceof Integer) {
			Integer restaEnteros = (Integer) a - (Integer) b;
			resta = (T) restaEnteros;
		} else if (a instanceof Float) {
			Float restaEnteros = (float) a - (float) b;
			resta = (T) restaEnteros;
		} else if (a instanceof Character) {
			Character restaEnteros = (char) ((Character) a - (Character) b);
			resta = (T) restaEnteros;
		}
		return resta;
	}

	public static <T> T multiplicacion(T a, T b) {
		T multiplicacion = null;
		if (a instanceof Integer) {
			Integer multiplicacionEnteros = (Integer) a * (Integer) b;
			multiplicacion = (T) multiplicacionEnteros;
		} else if (a instanceof Float) {
			Float multiplicacionEnteros = (float) a * (float) b;
			multiplicacion = (T) multiplicacionEnteros;
		} else if (a instanceof Character) {
			Character multiplicacionEnteros = (char) ((Character) a * (Character) b);
			multiplicacion = (T) multiplicacionEnteros;
		}
		return multiplicacion;
	}

	public static <T> T division(T a, T b) {
		T division = null;
		if (a instanceof Integer) {
			Integer divEnteros = (Integer) a / (Integer) b;
			division = (T) divEnteros;
		} else if (a instanceof Float) {
			Float divEnteros = (float) a / (float) b;
			division = (T) divEnteros;
		} else if (a instanceof Character) {
			Character divEnteros = (char) ((Character) a / (Character) b);
			division = (T) divEnteros;
		}
		return division;
	}

}
