package ar.edu.unq.po2.tp5;

public class Producto {

	protected double precio;
	protected int stock;

	public Producto() {

	}

	public Producto(double precio, int stock) {
		this.precio = precio;
		this.stock = stock;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public void reducirStock() { // este metodo permite reducirStock sin que sea algo necesario.
		if (stock != 0) {
			stock = getStock() - 1;
		}

	}

	public double notificarPrecio() {
		return getPrecio();
	}
}