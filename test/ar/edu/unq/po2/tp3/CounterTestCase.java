package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.w3c.dom.css.Counter;

class CounterTestCase {

	private Contador contador;
	/**
	* Crea un escenario de test básico, que consiste en un contador
	* con 10 enteros
	*
	* @throws Exception
	*/
	@BeforeEach
	public void setUp() throws Exception {
	//Se crea el contador
		contador = new Contador();
	//Se agregan los numeros. Un solo par y nueve impares
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
