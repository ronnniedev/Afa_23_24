/**
 * 
 */
package ejercicio3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Test3 {

	@Test
	void testInsertarPersona() {
		Colegio colegio = new Colegio();
		assertTrue(colegio.numPersona()==0);
		
		Direccion dir1 = new Direccion ("Calle motriz", "Oviedo", 33207, "Portugal");
		Estudiante e1 = new Estudiante ("Mariano","Rajoy","38493294",dir1);
		boolean resul;
		
		resul = colegio.insertarPersona(e1);
		assertTrue(resul==true);
		assertTrue(colegio.numPersona()==1);
		assertTrue(colegio.buscarPersona(e1.getNif())!=null);
		
	}

	@Test
	void testBuscarPersona() {
		Colegio colegio = new Colegio();
		cargarDatos(colegio);
		
		Persona p = colegio.buscarPersona("3333");
		assertTrue(p!=null);
		Persona p1=colegio.buscarPersona("XXXX");
		assertTrue(p1==null);
		
	}

private static void cargarDatos(Colegio colegio) {
		
		Direccion d1 = new Direccion ("Calle motriz", "Oviedo", 33207, "Portugal");
		Direccion d2 = new Direccion ("d2", "Oviedo", 33207, "Portugal");
		
		Estudiante e1 = new Estudiante ("Mariano","Rajoy","38493294",d1);
		Estudiante e2 = new Estudiante ("e2","Rajoy","38493294",d1);
		
		Profesor p1 = new Profesor ("Ana","Por favor", "721847123", d2, "Ala derecha");
		Profesor p2 = new Profesor ("p2","Por favor", "721847123", d2, "Ala derecha");
		
		Persona v[] = new Persona [4];
		
		v[0] = p1;
		v[1] = p2;
		v[2] = e1;
		v[3] = e2;
		
		for (int i = 0; i < v.length; i++) {
			colegio.insertarPersona(v[i]);
		}
		
	}
}
