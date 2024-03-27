package ar.edu.unqpo2.tpPrueba;

import java.time.LocalDate;

public class EmpleadoTemporal extends Empleado {
	private LocalDate fechaFinDeAsigcion;
	private int cantidadDeHorasExtras;
	//constructor
	public EmpleadoTemporal(String nombre, String cuit, String estadoCivil, LocalDate fechaNacimiento,
			Double sueldoBasico, LocalDate fechaFinDeAsigcion, int cantidadDeHorasExtras) {
		super(nombre, cuit, estadoCivil, fechaNacimiento, sueldoBasico);
		this.fechaFinDeAsigcion = fechaFinDeAsigcion;
		this.cantidadDeHorasExtras = cantidadDeHorasExtras;
	}
	//getters and setters
	public LocalDate getFechaFinDeAsigcion() {
		return fechaFinDeAsigcion;
	}
	public void setFechaFinDeAsigcion(LocalDate fechaFinDeAsigcion) {
		this.fechaFinDeAsigcion = fechaFinDeAsigcion;
	}
	public int getCantidadDeHorasExtras() {
		return cantidadDeHorasExtras;
	}
	public void setCantidadDeHorasExtras(int cantidadDeHorasExtras) {
		this.cantidadDeHorasExtras = cantidadDeHorasExtras;
	}
	

	@Override
	public double calcularSueldoBruto() {
		/* El sueldo bruto del empleado de planta temporaria se compone de:
			Sueldo Básico
			Horas Extras: $40 por cada hora extra*/
		
		double sueldoBasico = getSueldoBasico() ;
		double montoPorHorasExtras = getCantidadDeHorasExtras() * 40 ;
		double sueldoBruto = sueldoBasico + montoPorHorasExtras;
		
		return sueldoBruto;
	}
	@Override
	public double calcularRetenciones() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	
	
}
