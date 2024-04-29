package EjemHashSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Colegio {
	private Set<Personal> personas;
	
	public Colegio() {
		personas=new HashSet<Personal>();
	}
	
	public void añadir(Personal p) {
		if(personas.add(p)==true) {
			System.out.println("Persona insertada");
		}else {
			System.out.println("ERROR al insertar persona");
		}
	}
	
	public void buscarPersona(String nombre) {
		Personal resul=null;
		for(Personal p:personas) {
			if(p.getNombre().compareTo(nombre)==0) {
				resul=p;
			}
		}
		if(resul==null) {
			System.out.println("ERROR persona no encontrada");
		}else {
			System.out.println(resul.toString());
		}
		
	}
	
	public void buscarPersona_2(String nombre) {
		Personal p=new Personal(nombre);
		
		boolean resul=personas.contains(nombre);
		if(resul==false) {
			System.out.println("ERROR persona no encontrada");
		}else {
			System.out.println("Persona encontrada");
		}
		
	}
	
	public void mostrarColegio() {
		for(Personal act:personas) {
			System.out.println(act.toString());
		}
	}
	
	public void borrarPersona(String nombre) {
		Personal p=new Personal(nombre);
		boolean resul = personas.remove(p);
		
		if(resul==false) {
			System.out.println("Persona no encontrada");
		}else {
			System.out.println("Persona eliminada");
		}
	}
}
