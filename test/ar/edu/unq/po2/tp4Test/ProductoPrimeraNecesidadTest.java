package ar.edu.unq.po2.tp4Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp4.ProductoPrimeraNecesidad;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad leche;
	private ProductoPrimeraNecesidad mandarina;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 8, false, 10);
		mandarina = new ProductoPrimeraNecesidad("Mandarina", 20, true , 5);
	}
	
	@Test
	public void testCalcularPrecio() {
		assertEquals(7.2, leche.getPrecio()); 
		/* por que deberia retornar el precio con descuento si el producto no tiene descuento?*/
	}
	
	@Test
	public void testCalcularPrecioDeMandarina() {
		assertEquals(19, mandarina.getPrecio()); 
		
	}
}



