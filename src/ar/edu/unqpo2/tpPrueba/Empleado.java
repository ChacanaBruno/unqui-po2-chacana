package ar.edu.unqpo2.tpPrueba;

import java.time.LocalDate;

public class Empleado {
	private String nombre;
	private String cuit;
	private String estadoCivil; 
	private LocalDate fechaNacimiento;
	private Double sueldoBasico;
	
	public Empleado(String nombre, String cuit, String estadoCivil, LocalDate fechaNacimiento, Double sueldoBasico) {
		super();
		this.nombre = nombre;
		this.cuit = cuit;
		this.estadoCivil = estadoCivil;
		this.fechaNacimiento = fechaNacimiento;
		this.sueldoBasico = sueldoBasico;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCuit() {
		return cuit;
	}
	public void setCuit(String cuit) {
		this.cuit = cuit;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Double getSueldoBasico() {
		return sueldoBasico;
	}
	public void setSueldoBasico(Double sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}



}


