package ar.edu.unqpo2.tpPrueba;

import java.time.LocalDate;

public class mainGeneral {
    public static void main(String[] args) {
    	LocalDate fechaNacimiento = LocalDate.of(1990, 1, 1); //se asigna el "valor" de una fecha cualquiera
        Empleado empleado = new Empleado("Juan Perez", "20-12345678-9", "Soltero", fechaNacimiento, 30000.0);
        empleado.mostrarEdad();
    }
}