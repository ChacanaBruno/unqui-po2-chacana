package ar.edu.unq.po2.tp4Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ar.edu.unq.po2.tp4.Producto;
import ar.edu.unq.po2.tp4.Supermercado;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

public class SupermercadoTest {

	private Producto arroz;
	private Producto detergente;
	private Supermercado supermercado;

	@BeforeEach
	public void setUp() {
		arroz = new Producto("Arroz", 18.9, true);
		detergente = new Producto("Detergente", 75);
		List<Producto> productos = new ArrayList<>(); // Inicializamos la lista de productos esto no estaba en el codigo
														// de los profes
		supermercado = new Supermercado("Lo de Tito", "Av Zubeldia 801", productos);

	}

	@Test
	public void testCantidadDeProductos() {
		assertEquals(0, supermercado.getCantidadDeProductos());
		supermercado.agregarProducto(arroz);
		supermercado.agregarProducto(detergente);
		assertEquals(2, supermercado.getCantidadDeProductos());
	}

	@Test
	public void testPrecioTotal() {
		assertEquals(0, supermercado.getPrecioTotal());
		supermercado.agregarProducto(arroz);
		supermercado.agregarProducto(detergente);
		assertEquals(93.9, supermercado.getPrecioTotal());
	}
}