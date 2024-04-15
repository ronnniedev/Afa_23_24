package ejercicio1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;



public class Hotel {
	
	private Set<Habitacion>habitacion;
	private Set<Cliente>clientes;
	private Set<Reserva>reservas;
	
	public Hotel(int numHabitaciones) {
		habitacion = new TreeSet<Habitacion>();
		clientes = new HashSet<Cliente>();
		reservas = new HashSet<Reserva>();
		
		crearDatos(numHabitaciones);
	}
	
	public void crearDatos(int numHabitaciones) {
		int letra = 1;
		int cont = 1;

		for (int i = 0; i < numHabitaciones; i++) {
			if (letra == 4) {
				
				letra = 1;
				cont++;
			}
			
			char letraFinal = escogerLetra(letra);
			String carro = cont+""+letraFinal;
			
			
			Habitacion contenedor = new Habitacion (carro,escogerTipo());
			
			habitacion.add(contenedor);
		
			letra++;
		}
		
		
	}
	
	public char escogerLetra(int cont) {
		char letra = ' ';
		
		switch (cont) {
		
        case 1:
            letra = 'A';
            break;
        case 2:
            letra = 'B';
            break;
        case 3:
            letra = 'C';
            break;
        default:
            System.out.println("Este mensaje no deberia poder leerse");
    }
		
		return letra;
	}
	
	public TipoHabitacion escogerTipo() {
		TipoHabitacion tipo = null;
		
		int num = (int)(Math.random()*3);
		System.out.println(num);
		if (num == 0) {
			tipo = TipoHabitacion.DOBLE;
			
		}else if (num == 1){
			tipo = TipoHabitacion.SIMPLE;
			
		}else {
			tipo = TipoHabitacion.MATRIMONIAL;
			
		}
		
		return tipo;
	}
	public void cargarClientes() {
		Cliente c1 = new Cliente("Mauricio","53747281L","Villanueva",TipoCliente.ESPORADICO);
		Cliente c2 = new Cliente("C2","FDSAFDSFASDF","Villanueva6",TipoCliente.HABITUAL);
		Cliente c3 = new Cliente("C3","GSDAFFSFAG","Villanueva2",TipoCliente.HABITUAL);
		Cliente c4 = new Cliente("C4","ASGASFASF","Villanuev3a",TipoCliente.ESPORADICO);
		Cliente c5 = new Cliente("C5","FASFAGASF","Villanueva4",TipoCliente.ESPORADICO);
		Cliente c6 = new Cliente("C6","DSAFADSDAD","Villanueva5",TipoCliente.HABITUAL);
		clientes.add(c1);
		clientes.add(c2);
		clientes.add(c3);
		clientes.add(c4);
		clientes.add(c5);
		clientes.add(c6);
		
	}
	
	public void mostrarClientes() {
		System.out.println("\n---------------Clientes en el hotel---------------------");
		
		System.out.println(clientes.toString());
		
	}
	
	public void mostrarHabitaciones() {
		System.out.println("Habitaciones en el hotel");
		
			System.out.println(habitacion.toString());
		
	}
	
	public void mostrarHabitaciones(TipoHabitacion tipo) {
		System.out.println("\n ----------Habitaciones en el hotel que son " + tipo + " -------------------");
		
		for (Habitacion h: habitacion) {
			if (tipo == h.getTipo()) {
				System.out.println(h.toString());
			}
				
		}
		
	}
	public void mostrarDescuentos() {
		System.out.println("\n ----------Clientes con descuento" + "-------------------");
		
		for (Cliente c: clientes) {
			if (TipoCliente.HABITUAL == c.getTipo()) {
				System.out.println("Nombre: " + c.getNombre() + " Descuento:" + c.getDescuento());
			}
		}
	}
	
	public void mostrarPrecio(String codigo) {
		boolean encontrado = false;
		System.out.println("\nPrecio de la habitacion " + codigo);
		
		for (Habitacion h: habitacion) {
			if (codigo.compareTo(h.getCodigo()) == 0) {
				
				System.out.println("El precio es de " + h.getPrecio());
				encontrado = true;
			}
				
		}
		
		if (encontrado == false) {
			System.out.println("El codigo no existe en el hotel");
		}
		
		
	}
	
	public double calcularPrecio(String dni,TipoHabitacion tipo,int noches) {
		boolean encontrado = false;
		double precio = -1;
		double descuento = 0;
		
		int precioTipo = Habitacion.escogerPrecio(tipo);
		
		for (Cliente c: clientes) {
			if (c.getDni().compareTo(dni)==0) {
				descuento = c.getDescuento();
				encontrado = true;
			}
		}
		
		if (encontrado == false) {
			System.out.println("No existe el dni o tipo especificado");

		}
		
		if (precioTipo == -1) {
			System.out.println("El tipo introducido es erroneo");
		}
		
		if (encontrado && precioTipo != -1) {
			precio = (precioTipo - (precioTipo*descuento))*noches;
			System.out.println("El precio para el usuario con dni de " + dni + "sera de " + precio);
		}
		
		
		
		return precio;
		
	}
	
	public void crearReserva(String cod, String dni,String nombre,String apellidos) {
		boolean encontrado = false;
		Cliente comp = new Cliente(nombre,dni,apellidos,null);
		for (Cliente c: clientes) {
			if(c.equals(comp) && encontrado == false) { // pongo booleans para que no encuentre mas casos
				Habitacion hab = encontrarHabitacion(cod);
				if (hab == null) {
					System.out.println("No se ha podido encontrar la habitacion con ese codigo");
					
				}else {
					Reserva reserva = new Reserva(c,hab,"fecha ingreso",5); //añado la reserva
					reservas.add(reserva);
				}
				encontrado = true;
			}
		}
		
		if (encontrado == false) {
			System.out.println("El cliente especificado no existe");
		}
		
		
		
	}
	
	public Habitacion encontrarHabitacion(String cod) {
		Habitacion hab = null;
		boolean encontrado = false;
		
		for (Habitacion h: habitacion) {
			if (cod.compareTo(h.getCodigo()) == 0 && encontrado == false) {
				hab = h;
				encontrado = true;
			}
				
		}
		
		return hab;
	}
	
	public void eliminarReserva(String cod) {
		boolean encontrado = false;
		Reserva cont = null;
		for (Reserva r: reservas) {
			if (r.getH().getCodigo().compareTo(cod) == 0 && encontrado == false) {
				cont = r;
				System.out.println("Reserva eliminada");
				encontrado = true;
			}
			System.out.println("sali");
				
		}
		
		reservas.remove(cont);
		
	}
	
	public void cambiarDescuento(double Descuento) {
		
		for (Cliente c: clientes) {
			if (c.getTipo() == TipoCliente.HABITUAL) {
				c.setDescuento(Descuento);
			}
		}
		
	}
	
	public void mostrarReservas() {
		
		for (Reserva r: reservas) {
			System.out.println(r.toString());
				
		}
		
	}
	
}
