/**
 * 
 */
package ficheros;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */
class ConsignaTest {

	/**
	 * Test method for {@link ficheros.Consigna#eliminarElementos(java.lang.String)}.
	 */
	

	public static void cargaDatos(Consigna con) {
		
		Consignacion.setNumConsignaciones(0);
		Empleado.setNumCreaciones(0);
		Cliente.setNumCreaciones(0);
		Empleado e1 = new Empleado("Diego","De los Rios", "58799021Q", 987654321,Genero.HOMBRE,21);
		Empleado e2 = new Empleado("Maria","Remilgos", "84937023L", 638172937,"Jaimita@gmail.com",Genero.MUJER,19);
		Empleado e3 = new Empleado("Manuel","Franchesco", "98671223M", 692123417,Genero.HOMBRE,38);
		Cliente c1 = new Cliente("Marina","Ramirez", "623574890M", 73279873,"marina@gmail.com",Genero.MUJER,67);
		Pruebas.añadirClientes(c1);
		Cliente c2 = new Cliente("Eric","Gonzalez", "348917289Ñ", 896432789,Genero.HOMBRE,36);
		Pruebas.añadirClientes(c2);
		Cliente c3 = new Cliente("Marisa","Meniscos", "372134678M", 985320654,"correoEstandar@gmail.com"
								,Genero.MUJER,17);
		Pruebas.añadirClientes(c3);
		con.añadirElementos(c1, 1,"Reloj diamantino,mochila skitty,Gafas recfacheras",3, "03/03/2024");
		con.añadirElementos(c2, 3,"Ordenador Gygabyte",1, "05/03/2024");
		con.añadirElementos(c3, 2,"Mochila portatil,chaqueta cara",2, "03/03/2024");
		con.añadirElementos(e1);
		con.añadirElementos(e2);
		con.añadirElementos(e3);
		
	}

	
	@Test
	void testEliminarElementos1() {
		Consigna con = new Consigna("Consigna en pruebas");
		cargaDatos(con);
	
		int contEmpleados = con.getNumEmpleados();
		int contConsignaciones = con.getNumConsignaciones();
		
		con.eliminarElementos("O3");
		assertTrue(con.getNumConsignaciones() == contConsignaciones-1 );
		
		con.eliminarElementos("E2");
		assertTrue(con.getNumEmpleados() == contEmpleados-1 
			|| con.getNumConsignaciones() == contConsignaciones-1 );
		
	}
	
	@Test
	void testEliminarElementos2() {
		Consigna con = new Consigna("Consigna en pruebas");
		cargaDatos(con);
	
		int contEmpleados = con.getNumEmpleados();
		int contConsignaciones = con.getNumConsignaciones();
		
		con.eliminarElementos("abc");
		assertFalse(con.getNumEmpleados() == contEmpleados-1 
				|| con.getNumConsignaciones() == contConsignaciones-1 );
		
		
	}

	@Test
	void testEliminarClientes() {
		Consigna con = new Consigna("Consigna en pruebas");
		cargaDatos(con);

		Cliente c = Pruebas.localizarCliente("C1");
			
			
			int contClientes = Pruebas.getNumClientes();
			Pruebas.eliminarCliente(c);
			assertTrue(Pruebas.getNumClientes() == contClientes - 1);
			c = Pruebas.localizarCliente("C5");
			
			assertFalse(c != null);
			//no se puede probar al ser null
	}
	
	
	@Test
	void testBuscarClientes() {
		Consigna con = new Consigna("Consigna en pruebas");
		cargaDatos(con);
		
		assertTrue(Pruebas.buscarClientes("C2"));
		assertFalse(Pruebas.buscarClientes("C4"));
		
		
	}

	@Test
	void testBuscarElementos() {
		Consigna con = new Consigna("Consigna en pruebas");
		cargaDatos(con);
		
		assertTrue(con.buscarElementos("E2"));
		assertFalse(con.buscarElementos("AHSDAS"));
		assertTrue(con.buscarElementos("O2"));
		
	}
	
	@Test
	void testAñadirElementos() {
		Consigna con = new Consigna("Consigna en pruebas");
		cargaDatos(con);
		
		int contConsignaciones = con.getNumConsignaciones();
		
		Cliente c4 = new Cliente("Eric","Gonzalez", "348917289Ñ", 896432789,Genero.HOMBRE,36);
		con.añadirElementos(c4, 1,"Reloj diamantino,mochila skitty,Gafas recfacheras",3, "03/03/2024");
		assertTrue(contConsignaciones == con.getNumConsignaciones()-1);
		
		contConsignaciones = con.getNumConsignaciones();
		assertFalse(contConsignaciones == con.getNumConsignaciones()-1);
		
		int contEmpleados = con.getNumEmpleados();
		Empleado e4 = new Empleado("Manuel","Franchesco", "98671223M", 692123417,Genero.HOMBRE,38);
		con.añadirElementos(e4);
		assertTrue(contEmpleados == con.getNumEmpleados()-1);
		
		contEmpleados = con.getNumEmpleados();
		assertFalse(contEmpleados == con.getNumEmpleados()-1);
		
		int contClientes = Pruebas.numClientes;
		Cliente c5 = new Cliente("Eric","Gonzalez", "348917289Ñ", 896432789,Genero.HOMBRE,36);
		Pruebas.añadirClientes(c5);
		assertTrue(contClientes == Pruebas.numClientes-1);
		
		contClientes= con.getNumEmpleados();
		assertFalse(contClientes == Pruebas.numClientes-1);
		
	}
	
	@Test
	void testActualizarFecha() {
		Consigna con = new Consigna("Consigna en pruebas");
		cargaDatos(con);
		String fechaBase= "25/4/25";
		String fechaIntroducida = con.actualizarFecha(con.buscarPosElementos("O1"),fechaBase);
	
		assertEquals(fechaIntroducida,fechaBase);
		
		fechaIntroducida = con.actualizarFecha(con.buscarPosElementos("O1"),fechaBase);
		
		assertEquals(fechaIntroducida,null);
		
		fechaIntroducida = con.actualizarFecha(con.buscarPosElementos("E1"),fechaBase);
		
		assertEquals(fechaIntroducida,null);
		
		
	}
	
	
}
