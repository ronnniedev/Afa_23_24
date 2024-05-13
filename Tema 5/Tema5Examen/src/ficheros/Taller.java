package ficheros;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Taller {
	
	private Map<Matricula,Vehiculo>vehiculos;
	private Set<Cliente> clientes;
	private List<Reparacion>reparaciones;
	public Taller() {
		super();
		this.vehiculos = new HashMap <Matricula,Vehiculo>();
		this.clientes = new TreeSet<Cliente>();
		this.reparaciones = new LinkedList<Reparacion>();
	}
	
	public void añadirVehiculos(Vehiculo v) {
		
		if (!vehiculos.containsKey(v.getMatricula())) {
			if (v.getMatricula().getMatricula() == null) {
				System.out.println("La matricula esta mal introducida, abortando introduccion");
			}else {
				vehiculos.put(v.getMatricula(), v);
				System.out.println("Vehiculo añadido con exito");
			}
		}else {
			System.out.println("Vehiculo ya introducido");
		}
	}
	
	public void mostrarVehiculos() {
		System.out.println("*******************Vehiculos en taller*********************");
		
		for(Vehiculo v: vehiculos.values()) {
			
			System.out.println(v.toString());
			
		}
		System.out.println("***********************************************************");
	}
	
	public void añadirClientes(Cliente c) {
		
		if (!clientes.contains(c)) {
			if (c.getDni() == "Dni mal introducido") {
				System.out.println("El dni ha sido mal introducido , abortando añadido");
			}else {
				clientes.add(c);
				System.out.println("Cliente añadido con exito");
			}
		}else {
			System.out.println("Cliente previamente introducido");
		}
		
	}
	
	public void mostrarClientes() {
		System.out.println("*******************Clientes en taller*********************");
		
		for(Cliente c: clientes) {
			
			System.out.println(c.toString());
			
		}
		System.out.println("***********************************************************");
	}
	
	public void añadirReparaciones(String dni,String matricula,String fecha) {
		Cliente c= new Cliente(dni,"Prueba","7381249");
		Matricula m = new Matricula(matricula);
		if (clientes.contains(c) && vehiculos.containsKey(m)) {
			Reparacion r = new Reparacion(dni,m,fecha);
			reparaciones.add(r);
			System.out.println("Añadido con exito");
		}else {
			System.out.println("Ha ocurrido un error");
		}
		
	}
	
	public void mostrarReparaciones() {
		System.out.println("*******************Reparaciones en taller*********************");
		
		for(int i = 0; i < reparaciones.size(); i++) {
			
			System.out.println(reparaciones.get(i).toString());
			
		}
		System.out.println("***********************************************************");
	}
	
	public void reparacionesPorCliente(String dni) {
		System.out.println("*******************Reparaciones de cliente " + dni + "*********************");
		Cliente c= new Cliente(dni,"Prueba","7381249");
		if (clientes.contains(c)) {
			for(int i = 0; i < reparaciones.size(); i++) {
				
				if (reparaciones.get(i).getDni().compareTo(dni) == 0) {
					
					System.out.println(reparaciones.get(i).toString());
					
				}
				
			}
		}else {
			System.err.println("El cliente introducido no se encuentra en la base de datos");
		}
		
		System.out.println("***********************************************************");
	}

}
