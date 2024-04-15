package ar.edu.unq.po2.tp5;

public class Producto {

	protected double precio;
	protected boolean esDeCooperativa;

	public Producto() {

	}

	public Producto(double precio, boolean esDeCooperativa) {
		super();
		setPrecio(precio);
		this.esDeCooperativa = esDeCooperativa;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		if (precio > 0) {
			this.precio = precio;
		} else {
			throw new IllegalArgumentException("El precio del producto debe ser mayor que 0.");
		}
	}

	public boolean isEsDeCooperativa() {
		return esDeCooperativa;
	}

	public void setEsDeCooperativa(boolean esDeCooperativa) {
		this.esDeCooperativa = esDeCooperativa;
	}

	public double notificarPrecio() {
		return getPrecio();
	}

	public boolean indicarSiEsDeCooperativa() {
		return isEsDeCooperativa();
	}
}