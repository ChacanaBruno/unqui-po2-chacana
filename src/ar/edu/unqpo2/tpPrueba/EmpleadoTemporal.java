package ar.edu.unqpo2.tpPrueba;

import java.time.LocalDate;

public class EmpleadoTemporal extends Empleado {
	private LocalDate fechaFinDeAsigcion;
	private int cantidadDeHorasExtras;
	public EmpleadoTemporal(String nombre, String cuit, String estadoCivil, LocalDate fechaNacimiento,
			Double sueldoBasico, LocalDate fechaFinDeAsigcion, int cantidadDeHorasExtras) {
		super(nombre, cuit, estadoCivil, fechaNacimiento, sueldoBasico);
		this.fechaFinDeAsigcion = fechaFinDeAsigcion;
		this.cantidadDeHorasExtras = cantidadDeHorasExtras;
	}
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

	
	
	
	
}
