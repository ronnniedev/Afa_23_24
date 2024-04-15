package ejercicio4clase;

import java.util.LinkedList;
import java.util.List;

public class Empresa {
	
	private List<Persona> personas;
	public Empresa() {
		personas = new LinkedList<Persona>();
	}

	public void añadirPersona (Persona p) {
		personas.add(p);
		
	}
	
	public void mostrarPersonas() {
		for (Persona p: personas) {
			System.out.println(p.toString());
			
		}
		
	}
}
