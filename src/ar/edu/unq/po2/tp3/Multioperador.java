package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Multioperador {

	/**
	 * Suma todos los números en el ArrayList.
	 *
	 * @param numeros ArrayList de enteros.
	 * @return La suma de todos los números.
	 */
	public int sumar(ArrayList<Integer> numeros) {
		int suma = 0;
		for (int numero : numeros) {
			suma += numero;
		}
		return suma;
	}

	/**
	 * Resta todos los números en el ArrayList. Comienza con el primer valor y resta
	 * todos los demás a este.
	 *
	 * @param numeros ArrayList de enteros.
	 * @return El resultado de restar todos los números.
	 */
	public int restar(ArrayList<Integer> numeros) {
		if (numeros.size() == 0)
			return 0; // Evita error si la lista está vacía.

		int resta = numeros.get(0);
		for (int i = 1; i < numeros.size(); i++) {
			resta -= numeros.get(i);
		}
		return resta;
	}

	/**
	 * Multiplica todos los números en el ArrayList.
	 *
	 * @param numeros ArrayList de enteros.
	 * @return El producto de todos los números.
	 */
	public int multiplicar(ArrayList<Integer> numeros) {
		if (numeros.size() == 0)
			return 0; // Retorna 0 si la lista está vacía.

		int producto = 1;
		for (int numero : numeros) {
			producto *= numero;
		}
		return producto;
	}

	public static void main(String[] args) {
		Multioperador multioperador = new Multioperador();
		ArrayList<Integer> numeros = new ArrayList<>();
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);

		System.out.println("Suma: " + multioperador.sumar(numeros));
		System.out.println("Resta: " + multioperador.restar(numeros));
		System.out.println("Multiplicación: " + multioperador.multiplicar(numeros));
	}
}
