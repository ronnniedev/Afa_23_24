package ejercicio5;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Taller {

	private Map <Dni,Cliente>clientes;
	private Map <Matricula,Vehiculo> vehiculos;
	private List <Reparacion> reparaciones;
	public Taller() {
		
		this.clientes = new HashMap <Dni,Cliente>();
		this.vehiculos = new HashMap <Matricula,Vehiculo>();
		this.reparaciones = new LinkedList<Reparacion>();
		
	}
	
	public void insertarVehiculo(Vehiculo v) {
		
		Matricula m = new Matricula(v.getMatricula());
		
		if (!vehiculos.containsKey(m)) {
			vehiculos.put(m, v);
			System.out.println("Añadido con exito");
		}else {
			System.out.println("Ya se encuentra dentro de el array");
		}
		
	}
	
	public void insertarCliente(Cliente c) {
		
		Dni d = new Dni(c.getDni());
		
		if (!clientes.containsKey(d)) {
			clientes.put(d, c);
			System.out.println("Añadido con exito");
		}else {
			System.out.println("Ya se encuentra dentro de el array");
		}
		
	}
	
	public void insertarReparacion(String dni,String matricula) {
		
		Dni d = new Dni(dni);
		Matricula m = new Matricula(matricula);
		boolean dniCorrecto = true;
		boolean matriculaCorrecta = true;
		
		if(!clientes.containsKey(d)) {
			System.out.println("Este cliente no se encuentra en la base de datos");
			dniCorrecto = false;
		}
		
		if (!vehiculos.containsKey(m)) {
			System.out.println("El vehiculo no se encuentra en la base de datos");
			matriculaCorrecta = false;
		}
		
		if (matriculaCorrecta && dniCorrecto) {
			Reparacion r = new Reparacion(dni,matricula);
			reparaciones.add(r);
		}
		
	}
	
	public void mostrarDatos() {
		System.out.println("****Datos del Taller****");
		System.out.println("\n *********Vehiculos*********");
		for (Vehiculo v: vehiculos.values()) {
			System.out.println(v.toString());
		}
		System.out.println("\n *********Clientes*********");
		for (Cliente c: clientes.values()) {
			System.out.println(c.toString());
		}
		System.out.println("\n *********Reparaciones*********");
		for (Reparacion r: reparaciones) {
			System.out.println(r.toString());
		}
	}
	
	public void reparacionesPorCliente(String dni) {
		Dni d = new Dni(dni);
		if (clientes.containsKey(d)) {
			System.out.println("******Reparaciones del cliente" + clientes.get(d).getNombre() +"******" );
			for (Reparacion r: reparaciones) {
				if (dni.compareTo(r.getDni()) == 0) {
					System.out.println(r.toString());
				}
			}
		}else {
			System.out.println("Este cliente no esta registrado");
		}
		
		
	}
	
	public void reparacionesPorVehiculo(String matricula) {
		Matricula m = new Matricula(matricula);
		if (vehiculos.containsKey(m)) {
			System.out.println("******Reparaciones del vehivulo" + vehiculos.get(m).getModelo() +"******" );
			for (Reparacion r: reparaciones) {
				if (matricula.compareTo(r.getMatricula()) == 0) {
					System.out.println(r.toString());
				}
			}
		}else {
			System.out.println("Este  vehiculo no esta registrado");
		}
		
		
	}
	
}
