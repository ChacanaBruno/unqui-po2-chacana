package ar.edu.unqpo2.tpPrueba;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private String nombre;
	private String cuit;
	private List<Empleado> empleados;
	private List<ReciboDeHaberes> reciboDeHaberes;

	// constructores
	public Empresa() {

	}

	public Empresa(String nombre, String cuit, List<Empleado> empleados, List<ReciboDeHaberes> reciboDeHaberes) {
		super();
		this.nombre = nombre;
		this.cuit = cuit;
		this.empleados = empleados;
		this.reciboDeHaberes = reciboDeHaberes;
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

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	public List<ReciboDeHaberes> getReciboDeHaberes() {
		return reciboDeHaberes;
	}

	public void setReciboDeHaberes(List<ReciboDeHaberes> reciboDeHaberes) {
		this.reciboDeHaberes = reciboDeHaberes;
	}

	// Método para agregar un empleado a la lista
	public void agregarEmpleado(Empleado empleado) {
		empleados.add(empleado);
	}

	public double calcularMontoParaSueldosNetosDeEmpleados() {
		double montoTotalSueldosNetos = 0;

		for (Empleado empleado : empleados) {
			montoTotalSueldosNetos += empleado.calcularSueldoNeto(); // Asumiendo que Empleado tiene este método
		}
		return montoTotalSueldosNetos;
	}

	public double calcularMontoParaSueldosBrutosDeEmpleados() {
		double montoTotalSueldosBrutos = 0;

		for (Empleado empleado : empleados) {
			montoTotalSueldosBrutos += empleado.calcularSueldoBruto(); // Asumiendo que Empleado tiene este método
		}
		return montoTotalSueldosBrutos;
	}

	public double calcularMontoParaRetencionesDeEmpleados() {
		double montoRetenciones = 0;

		for (Empleado empleado : empleados) {
			montoRetenciones += empleado.calcularRetenciones(); // Asumiendo que Empleado tiene este método
		}
		return montoRetenciones;
	}

	public void realizarLiquidacionDeSueldos() {
		if (empleados.isEmpty()) {
			System.out.println("No hay empleados para realizar la liquidación.");
			return;
		}

		for (Empleado empleado : empleados) {
			try {
				LocalDate fechaEmision = LocalDate.now();
				double sueldoBruto = empleado.calcularSueldoBruto();
				double sueldoNeto = empleado.calcularSueldoNeto();
				
				//creacion de recibo de haberes
				ReciboDeHaberes recibo = new ReciboDeHaberes(
						empleado.getNombre(), 
						fechaEmision, 
						sueldoBruto, 
						sueldoNeto
						);
				
				reciboDeHaberes.add(recibo);

				System.out.println(
						"Recibo generado para: " + empleado.getNombre() + "\n" +
                        "Fecha de Emisión: " + fechaEmision.toString() + "\n" +
                        "Sueldo Bruto: $" + sueldoBruto + "\n" +
                        "Sueldo Neto: $" + sueldoNeto);

			} catch (Exception e) {
				System.out.println("Error al generar recibo para " + empleado.getNombre() + ": " + e.getMessage());
			}

		}
		
	}

}