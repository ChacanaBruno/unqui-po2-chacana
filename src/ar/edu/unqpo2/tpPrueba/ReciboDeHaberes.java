package ar.edu.unqpo2.tpPrueba;

import java.time.LocalDate;

public class ReciboDeHaberes {
	 private String nombre;
	 private String direccion;
	 private LocalDate fechaDeEmision;
	 private float sueldoBruto;
	 private float sueldoNeto;
	public ReciboDeHaberes(String nombre, String direccion, LocalDate fechaDeEmision, float sueldoBruto,
			float sueldoNeto) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
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
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public LocalDate getFechaDeEmision() {
		return fechaDeEmision;
	}
	public void setFechaDeEmision(LocalDate fechaDeEmision) {
		this.fechaDeEmision = fechaDeEmision;
	}
	public float getSueldoBruto() {
		return sueldoBruto;
	}
	public void setSueldoBruto(float sueldoBruto) {
		this.sueldoBruto = sueldoBruto;
	}
	public float getSueldoNeto() {
		return sueldoNeto;
	}
	public void setSueldoNeto(float sueldoNeto) {
		this.sueldoNeto = sueldoNeto;
	}
	 
	 
}
