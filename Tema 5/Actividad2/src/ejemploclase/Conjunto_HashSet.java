package ejemploclase;

import java.util.HashSet;
import java.util.Set;

public class Conjunto_HashSet {
	
	private Set<Persona>conjunto;
	
	public Conjunto_HashSet() {
		conjunto= new HashSet<Persona>();
	}
	
	public void añadirPersona(Persona p) {
		boolean resul = conjunto.add(p);
		if (true==resul) {
			System.out.println("Insertado conrrectamente");
		}else {
			System.out.println("ERROR al insertar");
		}
		
	}
	
	public void mostrarConjunto() {
		
		for (Persona p: conjunto) {
			System.out.println(p.toString());
			
		}
		
	}
	
	public void borrarPersona(Persona p) {
		if (conjunto.contains(p)==true) {
			if (conjunto.remove(p)==true) {
				System.out.println("Borrar correctamente");
			}else {
				System.out.println("Error al borrar");
			}
		}else {
			System.out.println("Error elemento no contenido");
		}
		
	}
	
	public void borrarPersona(int codBuscado) {
		Persona p= new Persona("",codBuscado);
		borrarPersona(p);
	}
}
