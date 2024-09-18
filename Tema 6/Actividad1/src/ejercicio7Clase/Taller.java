package ejercicio7Clase;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Taller {
	private List<Reparacion> reparaciones;
	private Set<Cliente> clientes;
	private Map<Matricula,Vehiculo> vehiculos;

	public Taller() {
		vehiculos= new HashMap<Matricula,Vehiculo>();
		reparaciones = new LinkedList<Reparacion>();
		clientes = new TreeSet<Cliente>();
	}
	
	public void añadirReparacion(String matricula, String dni,String fecha) throws LogicaException, FormatoException {
		Cliente c = new Cliente(dni);
		Matricula m = new Matricula(matricula);
		
		if(!vehiculos.containsKey(m)) {
			throw new LogicaException("Error vehiculo no encontrado");
			
		}
		
		Reparacion r = new Reparacion(dni,m,fecha);
		reparaciones.add(r);
		
	}
	
	public String listarReparaciones() {
	String texto = "Reparaciones :" + reparaciones.size() + "\n";
	
	for (int i = 0; i < reparaciones.size();i++) {
		texto += reparaciones.get(i).toString()+"\n";
	}
	
	return texto;
}

}
