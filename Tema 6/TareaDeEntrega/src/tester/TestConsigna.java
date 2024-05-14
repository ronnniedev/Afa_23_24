package tester;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import excepciones.IncorrectAgeException;
import excepciones.IncorrectGenderException;
import excepciones.IncorrectLengthException;
import logica.Consigna;
import modelo.Genero;



public class TestConsigna {
	Consigna c = new Consigna("Pruebas");
	@BeforeEach
	void cargaDatos() {
		CargaDatos.cargaDatos(c);
	}
	
	@Test
	public void testComprobarDni() {
		assertTrue(Consigna.comprobarDni("73783768Q"));
		assertFalse(Consigna.comprobarDni("16236128A3"));
		assertFalse(Consigna.comprobarDni("73783768q"));
		assertFalse(Consigna.comprobarDni("737837689"));
		assertFalse(Consigna.comprobarDni("7378376A"));
	}
	
	@Test
	public void testComprobarGenero() throws IncorrectGenderException {
		assertTrue(Consigna.comprobarGenero("HOMBRE") == Genero.HOMBRE);
		assertTrue(Consigna.comprobarGenero("MUJER") == Genero.MUJER);
		assertTrue(Consigna.comprobarGenero("H1") == null);
	}
	
	@Test
	public void testComprobarEdad() throws IncorrectAgeException{
		
		assertThrows(IncorrectAgeException.class,()->Consigna.comprobarEdad(12));
		assertThrows(IncorrectAgeException.class,()->Consigna.comprobarEdad(121));
		assertTrue(Consigna.comprobarEdad(18));
		
	}
	
	@Test
	public void comprobarTelefono()throws IncorrectLengthException {
		
		assertThrows(IncorrectLengthException.class,()->Consigna.comprobarTelefono(98765733));
		assertThrows(IncorrectLengthException.class,()->Consigna.comprobarTelefono(1983123));
		assertTrue(Consigna.comprobarTelefono(985310664));
		
	}
	
	
}
