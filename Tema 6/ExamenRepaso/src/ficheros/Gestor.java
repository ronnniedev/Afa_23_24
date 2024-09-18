package ficheros;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;

public class Gestor {

	private Map <Matricula,Autobus> autobuses;
	private Set <Cliente> clientes;
	private List <Alquiler> alquileres;
	
	public Gestor() {
		
		this.autobuses = new HashMap<Matricula,Autobus>();
		this.clientes = new TreeSet<Cliente>();
		this.alquileres = new ArrayList<Alquiler>();
		
	}
	public char[] listarAlquileresAutobus(String string) {
		
		return null;
	}

	public void addCliente(Cliente cliente) throws ExamenException {
		Cliente c = cliente;
		
		if(clientes.contains(c)) {
			throw new ExamenException("Cliente ya registrado");
			
		}else {
			clientes.add(c);
		}
		
	}

	public void addAutobus(Autobus autobus) throws ExamenException {
		
		if(autobuses.containsKey(autobus.getMatricula())) {
			throw new ExamenException("Autobus ya registrado");
			
		}
	}

	public void alquilarAutocar(String string, String string2, String string3, int i, int j) {
		
	}

	public char[] listarTodosLosAutobuses() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
