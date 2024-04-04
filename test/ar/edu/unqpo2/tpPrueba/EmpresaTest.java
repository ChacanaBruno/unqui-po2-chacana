package ar.edu.unqpo2.tpPrueba;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class EmpresaTest {
	List<Empleado> listaEmpleados = new ArrayList<>();
	List<ReciboDeHaberes> reciboDeHaberes = new ArrayList<>();
	Empresa empresa = new Empresa("MateArg", "20-777777-9", listaEmpleados, reciboDeHaberes);
	// instancia de EmpleadoPermanente 
	LocalDate fechaNacimiento = LocalDate.of(1990, 1, 1); // se asigna el "valor" de una fecha cualquiera
	EmpleadoPermanente empleadoJuanPermanente = new EmpleadoPermanente("Juan Perez", "20-12345678-9", "Soltero",
			fechaNacimiento, 30000.0, 2, 5, true);

	// instancia de EmpleadoTemporal 
	LocalDate fechaFinDeAsigcion = LocalDate.of(2024, 3, 27);
	EmpleadoTemporal empleadoRobertoTemporal = new EmpleadoTemporal("Roberto Lala", "20-12345678-9", "Soltero",
			fechaNacimiento, 30000.0, fechaFinDeAsigcion, 5);
	// instancia de EmpleadoPermanente 
	EmpleadoContratado empleadoContratado = new EmpleadoContratado(
		    "Leo Messi", // nombre
		    "20-87654321-9", // CUIT
		    "Soltero", // estado civil
		    LocalDate.of(1990, 5, 15), // fecha de nacimiento (Año, Mes, Día)
		    30000.0, // sueldo básico
		    "Calle Falsa 123", // dirección
		    "789", // número de contrato
		    "Transferencia bancaria" // medio de pago
		);
	
	@Test
	public static void main(String[] args) {
		// setUp

		List<Empleado> listaEmpleados = new ArrayList<>();
		List<ReciboDeHaberes> reciboDeHaberes = new ArrayList<>();

		Empresa empresa = new Empresa("MateArg", "20-777777-9", listaEmpleados, reciboDeHaberes);

		LocalDate fechaNacimiento = LocalDate.of(1990, 1, 1); // se asigna el "valor" de una fecha cualquiera
		EmpleadoPermanente empleadoJuanPermanente = new EmpleadoPermanente("Juan Perez", "20-12345678-9", "Soltero",
				fechaNacimiento, 30000.0, 2, 5, true);

		LocalDate fechaFinDeAsigcion = LocalDate.of(2024, 3, 27);
		EmpleadoTemporal empleadoRobertoTemporal = new EmpleadoTemporal("Roberto Lala", "20-12345678-9", "Soltero",
				fechaNacimiento, 30000.0, fechaFinDeAsigcion, 5);
		// Prueba de metodo
		empresa.agregarEmpleado(empleadoJuanPermanente);
		empresa.agregarEmpleado(empleadoRobertoTemporal);

		// test
		// test
		System.out.println("Empleados agregados a la empresa: " + empresa.getEmpleados().size());
		if (empresa.getEmpleados().size() == 2) {
			System.out.println("Test exitoso: Se han agregado correctamente los dos empleados.");
		} else {
			System.out.println("Test fallido: La cantidad de empleados agregados no es la esperada.");
		}

		for (Empleado empleado : empresa.getEmpleados()) {
			System.out.println(empleado);
		}

	}

	@Test
	public void testCalcularMontoParaSueldosNetosDeEmpleados() {

		// Crear y agregar empleados

		empresa.agregarEmpleado(empleadoJuanPermanente);

		// Calcular el monto total esperado para los sueldos netos

		double montoEsperado = empleadoJuanPermanente.calcularSueldoNeto();

		// Llamar al método a testear y usar assertEquals para verificar el resultado
		assertEquals(montoEsperado, empresa.calcularMontoParaSueldosNetosDeEmpleados(),
	
				"El monto total calculado para los sueldos netos de los empleados no es el esperado.");
	}

	@Test
	public void testCalcularMontoParaSueldosBrutosDeEmpleados() {

		// Crear y agregar empleados

		empresa.agregarEmpleado(empleadoJuanPermanente);
		empresa.agregarEmpleado(empleadoRobertoTemporal);

		// Calcular el monto total esperado para los sueldos netos

		double montoEmpleado1 = empleadoJuanPermanente.calcularSueldoBruto();
		double montoEmpleado2 = empleadoRobertoTemporal.calcularSueldoBruto();

		double montoEsperado = montoEmpleado1 + montoEmpleado2;

		// Llamar al método a testear y usar assertEquals para verificar el resultado
		assertEquals(montoEsperado, empresa.calcularMontoParaSueldosBrutosDeEmpleados(),
				"El monto total calculado para los sueldos netos de los empleados no es el esperado.");
	}

	@Test
	public void testCalcularMontoParaRetenciones() {

		// Crear y agregar empleados

		empresa.agregarEmpleado(empleadoJuanPermanente);

		// Calcular el monto total esperado para los sueldos netos

		double montoEsperado = empleadoJuanPermanente.calcularRetenciones();

		// Llamar al método a testear y usar assertEquals para verificar el resultado
		assertEquals(montoEsperado, empresa.calcularMontoParaRetencionesDeEmpleados(),

				"El monto total calculado para los sueldos netos de los empleados no es el esperado.");
	}

	@Test
	public void testRealizarLiquidacionDeSueldosConUnEmpleado() {
		double sueldoNeto = empleadoJuanPermanente.calcularSueldoNeto();
		double sueldoBruto = empleadoJuanPermanente.calcularSueldoBruto();

		empresa.agregarEmpleado(empleadoJuanPermanente);

		empresa.realizarLiquidacionDeSueldos();

		List<ReciboDeHaberes> recibos = empresa.getReciboDeHaberes();

		assertEquals(1, recibos.size(), "Debe haber un recibo generado");

		ReciboDeHaberes recibo = recibos.get(0);
		assertEquals("Juan Perez", recibo.getNombre(), "El nombre del empleado debe coincidir");
		assertEquals(LocalDate.now(), recibo.getFechaDeEmision(), "La fecha de emisión debe ser la actual");
		assertEquals(sueldoBruto, recibo.getSueldoBruto(), "El sueldo bruto debe coincidir");
		assertEquals(sueldoNeto, recibo.getSueldoNeto(), "El sueldo neto debe coincidir");
	}

	@Test
	public void testRealizarLiquidacionDeSueldosConDosEmpleados() {
		// Datos del primer empleado
		double sueldoNetoJuan = empleadoJuanPermanente.calcularSueldoNeto();
		double sueldoBrutoJuan = empleadoJuanPermanente.calcularSueldoBruto();

		// Datos del segundo empleado
		double sueldoNetoRoberto = empleadoRobertoTemporal.calcularSueldoNeto();
		double sueldoBrutoRoberto = empleadoRobertoTemporal.calcularSueldoBruto();

		// Agregar ambos empleados a la empresa
		empresa.agregarEmpleado(empleadoJuanPermanente);
		empresa.agregarEmpleado(empleadoRobertoTemporal);

		// Realizar la liquidación de sueldos
		empresa.realizarLiquidacionDeSueldos();

		// Obtener los recibos generados
		List<ReciboDeHaberes> recibos = empresa.getReciboDeHaberes();

		// Verificar que se hayan generado dos recibos
		assertEquals(2, recibos.size(), "Deben haber dos recibos generados");

		// Validar información del primer recibo
		ReciboDeHaberes reciboJuan = recibos.get(0);
		assertEquals("Juan Perez", reciboJuan.getNombre(), "El nombre del primer empleado debe coincidir");
		assertEquals(LocalDate.now(), reciboJuan.getFechaDeEmision(), "La fecha de emisión debe ser la actual");
		assertEquals(sueldoBrutoJuan, reciboJuan.getSueldoBruto(),
				"El sueldo bruto del primer empleado debe coincidir");
		assertEquals(sueldoNetoJuan, reciboJuan.getSueldoNeto(), "El sueldo neto del primer empleado debe coincidir");

		// Validar información del segundo recibo
		ReciboDeHaberes reciboRoberto = recibos.get(1);
		assertEquals("Roberto Lala", reciboRoberto.getNombre(), "El nombre del segundo empleado debe coincidir");
		assertEquals(LocalDate.now(), reciboRoberto.getFechaDeEmision(), "La fecha de emisión debe ser la actual");
		assertEquals(sueldoBrutoRoberto, reciboRoberto.getSueldoBruto(),
				"El sueldo bruto del segundo empleado debe coincidir");
		assertEquals(sueldoNetoRoberto, reciboRoberto.getSueldoNeto(),
				"El sueldo neto del segundo empleado debe coincidir");
	}
	
	@Test
	public void testCalcularMontoParaSueldosNetosDeLosTresTiposDeEmpleados() {

		// Crear y agregar empleados

		empresa.agregarEmpleado(empleadoJuanPermanente);
		empresa.agregarEmpleado(empleadoRobertoTemporal);
		empresa.agregarEmpleado(empleadoContratado);
		

		// Calcular el monto total esperado para los sueldos netos

		double montoEsperado = empleadoJuanPermanente.calcularSueldoNeto() + 
								empleadoRobertoTemporal.calcularSueldoNeto() + 
								empleadoContratado.calcularSueldoNeto();

		// Llamar al método a testear y usar assertEquals para verificar el resultado
		assertEquals(montoEsperado, empresa.calcularMontoParaSueldosNetosDeEmpleados(),
				"El monto total calculado para los sueldos netos de los empleados no es el esperado.");
	}

	@Test
	public void testRealizarLiquidacionDeSueldosConLosTresEmpleados() {
		// Datos del primer empleado
		double sueldoNetoJuan = empleadoJuanPermanente.calcularSueldoNeto();
		double sueldoBrutoJuan = empleadoJuanPermanente.calcularSueldoBruto();

		// Datos del segundo empleado
		double sueldoNetoRoberto = empleadoRobertoTemporal.calcularSueldoNeto();
		double sueldoBrutoRoberto = empleadoRobertoTemporal.calcularSueldoBruto();
		// Datos del TERCER empleado
		double sueldoNetoEmpleadoContratado = empleadoContratado.calcularSueldoNeto();
		double sueldoBrutoEmpleadoContratado  = empleadoContratado.calcularSueldoBruto();

		// Agregar ambos empleados a la empresa
		empresa.agregarEmpleado(empleadoJuanPermanente);
		empresa.agregarEmpleado(empleadoRobertoTemporal);
		empresa.agregarEmpleado(empleadoContratado);
		

		// Realizar la liquidación de sueldos
		empresa.realizarLiquidacionDeSueldos();

		// Obtener los recibos generados
		List<ReciboDeHaberes> recibos = empresa.getReciboDeHaberes();

		// Verificar que se hayan generado dos recibos
		assertEquals(3, recibos.size(), "Deben haber dos recibos generados");

		// Validar información del primer recibo
		ReciboDeHaberes reciboJuan = recibos.get(0);
		assertEquals("Juan Perez", reciboJuan.getNombre(), "El nombre del primer empleado debe coincidir");
		assertEquals(LocalDate.now(), reciboJuan.getFechaDeEmision(), "La fecha de emisión debe ser la actual");
		assertEquals(sueldoBrutoJuan, reciboJuan.getSueldoBruto(),
				"El sueldo bruto del primer empleado debe coincidir");
		assertEquals(sueldoNetoJuan, reciboJuan.getSueldoNeto(), "El sueldo neto del primer empleado debe coincidir");

		// Validar información del segundo recibo
		ReciboDeHaberes reciboRoberto = recibos.get(1);
		assertEquals("Roberto Lala", reciboRoberto.getNombre(), "El nombre del segundo empleado debe coincidir");
		assertEquals(LocalDate.now(), reciboRoberto.getFechaDeEmision(), "La fecha de emisión debe ser la actual");
		assertEquals(sueldoBrutoRoberto, reciboRoberto.getSueldoBruto(),
				"El sueldo bruto del segundo empleado debe coincidir");
		assertEquals(sueldoNetoRoberto, reciboRoberto.getSueldoNeto(),
				"El sueldo neto del segundo empleado debe coincidir");
		
		
		// Validar información del tercer recibo
		ReciboDeHaberes reciboEmpleadoContratado = recibos.get(2);
		assertEquals("Leo Messi", reciboEmpleadoContratado.getNombre(), "El nombre del segundo empleado debe coincidir");
		assertEquals(LocalDate.now(), reciboEmpleadoContratado.getFechaDeEmision(), "La fecha de emisión debe ser la actual");
		assertEquals(sueldoBrutoEmpleadoContratado, reciboEmpleadoContratado.getSueldoBruto(),
				"El sueldo bruto del segundo empleado debe coincidir");
		assertEquals(sueldoNetoEmpleadoContratado, reciboEmpleadoContratado.getSueldoNeto(),
				"El sueldo neto del segundo empleado debe coincidir");
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
