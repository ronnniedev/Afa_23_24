package EjemHashMap;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Colegio {
	private Map<String,Personal> personas;
	
	public Colegio() {
		personas=new HashMap<String,Personal>();
	}
	
	public void añadir(Personal p) {
		if(personas.containsKey(p.getNombre())==false) {
			personas.put(p.getNombre(), p);
			System.out.println("Persona insertada");
		}else {
			System.out.println("ERROR al insertar persona");
		}
	}
	
	public void buscarPersona(String nombre) {
		Personal resul=personas.get(nombre);
		if(resul==null) {
			System.out.println("ERROR persona no encontrada");
		}else {
			System.out.println(resul.toString());
		}
		
	}
	
	public void mostrarColegio() {
		for(Personal act:personas.values()) {
			System.out.println(act.toString());
		}
	}
	
	public void borrarPersona(String nombre) {
		Personal p=personas.remove(nombre);
		
		if(p==null) {
			System.out.println("Persona no encontrada");
		}else {
			System.out.println("Persona eliminada");
		}
	}
}
