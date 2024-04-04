package ar.edu.unq.po2.tp3.EquipoDeTrabajo;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EquipoDeTrabajo {
    private String nombre;
    private List<Persona> integrantes;

    // Constructor que inicializa el equipo con un nombre y una lista vacía de integrantes
    public EquipoDeTrabajo(String nombre) {
        this.nombre = nombre;
        this.integrantes = new ArrayList<>();
    }

    // Método para agregar un integrante al equipo
    public void agregarIntegrante(Persona persona) {
        integrantes.add(persona);
    }

    // Getter para el nombre del equipo
    public String getNombre() {
        return nombre;
    }

    // Getter para la lista de integrantes
    public List<Persona> getIntegrantes() {
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
        System.out.println("Integrantes del Equipo:");
        for (Persona integrante : integrantes) {
            System.out.println("- " + integrante.getNombre());
        }
    }
    
    // Ejemplo de uso
    public static void main(String[] args) {
        EquipoDeTrabajo equipo = new EquipoDeTrabajo("Desarrolladores");
        Persona persona1 = new Persona("Juan","Perez", 21);
        Persona persona2 = new Persona("Ana","Lalo", 36);

        equipo.agregarIntegrante(persona1);
        equipo.agregarIntegrante(persona2);

        equipo.imprimirInformacionEquipo();
    }
}

