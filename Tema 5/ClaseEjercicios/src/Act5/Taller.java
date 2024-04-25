package Act5;

import java.util.HashMap;
import java.util.Map;

public class Taller {
	private Map<String,Cliente> clientes;
	
	public Taller() {
		clientes=new HashMap<String,Cliente>();
	}
	
	public void añadirCliente(Cliente c) {
		//control de errores
		if(clientes.containsKey(c.getDni())==true){
			System.out.println("ERROR dni ya incluido");
		}else {
			clientes.put(c.getDni(), c);
			System.out.println("Cliente insertado");
		}	
	}
	
	
	public void añadirCliente2(Cliente c) {
		if(clientes.put(c.getDni(), c)==null) {
			System.out.println("ERROR cliente no insertado");
		}else {
			System.out.println("Ciente insertado");
		}
	}
	
	
	public void añadirCliente3(Cliente c) {
		if(clientes.get(c.getDni())!=null) {
			System.out.println("ERROR dni ya asociado a un cliente");
		}else {
			clientes.put(c.getDni(), c);
			System.out.println("clietne isnertado");
		}
	}
	
	public void mostrarClientes() {
		for(Cliente c:clientes.values()) {
			System.out.println(c.toString());
		}
	}
	
	public void borrarCliente(String dni) {
		Cliente c=clientes.remove(dni);
		if(c==null) {
			System.out.println("ERROR dni no encontrado");
		}else {
			System.out.println("Cliente eliminado");
		}
		
	}
	
	
}





