package ar.edu.unq.po2.tp5;

import java.util.List;

public class Caja {
	private int numeroDeCaja;
	private List<Producto> productos;

	public Caja() {

	}

	// Constructor que inicializa el número de caja con un valor válido
	public Caja(int numeroDeCaja, List<Producto> productos) {
		setNumeroDeCaja(numeroDeCaja); // Utiliza el setter para asignar el valor
		this.productos = productos;
	}

	// Getter para obtener el número de caja
	public int getNumeroDeCaja() {
		return numeroDeCaja;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	// Setter que asegura que el número de caja sea siempre mayor que 0
	public void setNumeroDeCaja(int numeroDeCaja) {
		if (numeroDeCaja > 0) {
			this.numeroDeCaja = numeroDeCaja;
		} else {
			throw new IllegalArgumentException("El número de caja debe ser mayor que 0.");
		}
	}

	public void registrarProductos(List<Producto> productos) {
		indicarMontoAPagarPorProductos(productos);
		disminuirStockDeLosProductos(productos);
	}

	public void disminuirStockDeLosProductos(List<Producto> productos) {
		for (Producto producto : productos) {
			producto.reducirStock();
		}
	}

	public double indicarMontoAPagarPorProductos(List<Producto> productos) {
		double montoPorProductos = 0.0;
		for (Producto producto : productos) {
			montoPorProductos = montoPorProductos + producto.notificarPrecio();
		}
		return montoPorProductos;
	}
}
