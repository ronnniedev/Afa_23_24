/**
 * 
 */
package ficheros;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */
class PruebasTest {
	
	Consigna con1 = new Consigna ("Consigna en pruebas");
	Pruebas p1 = new Pruebas();
	
	
	/**
	 * Test method for {@link ficheros.Pruebas#visualizarClientes(ficheros.Consigna)}.
	 */
	@Test
	void testVisualizarClientes() {
		Pruebas.cargaDatos(con1);
		assertTrue(p1.visualizarClientes(con1));
		
	}
	
	void testVisualizarClientes2() {
		Pruebas.cargaDatos(con1);
		assertTrue(p1.visualizarClientes(con1));
		
	}
	
	void testVisualizarClientes3() {
		Pruebas.cargaDatos(con1);
		Cliente c8 = null;
		assertTrue(p1.visualizarClientes(con1));
		
	}

	/**
	 * Test method for {@link ficheros.Pruebas#buscarClientes(java.lang.String)}.
	 */
	@Test
	void testBuscarClientes() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link ficheros.Pruebas#eliminarCliente(ficheros.Cliente)}.
	 */
	@Test
	void testEliminarCliente() {
		fail("Not yet implemented");
	}

}
