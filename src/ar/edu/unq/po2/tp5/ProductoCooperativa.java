package ar.edu.unq.po2.tp5;

public class ProductoCooperativa extends Producto {
	protected double descuento;
	
	public ProductoCooperativa(double precio, int stock, double descuento) {
		super(precio, stock);
		this.descuento = descuento;
	}
	public double getDescuento() {
		return descuento / 100; // atencion. se pasa un numero que se divide por 100 para obtener el porcentual
	}
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public ProductoCooperativa() {
	}



	public double notificarPrecio() {
		double descuento = getPrecio() *  getDescuento();
		double precioConDescuentoAplicado = getPrecio() - descuento;
		return precioConDescuentoAplicado;
	}

}
