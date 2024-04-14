package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	private String nombreDeSuperercado;
	private String direccion;
	private List<Producto> productos;

	public Supermercado() {

	}

	public Supermercado(String nombreDeSuperercado, String direccion) {
		super();
		this.nombreDeSuperercado = nombreDeSuperercado;
		this.direccion = direccion;
	}

	public Supermercado(String nombreDeSuperercado, String direccion, List<Producto> productos) {
		super();
		this.nombreDeSuperercado = nombreDeSuperercado;
		this.direccion = direccion;
		this.productos = productos != null ? productos : new ArrayList<>(); // Inicializamos la lista de productos con
																			// la lista pasada como parámetro si no es
																			// null
	}

	public String getNombreDeSuperercado() {
		return nombreDeSuperercado;
	}

	public void setNombreDeSuperercado(String nombreDeSuperercado) {
		this.nombreDeSuperercado = nombreDeSuperercado;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public double getCantidadDeProductos() {

		if (productos != null) {
			return productos.size();
		} else {
			// Si la lista de productos es nula, retornamos 0
			return 0;
		}
	}

	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}

	public double getPrecioTotal() {
		double total = 0.0;
		for (Producto producto : productos) {
			total += producto.getPrecio();
		}
		return total;
	}

}