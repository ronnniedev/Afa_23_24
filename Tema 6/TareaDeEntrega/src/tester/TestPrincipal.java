package tester;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import interfaz.Principal;
import logica.Consigna;

public class TestPrincipal {

	Consigna c = new Consigna("Pruebas");
	@BeforeEach
	public void cargaDatos() {
		CargaDatos.cargaDatos(c);
	}
	
	@Test
	public void eliminarCliente() {
		CargaDatos.cargaDatos(c);
		assertTrue(Principal.eliminarCliente("C1"));
		assertFalse(Principal.eliminarCliente("E2"));
	}
	
	@Test
	public void buscarCliente() {
		
		CargaDatos.cargaDatos(c);
		assertTrue(Principal.buscarClientes("C2") != null);
		assertTrue(Principal.buscarClientes("E2") == null);
	}
	
}
