package ar.edu.unq.po2.tp5Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp5.AgenciaReclutadora;
import ar.edu.unq.po2.tp5.Caja;
import ar.edu.unq.po2.tp5.Factura;
import ar.edu.unq.po2.tp5.Pagable;
import ar.edu.unq.po2.tp5.Producto;
import ar.edu.unq.po2.tp5.ProductoCooperativa;

public class CajaTest {
	private Caja caja1;
	private Producto cerveza;
	private ProductoCooperativa vino;
	private List<Pagable> productosDelCliente;
	private List<Factura> facturas;
	private AgenciaReclutadora agencia;

	@BeforeEach
	public void setUp() {
		cerveza = new Producto(100.0, 10); // Precio y stock inicial.
		vino = new ProductoCooperativa(50.0, 5, 10); // Precio, stock inicial y descuento.

		// Inicialización de la lista de productos
		productosDelCliente = new ArrayList<>();
		productosDelCliente.add(cerveza);
		productosDelCliente.add(vino);

		// Inicialización de la lista de facturas
		facturas = new ArrayList<>(); // Asegurándose de que está inicializada

		// Creación de la caja con la lista de productos.
		agencia = new AgenciaReclutadora(facturas); // Ahora facturas es una lista vacía, no null.

		caja1 = new Caja(1, productosDelCliente, agencia);
	}

	@Test
	public void testDisminuirStockDeLosProductos() {
		caja1.disminuirStockDeLosProductos(productosDelCliente);
		assertEquals(9, cerveza.getStock(), "El stock de cerveza debería haber disminuido en 1");
		assertEquals(4, vino.getStock(), "El stock de vino debería haber disminuido en 1");
	}

	@Test
	public void testIndicarMontoAPagarPorProductos() {
		double montoTotal = caja1.indicarMontoAPagarPorPagables(productosDelCliente);
		assertEquals(145.0, montoTotal, "El monto total debería ser la suma de los precios de los productos");
	}

	@Test
	public void testRegistrarProductos() {
		caja1.registrar(productosDelCliente);
		assertEquals(9, cerveza.getStock(), "El stock de cerveza debería haber disminuido después de registrar");
		assertEquals(4, vino.getStock(), "El stock de vino debería haber disminuido después de registrar");
		// Suponemos que también hay un método para obtener el último monto registrado
		// en la caja
		assertEquals(145.0, caja1.indicarMontoAPagarPorPagables(productosDelCliente),
				"El monto registrado debería ser igual a la suma de los precios");
	}
}
