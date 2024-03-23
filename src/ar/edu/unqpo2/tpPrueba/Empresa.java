package ar.edu.unqpo2.tpPrueba;
//Clase para representar un empleado
public class Empleado {
 private String nombre;
 private String cuit;

 // Constructor
 public Empleado(String nombre, String cuit) {
     this.nombre = nombre;
     this.cuit = cuit;
 }

 // Getters y setters
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
}

public class Empresa {
	private String nombre ;
	private String cuit;
	private List<Empleado> empleados; // falta la clase empleado
}

public Empresa(String nombre, String cuit) {
		this.nombre = nombre;
		this.cuit = cuit;
		
} 