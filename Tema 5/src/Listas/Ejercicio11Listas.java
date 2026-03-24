package Listas;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio11Listas {

	public static void main(String[] args) {
		List<String>nombres= new ArrayList<String>();
		nombres.add("Lucas");
		nombres.add("Nele");
		nombres.add("Adrian");
		nombres.add("Iker");
		nombres.add("Rubio");
		nombres.add("Christopher");
		nombres.add("Xiomara");
		nombres.add("Ivan");
		nombres.add("Truco");
		nombres.add("Roberto");
		nombres.add("Laura");
		nombres.add("Álvaro");
		nombres.add("Jesus");
		nombres.add("Yoel");
		nombres.add("Cesar");
		
		while (nombres.size() > 1) {
			int random = (int) (Math.random() * nombres.size());
			String eliminado = nombres.remove(random);
			System.out.println(eliminado + " ha sido eliminad@");
			
			
		}
		System.out.println(nombres + " ha ganado");

	} 
	

}
