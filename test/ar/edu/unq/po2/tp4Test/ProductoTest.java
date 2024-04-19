package ar.edu.unq.po2.tp4Test;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp4.Producto;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoTest {
	
	private Producto arroz;
	private Producto vino;

	
	@BeforeEach
	public void setUp() {
		arroz = new Producto("Arroz", 18.9, true);
		vino = new Producto("Vino", 55);
	}
	
	@Test
	public void testConstructor() {
	    assertEquals("Arroz", arroz.getNombre());
	    // Usar la comparación con delta para valores de punto flotante
	    assertEquals(18.9, arroz.getPrecio(), 0.001);
	    assertTrue(arroz.esPrecioCuidado());
	    
	    assertEquals("Vino", vino.getNombre());
	    assertEquals(55.0, vino.getPrecio(), 0.001);
	    assertFalse(vino.esPrecioCuidado());
	}

	@Test
	public void testAumentarPrecio() {
	    arroz.aumentarPrecio(1.5);
	    // Nuevamente, comparación con delta para el nuevo precio
	    assertEquals(20.4, arroz.getPrecio(), 0.001);
	}
}

