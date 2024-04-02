package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Contador {
	// Lista para almacenar los números enteros.
	private ArrayList<Integer> numeros;

	public Contador() {
		// Inicialización de la lista de números al crear una instancia de Contador.
		this.numeros = new ArrayList<>();
	}

	public void agregarNumero(int numero) {
		// Método para añadir un número a la lista.
		this.numeros.add(numero);
	}

	// El operador %, conocido como operador de módulo o residuo, devuelve el resto
	// de la división de dos números
	public int contarNumerosPares() {
		// Inicializa el contador de números pares en 0.
		int contador = 0;
		// Itera sobre cada número en la lista de números.
		for (int numero : this.numeros) {
			// Verifica si el número actual es par (divisible por 2 sin resto).
			if (numero % 2 == 0) {
				// Si es par, incrementa el contador de números pares.
				contador++;
			}
		}
		// Devuelve la cantidad total de números pares encontrados.
		return contador;
	}

	public int contarNumerosImpares() {
		// Inicializa el contador de números impares en 0.
		int contador = 0;
		// Itera sobre cada número en la lista de números.
		for (int numero : this.numeros) {
			// Verifica si el número actual es impar (no divisible por 2 sin resto).
			if (numero % 2 != 0) {
				// Si es impar, incrementa el contador de números impares.
				contador++;
			}
		}
		// Devuelve la cantidad total de números impares encontrados.
		return contador;
	}

	/*
	 * Verificar si es Múltiplo: Dentro del bucle, se usa el operador de módulo (%)
	 * para determinar si el número actual n es un múltiplo del número especificado.
	 * Un número A es múltiplo de otro número B si A % B es igual a 0, es decir, si
	 * A se puede dividir exactamente por B sin dejar resto.
	 */

	public int contarMultiplosDe(int numero) {
		// Inicializa el contador de múltiplos en 0.
		int contador = 0;
		// Itera sobre cada número en la lista de números.
		for (int n : this.numeros) {
			// Verifica si el número actual es múltiplo del número dado.
			if (n % numero == 0) {
				// Si es múltiplo, incrementa el contador de múltiplos.
				contador++;
			}
		}
		// Devuelve la cantidad total de múltiplos del número dado encontrados.
		return contador;
	}
	/*
	 * private static int para contarDigitosPares(int numero) indica que es un
	 * método auxiliar de la clase, no accesible desde fuera de ella, que puede ser
	 * llamado sin instanciar la clase y que devuelve un entero. Estas
	 * características lo hacen adecuado para su propósito dentro de la lógica de la
	 * clase NumeroConMasDigitosPares.
	 */

	static int contarDigitosPares(int numero) {
		int contador = 0;
		numero = Math.abs(numero); // Convierte el número a positivo para manejar correctamente números negativos.

		while (numero > 0) {
			if ((numero % 10) % 2 == 0) { // Verifica si el último dígito es par.
				contador++;
			}
			numero /= 10; // Elimina el último dígito.
		}

		return contador; // Devuelve la cantidad de dígitos pares.
	}

	public static void encontrarNumerosConMasDigitosPares(int[] numeros) {
		ArrayList<Integer> numerosConMaxPares = new ArrayList<>();
		int maxCantidadPares = 0;

		// Determina la máxima cantidad de dígitos pares entre todos los números.
		for (int numero : numeros) {
			int cantidadPares = contarDigitosPares(numero);
			maxCantidadPares = Math.max(maxCantidadPares, cantidadPares);
		}

		// Encuentra todos los números que tienen esa cantidad máxima de dígitos pares.
		for (int numero : numeros) {
			if (contarDigitosPares(numero) == maxCantidadPares) {
				numerosConMaxPares.add(numero);
			}
		}

		// Imprime los números con la máxima cantidad de dígitos pares.
		if (!numerosConMaxPares.isEmpty()) {
			System.out.println("Estos son los números con más dígitos pares: ");
			for (int numero : numerosConMaxPares) {
				System.out.println(numero + " ");
			}
		}
	}

	public static void main(String[] args) {
		int[] numeros = { 123, -4567, 12345, -678, 9012, 480 }; // Incluye números con igual cantidad máxima de dígitos
																// pares
		encontrarNumerosConMasDigitosPares(numeros);
	}

}