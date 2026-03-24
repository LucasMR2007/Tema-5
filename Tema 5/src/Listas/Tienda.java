package Listas;

import java.util.ArrayList;

public class Tienda {

	private int id;

	private ArrayList<Producto> productos = new ArrayList<>();

	public Tienda(int id) {
		super();
		this.id = id;

		int ventaAleatorio = (int) (Math.random() * (76) + 25);
		productos.add(new Producto("Camisetas", 20, ventaAleatorio));
		ventaAleatorio = (int) (Math.random() * (76) + 25);
		productos.add(new Producto("Camisas", 25, ventaAleatorio));
		ventaAleatorio = (int) (Math.random() * (76) + 25);
		productos.add(new Producto("Gorros", 10, ventaAleatorio));
		ventaAleatorio = (int) (Math.random() * (76) + 25);
		productos.add(new Producto("Bufandas", 10, ventaAleatorio));
		ventaAleatorio = (int) (Math.random() * (76) + 25);
		productos.add(new Producto("Pantalones", 30, ventaAleatorio));
		ventaAleatorio = (int) (Math.random() * (76) + 25);
		productos.add(new Producto("Zapatillas", 75, ventaAleatorio));
		ventaAleatorio = (int) (Math.random() * (76) + 25);
		productos.add(new Producto("Guantes", 8, ventaAleatorio));
		ventaAleatorio = (int) (Math.random() * (76) + 25);
		productos.add(new Producto("Cinturones", 12, ventaAleatorio));
		ventaAleatorio = (int) (Math.random() * (76) + 25);
		productos.add(new Producto("Chaquetones", 100, ventaAleatorio));
		ventaAleatorio = (int) (Math.random() * (76) + 25);
		productos.add(new Producto("Calcetines", 5, ventaAleatorio));
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float calcularGanancias() {
		float total = 0;
		for (int i = 0; i < productos.size(); i++) {
			total += (float) (productos.get(i).getPrecio() * productos.get(i).getVentas());
		}
		return total;
	}

	public void imprimirGanancias() {
		System.out.println("La tienda " + id + " ha ganado: " + calcularGanancias());
	}
	

	@Override
	public String toString() {
		return "\n" + "Ventas de la tienda " + id + ":\n\t" + "Productos: " + productos + "\n\t\t" + "ganancias: "
				+ calcularGanancias();
	}

}
