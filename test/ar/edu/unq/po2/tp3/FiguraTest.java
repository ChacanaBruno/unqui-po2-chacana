package ar.edu.unq.po2.tp3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FiguraTest {

	@Test
	public void testArea() {
		Rectangulo rectangulo = new Rectangulo(new Point(0, 0), new Point(10, 5));
		Assertions.assertEquals(50, rectangulo.getArea());
	}

	@Test
	public void testPerimetro() {
		Rectangulo rectangulo = new Rectangulo(new Point(0, 0), new Point(10, 5));
		Assertions.assertEquals(30, rectangulo.getPerimetro());
	}

	@Test
	public void testOrientacion() {
		Rectangulo horizontal = new Rectangulo(new Point(0, 0), new Point(10, 5));
		Assertions.assertTrue(horizontal.esHorizontal());

		Rectangulo vertical = new Rectangulo(new Point(0, 0), new Point(5, 10));
		Assertions.assertTrue(vertical.esVertical());
	}
}
