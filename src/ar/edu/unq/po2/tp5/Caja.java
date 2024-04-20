package ar.edu.unq.po2.tp5;

import java.util.List;

public class Caja implements Agencia {
	private int numeroDeCaja;
	private List<Pagable> pagables;
	private AgenciaReclutadora agencia;

	public Caja() {

	}

	// Constructor que inicializa el número de caja con un valor válido
	public Caja(int numeroDeCaja, List<Pagable> pagables) {
		setNumeroDeCaja(numeroDeCaja); // Utiliza el setter para asignar el valor
		this.pagables = pagables;
	}

	public Caja(int numeroDeCaja, List<Pagable> pagables, AgenciaReclutadora agencia2) {
		setNumeroDeCaja(numeroDeCaja); // Utiliza el setter para asignar el valor
		this.pagables = pagables;
		this.agencia =agencia2;
	}

	// Getter para obtener el número de caja
	public int getNumeroDeCaja() {
		return numeroDeCaja;
	}

	public List<Pagable> getPagables() {
		return pagables;
	}

	public void setProductos(List<Pagable> pagables) {
		this.pagables = pagables;
	}

	// Setter que asegura que el número de caja sea siempre mayor que 0
	public void setNumeroDeCaja(int numeroDeCaja) {
		if (numeroDeCaja > 0) {
			this.numeroDeCaja = numeroDeCaja;
		} else {
			throw new IllegalArgumentException("El número de caja debe ser mayor que 0.");
		}
	}

	public void registrar(List<Pagable> pagables) {
		indicarMontoAPagarPorPagables(pagables);
		disminuirStockDeLosProductos(pagables);
	}

	public void disminuirStockDeLosProductos(List<Pagable> pagables) {
		// Itera sobre cada elemento de la lista de pagables
		for (Pagable pagable : pagables) {
			// Verifica si el objeto actual es una instancia de Producto
			if (pagable instanceof Producto) {
				// Realiza un casting del objeto Pagable a Producto
				Producto producto = (Producto) pagable;
				// Llama al método reducirStock para disminuir el stock del producto
				producto.reducirStock();
			}
		}
	}

	public double indicarMontoAPagarPorPagables(List<Pagable> pagables) {
		double montoPorPagables = 0.0;
		for (Pagable pagable : pagables) {
			montoPorPagables = montoPorPagables + pagable.notificarPrecio();
		}
		return montoPorPagables;
	}


	public void registrarPago(Factura factura) {

		agencia.recibirFacturaPagada(factura);
	}
}
