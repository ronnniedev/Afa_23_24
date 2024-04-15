package ejercicio1_clase;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Hotel {
	
	private Set<Habitacion> habitaciones;
	private Set<Cliente> clientes;
	private List<Reserva> reservas;
	
	public Hotel() {
		habitaciones = new TreeSet<Habitacion>();
		clientes = new HashSet<Cliente>();
		reservas = new ArrayList<Reserva>();
	}
	
	public void añadirHabitacion(Habitacion h) {
		boolean resul = habitaciones.add(h);
		if(resul == true) {
			System.out.println("Habitacion bien insertada");
		}else {
			System.out.println("ERROR habitacion no insertada");
		}
		
	}
	
	public void mostrarHabitaciones() {
		for (Habitacion h: habitaciones) {
			System.out.println(h.toString());
		}
		
	}
	
	public void añadirCliente(Cliente c) {
		boolean resul = clientes.add(c);
		if(resul == true) {
			System.out.println("Cliente bien insertada");
		}else {
			System.out.println("ERROR cliente no insertada");
		}
		
	}
	
	public void mostrarClientes() {
		for (Cliente c: clientes) {
			System.out.println(c.toString());
		}
		
	}
	
	public void nuevaReserva(String dni,String codHab,int dias) {
		Cliente c = buscarCliente(dni);
		Habitacion h = buscarHabitacion(codHab);
		if (c == null) {
			System.out.println("Cliente no encontrado");
		}else {
			if (h == null) {
				System.out.println("Habitacion no encontrada");
			}else {
				if (h.isEstaReservada()==true) {
					System.out.println("La habitacion esta reservada");
				}else {
					// cliente encontrado y habitacion encontrada y disponible
					Reserva r = new Reserva(c,h,dias);
					reservas.add(r);
				}
			}
		}
		
	}
	
	public void mostrarReservas() {
		for (Reserva r: reservas) {
			System.out.println(r.toString());
			
		}
	}
	public Habitacion buscarHabitacion(String codHab) {
		Habitacion resul = null;
		for (Habitacion h: habitaciones) {
			if (h.getCodigo().compareTo(codHab)==0) {
				resul = h;
			}
		}
		return resul;
		
	}
	
	public Cliente buscarCliente(String dni) {
		Object v[]= clientes.toArray();
		Cliente resul = null;
		for(int i= 0; i < v.length && resul == null; i++) {
			Cliente c = (Cliente) v[i];
			if (c.getDni().compareTo(dni)==0) {
				resul = c;
			}
		}
		return resul;
	}
	

}
