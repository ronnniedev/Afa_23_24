package ejemploclase2;


import java.util.Set;
import java.util.TreeSet;

public class Conjunto_TreeSet {
	
	private Set<PersonaTree>conjunto;
	
	public Conjunto_TreeSet() {
		conjunto= new TreeSet<PersonaTree>();
	}
	
	public void añadirPersona(PersonaTree p) {
		boolean resul = conjunto.add(p);
		if (true==resul) {
			System.out.println("Insertado conrrectamente");
		}else {
			System.out.println("ERROR al insertar");
		}
		
	}
	
	public void mostrarConjunto() {
		
		for (PersonaTree p: conjunto) {
			System.out.println(p.toString());
			
		}
		
	}
	
	public void borrarPersona(PersonaTree p) {
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
		PersonaTree p= new PersonaTree("",codBuscado);
		borrarPersona(p);
	}
}
