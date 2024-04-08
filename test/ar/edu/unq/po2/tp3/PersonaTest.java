package ar.edu.unq.po2.tp3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Persona;

import java.time.LocalDate;

public class PersonaTest {

    @Test
    public void testMenorQueVerdadero() {
        // Crear dos personas, donde la primera es menor que la segunda
        Persona persona1 = new Persona("Juan", LocalDate.of(1990, 5, 24));
        Persona persona2 = new Persona("Ana", LocalDate.of(1992, 8, 15));

        // Verificar que persona2 es menor que persona1
        Assertions.assertTrue(persona2.menorQue(persona1));
    }

    @Test
    public void testMenorQueFalso() {
        // Crear dos personas, donde la primera NO es menor que la segunda
        Persona persona1 = new Persona("Ana", LocalDate.of(1992, 8, 15));
        Persona persona2 = new Persona("Juan", LocalDate.of(1990, 5, 24));

        // Verificar que persona2 NO es menor que persona1
        Assertions.assertFalse(persona2.menorQue(persona1));
    }

    @Test
    public void testMenorQueConIgualEdad() {
        // Crear dos personas con la misma fecha de nacimiento
        Persona persona1 = new Persona("Persona1", LocalDate.of(1990, 5, 24));
        Persona persona2 = new Persona("Persona2", LocalDate.of(1990, 5, 24));

        // Verificar que persona1 NO es menor que persona2 cuando tienen la misma edad
        Assertions.assertFalse(persona1.menorQue(persona2));
    }
}
