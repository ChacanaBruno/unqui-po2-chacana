package ar.edu.unq.po2.tp3.EquipoDeTrabajo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EquipoDeTrabajo {
	private String nombre;
	private List<PersonaTrabajo> integrantes;

	// Constructor que inicializa el equipo con un nombre y una lista vacía de
	// integrantes
	public EquipoDeTrabajo(String nombre) {
		this.nombre = nombre;
		this.integrantes = new ArrayList<>();
	}

	// Método para agregar un integrante al equipo
	public void agregarIntegrante(PersonaTrabajo persona) {
		integrantes.add(persona);
	}

	// Getter para el nombre del equipo
	public String getNombre() {
		return nombre;
	}

	// Getter para la lista de integrantes
	public List<PersonaTrabajo> getIntegrantes() {
		return integrantes;
	}

	// Método para obtener el número total de integrantes en el equipo
	public int cantidadDeIntegrantes() {
		return integrantes.size();
	}

	public String indicarNombreDeEquipo() {

		return nombre;
	}

	// Método opcional para imprimir la información del equipo y sus integrantes
	public void imprimirInformacionEquipo() {
		System.out.println("Nombre del Equipo: " + nombre);
		System.out.println("La edad promedio de los integrantes del Equipo es:");
		System.out.println("- " + indicarPromedioDeEdadDeEquipo());

	}

	public int indicarPromedioDeEdadDeEquipo() {
		int sumaDeEdad = 0;
		if (integrantes.isEmpty()) { // Verifica si la lista está vacía para evitar división por cero
			return 0;
		}
		for (PersonaTrabajo integrante : integrantes) {
			sumaDeEdad += integrante.getEdad(); // Acumula las edades de los integrantes
		}
		return sumaDeEdad / integrantes.size(); // Divide la suma total de las edades por el número de integrantes para
												// obtener el promedio
	}

	public static void imprimirPromedioDeEdad(EquipoDeTrabajo equipo) {
		int promedioDeEdad = equipo.indicarPromedioDeEdadDeEquipo();
		System.out.println("El promedio de edad del equipo es: " + promedioDeEdad);
	}

	// Ejemplo de uso
	public static void main(String[] args) {
		EquipoDeTrabajo equipo = new EquipoDeTrabajo("Desarrolladores");
		PersonaTrabajo persona1 = new PersonaTrabajo("Juan", "Perez", 21);
		PersonaTrabajo persona2 = new PersonaTrabajo("Ana", "Lalo", 36);

		equipo.agregarIntegrante(persona1);
		equipo.agregarIntegrante(persona2);

		equipo.imprimirInformacionEquipo();
	}
}
