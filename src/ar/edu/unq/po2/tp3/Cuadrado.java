package ar.edu.unq.po2.tp3;

public class Cuadrado extends Rectangulo {
	/**
	 * La clase Cuadrado puede ser simplemente un caso especial de Rectángulo donde
	 * el lado es igual en longitud. Para este ejemplo, definiremos el cuadrado por
	 * un punto y la longitud del lado:
	 */
	public Cuadrado(Point superiorIzquierdo, int lado) {
		super(superiorIzquierdo, new Point(superiorIzquierdo.getX() + lado, superiorIzquierdo.getY() + lado));
	}
}
