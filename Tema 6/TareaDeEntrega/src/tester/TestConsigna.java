package tester;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;

import excepciones.DateException;
import excepciones.ErrorAtRemovingException;
import excepciones.IncorrectAgeException;
import excepciones.IncorrectGenderException;
import excepciones.IncorrectLengthException;
import excepciones.IncorrectNifException;
import logica.Consigna;
import modelo.Genero;
import modelo.Id;



public class TestConsigna {
	Consigna c = new Consigna("Pruebas");
	@AfterEach
	void cargaDatos() {
		CargaDatos.cargaDatos(c);
	}
	
	@Test
	public void testComprobarDni() throws IncorrectNifException {
		
		assertTrue(Consigna.comprobarDni("73783768Q")); // bien escrito
		assertThrows(IncorrectNifException.class,()->Consigna.comprobarDni("16236128A3")); 
		assertThrows(IncorrectNifException.class,()->Consigna.comprobarDni("73783768q")); 
		assertThrows(IncorrectNifException.class,()->Consigna.comprobarDni("737837689"));  
		assertThrows(IncorrectNifException.class,()->Consigna.comprobarDni("7378376A")); 
		
	}
	
	@Test
	public void testComprobarGenero() throws IncorrectGenderException {
		assertTrue(Consigna.comprobarGenero("HOMBRE") == Genero.HOMBRE); //bien escritos
		assertTrue(Consigna.comprobarGenero("MUJER") == Genero.MUJER);
		assertThrows(IncorrectGenderException.class,()->Consigna.comprobarGenero("H")); // mal escritos
	}
	
	@Test
	public void testComprobarEdad() throws IncorrectAgeException{
		
		assertThrows(IncorrectAgeException.class,()->Consigna.comprobarEdad(12)); //fuera de rango
		assertThrows(IncorrectAgeException.class,()->Consigna.comprobarEdad(121));
		assertTrue(Consigna.comprobarEdad(18));
		
		
	}
	
	@Test
	public void comprobarTelefono()throws IncorrectLengthException {
		
		assertThrows(IncorrectLengthException.class,()->Consigna.comprobarTelefono(98765733)); //mala longitud
		assertThrows(IncorrectLengthException.class,()->Consigna.comprobarTelefono(1983123)); 
		assertTrue(Consigna.comprobarTelefono(985310664));
		
	}
	
	@Test
	public void comprobarEliminarElementos() throws ErrorAtRemovingException {
		CargaDatos.cargaDatos(c);
		assertThrows(ErrorAtRemovingException.class,()->c.eliminarElementos("C4")); //no se encuentra
		assertThrows(ErrorAtRemovingException.class,()->c.eliminarElementos("5"));	// mal introducida
		assertTrue(c.eliminarElementos("E2")); //se eliminan correctamente
		assertTrue(c.eliminarElementos("O1"));
		
	}
	
	@Test
	public void comprobarBuscarEmpleados(){
		CargaDatos.cargaDatos(c);
		assertTrue(c.buscarEmpleados("E1")!=null);
		assertTrue(c.buscarEmpleados("O2")==null);
		
	}
	
	@Test
	public void comprobarBuscarConsignaciones(){
		CargaDatos.cargaDatos(c);
		assertTrue(c.buscarConsignaciones("a")==null);
		assertTrue(c.buscarConsignaciones("O2")!=null);
		assertTrue(c.buscarConsignaciones("E1")==null);
	}
	
	@Test
	public void comprobarSetFecha() throws DateException {
		CargaDatos.cargaDatos(c);
		Id o1 = new Id ("O1"); //creams las ids
		Id e2 = new Id ("E2");
		assertTrue(c.setFecha(o1));
		assertThrows(DateException.class,()->c.setFecha(o1)); //este deposito ya ha sido extraido
		assertThrows(DateException.class,()->c.setFecha(e2)); //id no alojada en el conjunto
	}
	
	
}
