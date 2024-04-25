package Act2;

import java.util.HashMap;
import java.util.Map;

public class Agenda {
	private Map<Telefono,Contacto> contactos;
	
	public  Agenda() {
		contactos=new HashMap<Telefono,Contacto>();	
	}
	
	public boolean esVacia() {
		return contactos.isEmpty();
	}
	
	public void nuevaEntrada (String numero, String nombre,
			                                  String dirección) {
		if(Telefono.comprobarTelefono(numero)==false) {
			System.err.println("ERROR teelfono mal formado");
		}else {
			if(contactos.containsKey(new Telefono(numero))==true) {
				System.err.println("ERROR clave ya incluida");
			}else {
				Contacto c=new Contacto(nombre, numero, dirección);
				contactos.put(c.getTelefono(), c);
			}
		}
	}
	
	public void mostrarAgenda() {
		System.out.println("***********************************");
		System.out.println("Num de contactos "+contactos.size());
		for(Contacto c:contactos.values()) {
			System.out.println("\t"+c.toString());
		}
	}
	
	public Contacto buscaContactoTelefono(String numero) {
		Contacto resul=null;
		if(Telefono.comprobarTelefono(numero)==true) {
			resul=contactos.get(new Telefono(numero));
		}
		return resul;
	}
	
	public Contacto buscaContactoNombre(String nombre) {
		Contacto resul=null;
		for(Contacto c: contactos.values()) {
			if(c.getNombre().compareTo(nombre)==0) {
				resul=c;
			}
		}
		return resul;
	}

}
