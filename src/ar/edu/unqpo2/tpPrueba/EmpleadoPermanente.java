package ar.edu.unqpo2.tpPrueba;

import java.time.LocalDate;

public class EmpleadoPermanente extends Empleado {

	private int cantHijos;
	private int antiguedad;
	private boolean conyugue; // esto no se si es tipo boolean o que

	// Constructor con herencia de la clase Empleado
	public EmpleadoPermanente(String nombre, String cuit, String estadoCivil, LocalDate fechaNacimiento,
			Double sueldoBasico, int cantHijos, int antiguedad, boolean conyugue) {
		super(nombre, cuit, estadoCivil, fechaNacimiento, sueldoBasico);
		this.cantHijos = cantHijos;
		this.antiguedad = antiguedad;
		this.conyugue = conyugue;
	}

	// getter and setters
	public int getCantHijos() {
		return cantHijos;
	}

	public void setCantHijos(int cantHijos) {
		this.cantHijos = cantHijos;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public boolean isConyugue() {
		return conyugue;
	}

	public void setConyugue(boolean conyugue) {
		this.conyugue = conyugue;
	}

	/*
	 * El sueldo bruto del empleado de planta permanente se compone de: Sueldo
	 * Básico Salario Familiar, que se compone de: Asignación por hijo: $150 por
	 * cada hijo. Asignación por cónyuge: $100 si tiene cónyuge Antigüedad: $50 por
	 * cada año de antigüedad
	 */

	public boolean tieneConyuge() {
		return this.conyugue;
	}

	/*
	 * La anotación @Override en Java es una anotación de marcador que se utiliza
	 * para indicar que un método en una subclase está sobrescribiendo un método en
	 * su clase base (superclase) o que está implementando un método de una
	 * interfaz.
	 */

	@Override
	public double calcularSueldoBruto() {
		int montoPorAsignacionPorHijo = getCantHijos() * 150;
		int montoPorAntiguedad = getAntiguedad() * 50;
		int montoPorConyuge = tieneConyuge() ? 100 : 0;
		// Asumiendo que existe un método tieneConyuge() que devuelve true si el
		// empleado tiene cónyuge
		int salarioFamiliar = montoPorAsignacionPorHijo + montoPorConyuge + montoPorAntiguedad;
		double salarioBasico = getSueldoBasico();

		double sueldoBruto = salarioBasico + salarioFamiliar;

		return sueldoBruto;
	}

	public double calcularMontoPorObraSocial() {
		double montoPorHijo = getCantHijos() * 20;
		double montoPorObraSocial = (calcularSueldoBruto() * 0.10) + montoPorHijo; // Incluye el monto por hijo

		return montoPorObraSocial;
	}

	public double calcularMontoPorJubilacion() {
		double montoPorJubilacion = calcularSueldoBruto() * 0.15;

		return montoPorJubilacion;
	}
	/*
	 * Las retenciones que se realizan a este empleado son: Obra Social: 10% de su
	 * sueldo bruto + $20 por cada hijo. Aportes Jubilatorios: 15% de su sueldo
	 * bruto
	 */

	public double calcularRetenciones() {
		double montoPorObraSocial = calcularMontoPorObraSocial();
		double montoPorJubilacion = calcularMontoPorJubilacion();

		double retenciones = montoPorObraSocial + montoPorJubilacion;

		return retenciones;
	}

	public double calcularSueldoNeto() {
		double retenciones = calcularRetenciones();
		double sueldobruto = calcularSueldoBruto();
		double sueldoNeto = sueldobruto - retenciones;

		
		return sueldoNeto;
	}
}