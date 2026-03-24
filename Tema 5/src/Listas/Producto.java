package Listas;

public class Producto {

	private String nombre;
	private double precio;
	private int ventas;

	public Producto(String nombre, int precio, int ventas) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.ventas = ventas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getVentas() {
		return ventas;
	}

	public void setVentas(int ventas) {
		this.ventas = ventas;
	}

	@Override
	public String toString() {
		return "\n\t\t" + "Nombre: " + nombre + "\n\t\t" + "Precio: " + precio + "\n\t\t" + "Ventas: " + ventas + "\n";
	}

}
