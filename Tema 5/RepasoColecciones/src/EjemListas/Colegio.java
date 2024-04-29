package EjemListas;

import java.util.ArrayList;
import java.util.List;

public class Colegio {
	private List<Personal> personas;
	
	public Colegio() {
		personas=new ArrayList<Personal>();
	}
	
	public void añadir(Personal p) {
		if(personas.add(p)==true) {
			System.out.println("Persona insertada");
		}else {
			System.out.println("ERROR al insertar persona");
		}
	}
	
	public void buscarPersona(String nombre) {
		Personal p=null;
		for(int i=0;i<personas.size() && p==null; i++) {
			Personal act=personas.get(i);
			if(act.getNombre().compareTo(nombre)==0) {
				p=act;
			}
		}
		if(p==null) {
			System.out.println("Persona no encontrada");
		}else {
			System.out.println(p.toString());
		}
	}
	
	public void mostrarColegio() {
		for(Personal act:personas) {
			System.out.println(act.toString());
		}
	}
	
	public void borrarPersona(String nombre) {
		int pos=-1;
		for(int i=0;i<personas.size() && pos==-1; i++) {
			Personal act=personas.get(i);
			if(act.getNombre().compareTo(nombre)==0) {
				personas.remove(i);
				pos=i;
			}
		}
		if(pos==-1) {
			System.out.println("Persona no encontrada");
		}else {
			System.out.println("Persona eliminada");
		}
	}
}
