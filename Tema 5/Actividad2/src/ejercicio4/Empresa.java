package ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

	private List<Persona> personas;
	
	public Empresa() {
		
		this.personas = new ArrayList<Persona>();
	}
	
	public void listarPersonas() {
		System.out.println("*************Lista de personas**************");
		
		for (Persona p: personas) {
			System.out.println(p.toString());
		}
		
	}
	
	public void añadirPersona(Persona p) {
		personas.add(p);
	}

}
