package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto {

	ProductoPrimeraNecesidad() {

	}

	public ProductoPrimeraNecesidad(String nombre, double precio) {
		super(nombre, precio);
		// TODO Auto-generated constructor stub
	}

	public ProductoPrimeraNecesidad(String nombre, double precio, Boolean esPrecioCuidado) {
		super(nombre, precio, esPrecioCuidado);
	}

	public double calcularPrecio() {


		return getPrecio() * 0.9;
	}

}
