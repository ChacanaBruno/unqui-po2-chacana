package ar.edu.unqpo2.tpPrueba;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

public class EmpleadoTest {

    @Test
    public void calcularEdad_DeberiaRetornarLaEdadCorrecta() {
        // Configuración
        LocalDate fechaNacimiento = LocalDate.of(1990, 1, 1); //se asigna el "valor" de una fecha cualquiera
        Empleado empleado = new Empleado("Juan Perez", "20-12345678-9", "Soltero", fechaNacimiento, 30000.0);
        int edadEsperada = LocalDate.now().getYear() - fechaNacimiento.getYear();

        // Ejecución
        int edadCalculada = empleado.calcularEdad();

        // Verificación
        Assertions.assertEquals(edadEsperada, edadCalculada, "La edad calculada debe ser la correcta basada en la fecha de nacimiento");
    }
}
