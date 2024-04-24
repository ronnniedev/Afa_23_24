package ejercicio2clase;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Agenda {

	private Map<Telefono,Contacto> agenda;

	public Agenda() {
		
		agenda = new HashMap <Telefono,Contacto>();
		
	}
	
	public boolean esVacia () {
		return agenda.isEmpty();
	}
	
	public void nuevaEntrada(String numero,String nombre,String direccion) {
		
		Contacto c= new Contacto(numero,nombre,direccion);
		
		if (c.getTelefono().getValor().compareTo("ERROR") == 0) {
			System.err.println("ERROR telefono incorrecto");
		}else {
			if (agenda.containsKey(c.getTelefono()) == true) {
				System.err.println("ERROR clave ya insertada");
			}else {
				agenda.put(c.getTelefono(), c);
				System.out.println("Nuevo contacto");
			}
		}
	}
	
	public Contacto buscarContactosTelefono(String numero) {
		Contacto resul = null;
		
		Telefono nuevo = new Telefono (numero);
		
		if (nuevo.getValor().compareTo("ERROR") == 0) {
			System.err.println("ERROR telefono incorrecto");
		}else {
			if(agenda.containsKey(nuevo)== false) {
				System.out.println("ERROR clave no incluida");
			}else {
				resul = agenda.get(nuevo);
			}
		}
		return resul;
	}
	
	public void mostrarAgenda() {
		System.out.println("************Telefonos en Agenda****************");
		System.out.println("Numeros de contactos: " + agenda.size());
		
		for (Contacto c: agenda.values()) {
			System.out.println(c.toString());
		}
	}
	
	public void mostrarAgenda_2 () {
		
		for (Entry<Telefono,Contacto> par:agenda.entrySet()) {
			System.out.println("Key:" + par.getKey().getValor());
			Contacto c = par.getValue();
			System.out.println("Value :" + c.toString());
		}
		
	}
	
	public Contacto buscarContactoNombre(String nombre) {
		Contacto resul = null;
		for (Contacto c: agenda.values()) {
			if (c.getNombre().compareTo(nombre)==0) {
				resul = c;
			}
		}
		return resul;
		
	}
	
}

	
