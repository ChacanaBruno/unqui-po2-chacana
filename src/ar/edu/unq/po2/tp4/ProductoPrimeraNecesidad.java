package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto {
	protected double descuento;

	public ProductoPrimeraNecesidad() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductoPrimeraNecesidad(String nombre, double precio, Boolean esPrecioCuidado) {
		super(nombre, precio, esPrecioCuidado);
		// TODO Auto-generated constructor stub
	}

	public ProductoPrimeraNecesidad(double descuento) {
		super();
		this.descuento = descuento;
	}

	public ProductoPrimeraNecesidad(String nombre, double precio, Boolean esPrecioCuidado, double descuento) {
		super(nombre, precio, esPrecioCuidado);
		// TODO Auto-generated constructor stub
		this.descuento = descuento;
	}

	public double getDescuento() {
		return descuento / 100;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	
	public double getPrecio() {
		return precio - (precio * getDescuento()) ;
	}
	

}
