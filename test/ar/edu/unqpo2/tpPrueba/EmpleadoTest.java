package ar.edu.unqpo2.tpPrueba;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.Assert.*;

public class EmpleadoTest {

	@Test
	public void calcularEdad_DeberiaRetornarLaEdadCorrecta() {
		// Configuración
		LocalDate fechaNacimiento = LocalDate.of(1990, 1, 1); // se asigna el "valor" de una fecha cualquiera
		EmpleadoPermanente empleadoPermanente = new EmpleadoPermanente("Juan Perez", "20-12345678-9", "Soltero",
				fechaNacimiento, 30000.0, 2, 5, true);
		int edadEsperada = LocalDate.now().getYear() - fechaNacimiento.getYear();

		// Ejecución
		int edadCalculada = empleadoPermanente.calcularEdad();

		// Verificación
		Assertions.assertEquals(edadEsperada, edadCalculada,
				"La edad calculada debe ser la correcta basada en la fecha de nacimiento");
	}

	@Test
	public void testCalcularSueldoBrutoDeEmpleadoPermanente() {
		// Preparación del test: Crear una instancia de Empleado con datos de prueba
		LocalDate fechaNacimiento = LocalDate.of(1990, 1, 1); // se asigna el "valor" de una fecha cualquiera
		EmpleadoPermanente empleadoPermanente = new EmpleadoPermanente("Juan Perez", "20-12345678-9", "Soltero",
				fechaNacimiento, 30000.0, 2, 5, true);
		// Nota: Ajusta los parámetros según el constructor real de tu clase
		// EmpleadoPermanente

		// Ejecución del método a probar
		double sueldoBrutoEsperado = 30000.0 + (2 * 150) + (5 * 50) + 100; // Calcula el sueldo bruto esperado según la
																			// lógica de tu método
		double sueldoBrutoReal = empleadoPermanente.calcularSueldoBruto();

		// Verificación: Comparar el resultado esperado con el real
		assertEquals("El sueldo bruto calculado no es el esperado", sueldoBrutoEsperado, sueldoBrutoReal, 0.001);
		/* El ultimo parametro es el delta para comparaciones de punto flotante */
	}

	@Test
	public void testCalcularDeEmpleadoPermanente() {
		// Preparación del empleado de prueba
		LocalDate fechaNacimiento = LocalDate.of(1990, 1, 1);
		EmpleadoPermanente empleadoPermanente = new EmpleadoPermanente("Juan Perez", "20-12345678-9", "Soltero",
				fechaNacimiento, 30000.0, 2, 5, true);
		// Ajusta esta línea según el constructor real de tu clase Empleado.

		// Cálculo esperado
		double montoPorHijo = 2 * 20;
		double montoPorObraSocial = (30650.0 * 0.10) + montoPorHijo;
		double montoPorJubilacion = 30650.0 * 0.15;
		double retencionesEsperadas = montoPorObraSocial + montoPorJubilacion;

		// Ejecución y verificación
		assertEquals("Las retenciones calculadas no son las esperadas", retencionesEsperadas,
				empleadoPermanente.calcularRetenciones(), 0.01);
	}
	// cuando falla lo que esta entre " " indica el error

	@Test
	public void testCalcularSueldoNetoDeEmpleadoPermanente() {
		// Definir los valores esperados según tu lógica de negocio
		LocalDate fechaNacimiento = LocalDate.of(1990, 1, 1);
		EmpleadoPermanente empleadoPermanente = new EmpleadoPermanente("Juan Perez", "20-12345678-9", "Soltero",
				fechaNacimiento, 30000.0, 2, 5, true);
		double sueldoBrutoEsperado = 30650.0;
		double retencionesEsperadas = 7702.5; // Este es un valor de ejemplo. Calcula según tu lógica.
		double sueldoNetoEsperado = sueldoBrutoEsperado - retencionesEsperadas;

		// Realizar la prueba
		double sueldoNetoCalculado = empleadoPermanente.calcularSueldoNeto();

		// Verificar el resultado
		assertEquals("El sueldo neto calculado no es el esperado", sueldoNetoEsperado, sueldoNetoCalculado, 0.01);
	}

	@Test
	public void testCalcularSueldoBrutoDeEmpleadoTemporal() {
		// Preparación del test: Crear una instancia de EmpleadoTemporal con datos de
		// prueba
		LocalDate fechaNacimiento = LocalDate.of(1990, 1, 1); // se asigna el "valor" de una fecha cualquiera
		LocalDate fechaFinDeAsigcion = LocalDate.of(2024, 3, 27);
		EmpleadoTemporal empleadoTemporal = new EmpleadoTemporal("Juan Perez", "20-12345678-9", "Soltero",
				fechaNacimiento, 30000.0, fechaFinDeAsigcion, 5);
		// Nota: Ajusta los parámetros según el constructor real de tu clase
		// EmpleadoPermanente

		// Ejecución del método a probar
		double sueldoBrutoEsperado = 30000.0 + (5 * 40); // Calcula el sueldo bruto esperado según la lógica de tu
															// método
		double sueldoBrutoReal = empleadoTemporal.calcularSueldoBruto();

		// Verificación: Comparar el resultado esperado con el real
		assertEquals("El sueldo bruto calculado no es el esperado", sueldoBrutoEsperado, sueldoBrutoReal, 0.001);
		/* El ultimo parametro es el delta para comparaciones de punto flotante */
	}

	@Test
	public void testCalcularRetencionesDeEmpleadoTemporal() {
		// Preparación del test: Crear una instancia de EmpleadoTemporal con datos de
		// prueba
		LocalDate fechaNacimiento = LocalDate.of(1990, 1, 1); // se asigna el "valor" de una fecha cualquiera
		LocalDate fechaFinDeAsigcion = LocalDate.of(2024, 3, 27);
		EmpleadoTemporal empleadoTemporal = new EmpleadoTemporal("Juan Perez", "20-12345678-9", "Soltero",
				fechaNacimiento, 30000.0, fechaFinDeAsigcion, 5);

		// Ejecución del método a probar
		double retencionesEsperada = empleadoTemporal.calcularMontoPorObraSocial()
				+ empleadoTemporal.calcularMontoPorJubilacion();

		double retencionesReal = empleadoTemporal.calcularRetenciones();

		// Verificación: Comparar el resultado esperado con el real
		assertEquals("las retenciones calculada no es la esperado", retencionesEsperada, retencionesReal, 0.001); 
		/*El ultimo parametro es el delta para comparaciones de punto flotante*/

		}
	
	}