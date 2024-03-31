package ar.edu.unqpo2.tpPrueba;

import java.time.LocalDate;

public class EmpleadoTemporal extends Empleado {
	private LocalDate fechaFinDeAsigcion;
	private int cantidadDeHorasExtras;

	// constructor
	public EmpleadoTemporal() {
		
	}
	public EmpleadoTemporal(String nombre, String cuit, String estadoCivil, LocalDate fechaNacimiento,
			Double sueldoBasico, LocalDate fechaFinDeAsigcion, int cantidadDeHorasExtras) {
		super(nombre, cuit, estadoCivil, fechaNacimiento, sueldoBasico);
		this.fechaFinDeAsigcion = fechaFinDeAsigcion;
		this.cantidadDeHorasExtras = cantidadDeHorasExtras;
	}

	// getters and setters
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
		/*
		 * El sueldo bruto del empleado de planta temporaria se compone de: Sueldo
		 * Básico Horas Extras: $40 por cada hora extra
		 */

		double sueldoBasico = getSueldoBasico();
		double montoPorHorasExtras = getCantidadDeHorasExtras() * 40;
		double sueldoBruto = sueldoBasico + montoPorHorasExtras;

		return sueldoBruto;
	}

	public double calcularMontoPorObraSocial() {

		int edad = calcularEdad();
		double sueldoBruto = calcularSueldoBruto();
		double montoPorObraSocial = sueldoBruto * 0.10;

		if (edad > 50) {
			montoPorObraSocial += 25;
		}
		return montoPorObraSocial;
	}

	public double calcularMontoPorJubilacion() {
		double sueldoBruto = calcularSueldoBruto();
		int horasExtras = getCantidadDeHorasExtras();
		double montoPorJubilacion = sueldoBruto * 0.10 + 5 * horasExtras;

		return montoPorJubilacion;

	}

	@Override
	public double calcularRetenciones() {
		/*
		 * Las retenciones que se realizan a este empleado son: Obra Social: 10% de su
		 * sueldo bruto + $25 si supera los 50 años Aportes Jubilatorios: 10% de su
		 * sueldo bruto + $5 por cada hora extra
		 */

		double retenciones = calcularMontoPorObraSocial() + calcularMontoPorJubilacion();
		return retenciones;

		
	}

}