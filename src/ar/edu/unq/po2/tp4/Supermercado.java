package ar.edu.unq.po2.tp4;

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

	public double getPrecioTotal( ) {
		
		for 
	}
	
	
	
	
	
	
	
	
	
	
}
