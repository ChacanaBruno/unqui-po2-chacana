package ar.edu.unqpo2.tpPrueba;

import java.time.LocalDate;

public class EmpleadoPermanente extends Empleado {
	
private int cantHijos ; 
private	int antiguedad; 
private	boolean conyugue; // esto no se si es tipo boolean o que

//Constructor con herencia de la clase Empleado
public EmpleadoPermanente(String nombre, String cuit, String estadoCivil, LocalDate fechaNacimiento,
		Double sueldoBasico, int cantHijos, int antiguedad, boolean conyugue) {
	super(nombre, cuit, estadoCivil, fechaNacimiento, sueldoBasico);
	this.cantHijos = cantHijos;
	this.antiguedad = antiguedad;
	this.conyugue = conyugue;
}
//getter and setters 
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




}
