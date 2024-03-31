package ar.edu.unqpo2.tpPrueba;

import java.time.LocalDate;

public class EmpleadoContratado extends Empleado {
    private String direccion;
    private String numeroDeContrato;
    private String medioDePago;

    // Constructor vacío
    public EmpleadoContratado() {
    }
    // Constructor con parámetros
    public EmpleadoContratado(String nombre, String cuit, String estadoCivil, LocalDate fechaNacimiento,
                              Double sueldoBasico, String direccion, String numeroDeContrato, String medioDePago) {
        super(nombre, cuit, estadoCivil, fechaNacimiento, sueldoBasico);
        this.direccion = direccion;
        this.numeroDeContrato = numeroDeContrato;
        this.medioDePago = medioDePago;
    }

	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getNumeroDeContrato() {
		return numeroDeContrato;
	}


	public void setNumeroDeContrato(String numeroDeContrato) {
		this.numeroDeContrato = numeroDeContrato;
	}


	public String getMedioDePago() {
		return medioDePago;
	}


	public void setMedioDePago(String medioDePago) {
		this.medioDePago = medioDePago;
	}


	public double calcularSueldoBruto() {
		return getSueldoBasico();
	} 
	
	public double calcularRetenciones() {
		return 0.0;
	} ;
	
	
	
	
	public double calcularSueldoNeto() {
		double sueldoBruto = calcularSueldoBruto();
		double retenciones = calcularRetenciones();
		double GastosAdministrativosContractuales = 50 ;
		double sueldoNeto = sueldoBruto - retenciones - GastosAdministrativosContractuales ;
		
			return sueldoNeto;
	} 
	
	
}
