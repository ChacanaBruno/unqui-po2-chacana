package ar.edu.unqpo2.tpPrueba;

import java.time.LocalDate;

public class ReciboDeHaberes {
	private String nombre;
	private LocalDate fechaDeEmision;
	private double sueldoBruto;
	private double sueldoNeto;

	public ReciboDeHaberes() {
		
	}
	public ReciboDeHaberes(String nombre, LocalDate fechaDeEmision, double sueldoBruto, double sueldoNeto) {
		super();
		this.nombre = nombre;
		this.fechaDeEmision = fechaDeEmision;
		this.sueldoBruto = sueldoBruto;
		this.sueldoNeto = sueldoNeto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaDeEmision() {
		return fechaDeEmision;
	}

	public void setFechaDeEmision(LocalDate fechaDeEmision) {
		this.fechaDeEmision = fechaDeEmision;
	}

	public double getSueldoBruto() {
		return sueldoBruto;
	}

	public void setSueldoBruto(double sueldoBruto) {
		this.sueldoBruto = sueldoBruto;
	}

	public double getSueldoNeto() {
		return sueldoNeto;
	}

	public void setSueldoNeto(double sueldoNeto) {
		this.sueldoNeto = sueldoNeto;
		
	}
	
}