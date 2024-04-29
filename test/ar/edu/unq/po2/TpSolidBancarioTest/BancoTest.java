package ar.edu.unq.po2.TpSolidBancarioTest;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class BancoTest {
	protected Banco banco;
	protected Cliente cliente;
	protected List<Cliente> clientesDelBanco;
	protected List<Verificable> solicitudesPenditeVerificaicon;
	protected int edad;
	protected double sueldoMensual;
	protected double sueldoAnual;


	@BeforeEach
	public void setUp() {
	    sueldoMensual = 1.0;
	    sueldoAnual = 12.0;

	    banco = new Banco(clientesDelBanco, solicitudesPenditeVerificaicon);
	    cliente = new Cliente("Diego", "Maradona", "Fiorito", 50, sueldoMensual, sueldoAnual);
	}


	@Test
	public void testCuandoUnBancoNuevoRegistraAUnClienteLaCantidadDeRegistradoEsUno() {

		// exercise
		banco.agregarCliente(cliente);

		assertEquals(1, banco.clientesDelBanco.size(), "La cantidad de clientes es deberia ser 1");
	}
	
	
	

	
	
}



