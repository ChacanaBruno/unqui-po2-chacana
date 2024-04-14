package ar.edu.unq.po2.tp4;

public class Producto {
	protected String nombre;
	protected double precio;
	protected Boolean esPrecioCuidado;

	public Producto() {

	}

	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
		this.esPrecioCuidado = false;
	}

	public Producto(String nombre, double precio, Boolean esPrecioCuidado) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.esPrecioCuidado = esPrecioCuidado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public Boolean getEsPrecioCuidado() {
		return esPrecioCuidado;
	}

	public void setEsPrecioCuidado(Boolean esPrecioCuidado) {
		this.esPrecioCuidado = esPrecioCuidado;
	}

	public Boolean esPrecioCuidado() {
		return getEsPrecioCuidado();
	}
	
	public void aumentarPrecio(double montoAAuMentar) {
	    
	    precio = precio += montoAAuMentar;
	}


}
