package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter {
	private ArrayList<Integer> numbers;
	

	

	public Counter() { //este es el constructor vacio que no toma argumentos 
		this.numbers = new ArrayList<Integer>();
	}
	
	public Counter(ArrayList<Integer> numbers) { //constructor con argumentos 
		super();
		this.numbers = numbers;
	}

	public void addNumber(int number) {
		this.numbers.add(number);
	}
}
