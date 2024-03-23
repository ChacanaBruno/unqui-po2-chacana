package ar.edu.unqpo2.tpPrueba;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private String nombre;
	private String cuit;
	private List<Empleado> empleados;
	private List<ReciboDeHaberes> reciboDeHaberes;
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
	
	
}
