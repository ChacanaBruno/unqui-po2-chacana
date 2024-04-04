package ar.edu.unq.po2.tp3;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
public class Persona {
	private String nombre;
	private LocalDate fechaNacimiento;

	// Constructor
	public Persona(String nombre, LocalDate fechaNacimiento) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}

	// Método de clase para la creación de instancias de Persona
	public static Persona crearPersona(String nombre, Date fechaNacimiento) {
		// Convierte Date a LocalDate
		LocalDate fechaNac = fechaNacimiento.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		// Crea y retorna una nueva instancia de Persona
		return new Persona(nombre, fechaNac);
	}

	// Getter para el nombre
	public String getNombre() {
		return nombre;
	}

	// Getter para la fecha de nacimiento
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	// Método para calcular la edad
	public int getEdad() {
		return Period.between(fechaNacimiento, LocalDate.now()).getYears();
	}

	// Ejemplo de uso
	public static void main(String[] args) {
		Persona persona = new Persona("Juan", LocalDate.of(1990, 5, 24));
		System.out.println("Nombre: " + persona.getNombre());
		System.out.println("Fecha de Nacimiento: " + persona.getFechaNacimiento());
		System.out.println("Edad: " + persona.getEdad());
	}

	/*
	 * 1. Responder: Si un objeto cualquiera que le pide la edad a una Persona:
	 * ¿Conoce cómo ésta calcula u obtiene tal valor? ¿Cómo se llama el mecanismo de
	 * abstracción que permite esto?
	 * 
	 * 
	 * 
	 * Cuando un objeto cualquiera solicita la edad de una Persona, no necesita
	 * conocer cómo esta calcula u obtiene tal valor. Sólo necesita saber que existe
	 * un método disponible para obtener la edad, sin importar cómo realiza
	 * internamente el cálculo. Este mecanismo se conoce como encapsulamiento.
	 * 
	 * El encapsulamiento es un principio fundamental de la programación orientada a
	 * objetos (POO) que permite ocultar los detalles de la implementación de un
	 * objeto y exponer sólo las características y comportamientos necesarios a
	 * través de una interfaz pública. Esto significa que los datos internos de un
	 * objeto están protegidos y ocultos del exterior, y cualquier interacción con
	 * esos datos se realiza a través de métodos públicamente accesibles.
	 * 
	 */

	/*
	 * Agregue a la clase Persona definida anteriormente el método menorQue(Persona
	 * persona) que recibe como parámetro a otra persona y retorna true en caso de
	 * que el receptor sea menor en edad que el parámetro, o false en caso contrario
	 * 
	 */

	public boolean menorQue(Persona persona) {
		int edadDePersonaPrincipal = this.getEdad(); // this.getEdad() es la edad de la persona principal
		int edadDePersonaAComparar = persona.getEdad();

		return edadDePersonaPrincipal < edadDePersonaAComparar;
	}

}
