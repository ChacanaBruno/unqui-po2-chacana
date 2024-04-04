package ar.edu.unq.po2.tp3;

public class Rectangulo {
    private Point superiorIzquierdo;
    private Point inferiorDerecho;

    public Rectangulo(Point superiorIzquierdo, Point inferiorDerecho) {
        this.superiorIzquierdo = superiorIzquierdo;
        this.inferiorDerecho = inferiorDerecho;
    }

    public double getArea() {
        int ancho = Math.abs(superiorIzquierdo.getX() - inferiorDerecho.getX());
        int alto = Math.abs(superiorIzquierdo.getY() - inferiorDerecho.getY());
        return ancho * alto;
    }

    public double getPerimetro() {
        int ancho = Math.abs(superiorIzquierdo.getX() - inferiorDerecho.getX());
        int alto = Math.abs(superiorIzquierdo.getY() - inferiorDerecho.getY());
        return 2 * (ancho + alto);
    }

    /**
     * Determina si el rectángulo está orientado horizontalmente.
     * Un rectángulo se considera horizontal si su anchura es mayor que su altura.
     *
     * @return Verdadero si el rectángulo es más ancho que alto.
     */
    public boolean esHorizontal() {
        return Math.abs(superiorIzquierdo.getX() - inferiorDerecho.getX()) > Math.abs(superiorIzquierdo.getY() - inferiorDerecho.getY());
    }

    /**
     * Determina si el rectángulo está orientado verticalmente.
     * Un rectángulo se considera vertical si su altura es mayor que su anchura.
     *
     * @return Verdadero si el rectángulo es más alto que ancho.
     */
    public boolean esVertical() {
        return !esHorizontal();
    }
}
