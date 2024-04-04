package ar.edu.unq.po2.tp3.EquipoDeTrabajoTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ar.edu.unq.po2.tp3.EquipoDeTrabajo.EquipoDeTrabajo;
import ar.edu.unq.po2.tp3.EquipoDeTrabajo.PersonaTrabajo;

public class EquipoDeTrabajoTest {
	@Test
	public void testIndicarPromedioDeEdadDeEquipo() {
		// Crear el equipo
		EquipoDeTrabajo equipo = new EquipoDeTrabajo("Equipo 1");
		// Añadir integrantes 
		
		equipo.agregarIntegrante(new PersonaTrabajo("Persona 1","apellido 1", 45));
		
		equipo.agregarIntegrante(new PersonaTrabajo("Persona 2","apellido 2", 35));
		
		equipo.agregarIntegrante(new PersonaTrabajo("Persona 3","apellido 3", 25));

		// Calcular y verificar el promedio de edad
		assertEquals(35, equipo.indicarPromedioDeEdadDeEquipo());
	}

	@Test
	public void testEquipoSinIntegrantes() {
		// Crear un equipo sin integrantes
		EquipoDeTrabajo equipo = new EquipoDeTrabajo("Equipo Vacío");

		// Verificar que el promedio de edad es 0
		assertEquals(0, equipo.indicarPromedioDeEdadDeEquipo());
	}
	
	@Test
    public void testAgregarPersonasAlEquipo() {
        // Crear el equipo de trabajo
        EquipoDeTrabajo equipo = new EquipoDeTrabajo("Equipo Prueba");
        
        // Instanciar y agregar 5 personas al equipo
		equipo.agregarIntegrante(new PersonaTrabajo("Persona 1","apellido 1", 45));
		
		equipo.agregarIntegrante(new PersonaTrabajo("Persona 2","apellido 2", 35));
		
		equipo.agregarIntegrante(new PersonaTrabajo("Persona 3","apellido 3", 25));

		equipo.agregarIntegrante(new PersonaTrabajo("Persona 4","apellido 4", 25));
		
		equipo.agregarIntegrante(new PersonaTrabajo("Persona 5","apellido 5", 25));
        
        // Verificar que el tamaño de la lista de integrantes es 5
        assertEquals(5, equipo.getIntegrantes().size());
    }
	
	
	
	
	
	
	
	
}
