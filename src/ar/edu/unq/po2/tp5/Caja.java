package ar.edu.unq.po2.tp5;

import java.util.List;

public class Caja {
	private int numeroDeCaja;

	public Caja() {

	}

	// Constructor que inicializa el número de caja con un valor válido
	public Caja(int numeroDeCaja) {
		setNumeroDeCaja(numeroDeCaja); // Utiliza el setter para asignar el valor
	}

	// Getter para obtener el número de caja
	public int getNumeroDeCaja() {
		return numeroDeCaja;
	}

	// Setter que asegura que el número de caja sea siempre mayor que 0
	public void setNumeroDeCaja(int numeroDeCaja) {
		if (numeroDeCaja > 0) {
			this.numeroDeCaja = numeroDeCaja;
		} else {
			throw new IllegalArgumentException("El número de caja debe ser mayor que 0.");
		}
	}

	public double registrarProductos(List<Producto> productos) {
		double montoPorProductos = 0.0 ;
			for ( Producto producto : productos) {
				montoPorProductos = montoPorProductos +  producto.notificarPrecio();
			}
			return montoPorProductos;
		
	}
}
