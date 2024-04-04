package ar.edu.unq.po2.tp3;

public class Point {
    private int x;
    private int y;

    // Constructor que inicializa el punto con valores x e y específicos
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Constructor sin argumentos que inicializa el punto en (0,0)
    public Point() {
        this(0, 0); // Llama al constructor Point(int, int) con valores 0, 0
    }

    // Método para mover el punto a una nueva posición
    public void moverA(int newX, int newY) {
        x = newX;
        y = newY;
    }

    // Método para sumar este punto con otro punto
    public Point sumarCon(Point otro) {
        int newX = this.x + otro.x;
        int newY = this.y + otro.y;
        return new Point(newX, newY);
    }

    // Métodos getter para x e y
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Método toString para representar el punto como una cadena de texto
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    // Método main para probar la clase Point
    public static void main(String[] args) {
        Point p1 = new Point(3, 4);
        Point p2 = new Point(1, 2);

        System.out.println("Punto 1: " + p1);
        System.out.println("Punto 2: " + p2);

        Point suma = p1.sumarCon(p2);
        System.out.println("Suma de Punto 1 y Punto 2: " + suma);

        p1.moverA(5, 5);
        System.out.println("Punto 1 movido a (5, 5): " + p1);
    }
}

