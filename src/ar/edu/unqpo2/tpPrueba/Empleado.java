package ar.edu.unqpo2.tpPrueba;

import java.time.LocalDate;

public abstract class Empleado {
	private String nombre;
	private String cuit;
	private String estadoCivil;
	private LocalDate fechaNacimiento;
	private Double sueldoBasico;
//Constructor con herencia
	public Empleado() {
		
	}

	public Empleado(String nombre, String cuit, String estadoCivil, LocalDate fechaNacimiento, Double sueldoBasico) {
		super();
		this.nombre = nombre;
		this.cuit = cuit;
		this.estadoCivil = estadoCivil;
		this.fechaNacimiento = fechaNacimiento;
		this.sueldoBasico = sueldoBasico;
	}

//getter and setters 
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

//METODOS 
	public int calcularEdad() {
		// TODO Auto-generated method stub
		int edadEsperada = LocalDate.now().getYear() - fechaNacimiento.getYear();
		return edadEsperada;
	}

	public void mostrarEdad() {
		String nombreDelEmpleado = getNombre();
		int edad = calcularEdad();
		System.out.println("La edad de " + nombreDelEmpleado + " es: " + edad + " años.");
	}

	public void mostrarSueldoBruto() {
		String nombreDelEmpleado = getNombre();
		double sueldoBruto = calcularSueldoBruto();
		System.out.println("El sueldo bruto de " + nombreDelEmpleado + " es: " + sueldoBruto);
	}

	public void mostrarRetenciones() {
		String nombreDelEmpleado = getNombre();
		double retenciones = calcularRetenciones();
		System.out.println("Las retenciones de " + nombreDelEmpleado + " son: " + retenciones);
	}

	public boolean tieneConyuge() { // debe conocer el metodo por ser la clase padre pero responde false pues no se
									// indica si puede o no tener conyugue
		return false;
	}

	public abstract double calcularSueldoBruto(); // debe saber el metodo de forma abstracta para repetar herencia.

	public abstract double calcularRetenciones();
	
	public double calcularSueldoNeto() {
		
		double sueldoBruto = calcularSueldoBruto();
		double retenciones = calcularRetenciones();
		double sueldoNeto = sueldoBruto - retenciones;
				return sueldoNeto;
	}
	
	public double calcularMontoPorObraSocial() {
		return 0;
		
	}

	public double calcularMontoPorJubilacion() {
		return 0;
	}

}