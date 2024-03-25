package ar.edu.unqpo2.tpPrueba;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.Assert.*;


public class EmpleadoTest {

    @Test
    public void calcularEdad_DeberiaRetornarLaEdadCorrecta() {
        // Configuración
        LocalDate fechaNacimiento = LocalDate.of(1990, 1, 1); //se asigna el "valor" de una fecha cualquiera
        EmpleadoPermanente empleadoPermanente = new EmpleadoPermanente("Juan Perez", "20-12345678-9", "Soltero", fechaNacimiento, 30000.0, 2 , 5 , true);
        int edadEsperada = LocalDate.now().getYear() - fechaNacimiento.getYear();

        // Ejecución
        int edadCalculada = empleadoPermanente.calcularEdad();

        // Verificación
        Assertions.assertEquals(edadEsperada, edadCalculada, "La edad calculada debe ser la correcta basada en la fecha de nacimiento");
    } 
    @Test
    public void testCalcularSueldoBruto() {
        // Preparación del test: Crear una instancia de Empleado con datos de prueba
    	LocalDate fechaNacimiento = LocalDate.of(1990, 1, 1); //se asigna el "valor" de una fecha cualquiera
        EmpleadoPermanente empleadoPermanente = new EmpleadoPermanente("Juan Perez", "20-12345678-9", "Soltero", fechaNacimiento, 30000.0, 2 , 5 , true);
        // Nota: Ajusta los parámetros según el constructor real de tu clase EmpleadoPermanente

        // Ejecución del método a probar
        double sueldoBrutoEsperado = 30000.0 + (2 * 150) + (5 * 50) + 100; // Calcula el sueldo bruto esperado según la lógica de tu método
        double sueldoBrutoReal = empleadoPermanente.calcularSueldoBruto();

        // Verificación: Comparar el resultado esperado con el real
        assertEquals("El sueldo bruto calculado no es el esperado", sueldoBrutoEsperado, sueldoBrutoReal, 0.001); // El último parámetro es el delta para comparaciones de punto flotante
    }
}
