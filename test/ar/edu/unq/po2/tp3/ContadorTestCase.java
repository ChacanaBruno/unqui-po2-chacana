package ar.edu.unq.po2.tp3;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.w3c.dom.css.Counter;

class ContadorTestCase {

	private Contador contador;

	/**
	 * Crea un escenario de test básico, que consiste en un contador con 10 enteros
	 *
	 * @throws Exception
	 */
	@BeforeEach
	public void setUp() throws Exception {
		// Se crea el contador
		contador = new Contador();
		// Se agregan los numeros. Un solo par y nueve impares
		contador.agregarNumero(1);
		contador.agregarNumero(3);
		contador.agregarNumero(5);
		contador.agregarNumero(7);
		contador.agregarNumero(9);
		contador.agregarNumero(1);
		contador.agregarNumero(1);
		contador.agregarNumero(1);
		contador.agregarNumero(1);
		contador.agregarNumero(4);
	}

	/**
	 * Verifica la cantidad de pares
	 */
	@Test
	public void contarNumerosParesTest() {
		// Getting the even occurrences
		int amount = contador.contarNumerosPares();
		// I check the amount is the expected one
		assertEquals(amount, 1);
	}

	/**
	 * Verifica la cantidad de impares
	 */
	@Test
	public void contarNumerosImparesTest() {
		// Getting the even occurrences
		int amount = contador.contarNumerosImpares();
		// I check the amount is the expected one
		assertEquals(amount, 9);
	}

	/**
	 * Verifica la cantidad de multiplos
	 */
	@Test
	public void contarNumerosMultiplosTest() {
		// Getting the even occurrences
		int amount = contador.contarMultiplosDe(1);
		// I check the amount is the expected one
		assertEquals(amount, 10);
	}

	/**
	 * método imprime los resultados en lugar de retornarlos, lo que complica un
	 * poco la verificación en un test unitario. Una forma de probarlo es capturando
	 * la salida estándar durante la ejecución del test y luego verificando si la
	 * salida capturada contiene los resultados esperados.
	 */
	private final PrintStream standardOut = System.out;
	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

	@BeforeEach
	public void setUp1() {
		System.setOut(new PrintStream(outputStreamCaptor)); // Redirige la salida estándar.
	}

	@Test
	public void testEncontrarNumerosConMasDigitosPares() {
		int[] numeros = { 123, -4567, 12345, -678, 9012, 480 }; // Ejemplo de entrada.
		Contador.encontrarNumerosConMasDigitosPares(numeros);

		// Verifica si la salida contiene los números esperados.
		// Ajusta la cadena de texto esperada según tu lógica de negocio y lo que
		// debería imprimir tu método.
		String expectedOutput = "480";
		assertTrue(outputStreamCaptor.toString().trim().contains(expectedOutput));
	}

	@AfterEach
	public void tearDown() {
		System.setOut(standardOut); // Restaura la salida estándar.
	}

}
