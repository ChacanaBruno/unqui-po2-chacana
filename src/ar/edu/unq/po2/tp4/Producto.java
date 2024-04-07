package ar.edu.unq.po2.tp4;

public class Producto {
	private String nombre;
	private Double precio;
	private Boolean esPrecioCuidado;
	
	public Producto() {
		
	}
	
	public Producto(String nombre, Double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	
	public Producto(String nombre, Double precio, Boolean esPrecioCuidado) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.esPrecioCuidado = esPrecioCuidado;
	}
	
	
	
}
