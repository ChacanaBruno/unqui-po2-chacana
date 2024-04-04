package ar.edu.unq.po2.tp3;

public class Tiposprimitivos {
	// Variables de instancia
    int instanciaInt;
    Integer instanciaInteger;

    public void mostrarValoresPredeterminados() {
        // Variables de método (local) - deben ser inicializadas antes de usarlas
        // int metodoInt; // Descomentar causará error de compilación
        // Integer metodoInteger; // Descomentar causará error de compilación

        // Inicialización de variables de método para demostración
        int metodoInt = 0;
        Integer metodoInteger = null;

        System.out.println("Valor predeterminado de instanciaInt: " + instanciaInt);
        System.out.println("Valor predeterminado de instanciaInteger: " + instanciaInteger);
        System.out.println("Valor de metodoInt: " + metodoInt);
        System.out.println("Valor de metodoInteger: " + metodoInteger);
    }

    public static void main(String[] args) {
        new Tiposprimitivos().mostrarValoresPredeterminados();
    }
}
