package ejercicio2;

import java.util.HashMap;
import java.util.Map;

public class Agenda {
	
	private Map<Telefono,Contacto> contactos;

	public Agenda() {
		
		this.contactos = new HashMap<Telefono,Contacto>();
		
	}
	
	public void nuevaEntrada(String numero,String nombre,String direccion) {
		
		Telefono t = new Telefono(numero);
		
		Contacto c = new Contacto(nombre,t,direccion);
		
		if (contactos.containsKey(t) == true || t.getTelefono() == "Formato no correcto") {
			System.out.println("Este telefono ya esta incluido o no tiene formato correcto");
		}else {
			contactos.put(c.getTelefono(),c);
			System.out.println("Nuevo contacto");
		}
		
	}
	
	public boolean esVacia () {
		return contactos.isEmpty();
	}
	
	public Contacto buscaContactoTelefono(String telefono) {
		Contacto resul = null;
		Telefono t = new Telefono (telefono);
	
		if (contactos.containsKey(t) == false) {
			System.out.println("ERROR el telefono introducido no se encuentra en la Agenda");
		}else {
			resul = contactos.get(t);
		}
		
		return resul;
	}
	
	public Contacto buscarContactoNombre(String nombre) {
		Contacto resul = null;
		
		for (Contacto c: contactos.values()) {
			if (c.getNombre().compareTo(nombre) == 0) {
				resul = c;
			}
		}
		
		return resul;
	}
	
	public void mostrarAgenda() {
		System.out.println("***********Telefonos dentro de la agenda*************\n");
		for (Contacto c: contactos.values()) {
			System.out.println(c.toString());
		}
	}
	
	
	

}
