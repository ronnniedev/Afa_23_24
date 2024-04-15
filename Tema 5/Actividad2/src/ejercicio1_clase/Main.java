package ejercicio1_clase;

public class Main {

	public static void main(String[] args) {
		
		Hotel hotel = new Hotel ();
		cargarDatos(hotel);
		hotel.mostrarClientes();
		hotel.mostrarHabitaciones();
		
		// pruebaErrrores(hotel);
		
		hotel.nuevaReserva("1111", "1A", 3);
		hotel.nuevaReserva("2222", "1B", 3);
		hotel.nuevaReserva("3333", "2A", 3);
		System.out.println("*************************");
		hotel.mostrarReservas();
		pruebaErrores(hotel);

	}
	
	public static  void cargarDatos(Hotel h) {
		
		h.añadirHabitacion(new Habitacion (1, 'A', 100,TipoHabitacion.SIMPLE));
		h.añadirHabitacion(new Habitacion (1, 'B', 150,TipoHabitacion.DOBLE));
		h.añadirHabitacion(new Habitacion (1, 'C', 120,TipoHabitacion.MATRIMONIAL));
		h.añadirHabitacion(new Habitacion (2, 'A', 100,TipoHabitacion.SIMPLE));
		h.añadirHabitacion(new Habitacion (2, 'B', 150,TipoHabitacion.DOBLE));
		h.añadirHabitacion(new Habitacion (2, 'C', 120,TipoHabitacion.MATRIMONIAL));
		
		h.añadirCliente(new Cliente("1111","pepe1","ape1"));
		h.añadirCliente(new Cliente("2222","pepe2","ape2"));
		h.añadirCliente(new Cliente("3333","pepe3","ape3"));
		h.añadirCliente(new Cliente("4444","pepe4","ape4"));
		
	}
	
	public static void pruebaErrores(Hotel hotel) {
		
		hotel.añadirHabitacion(new Habitacion (1, 'A', 120,TipoHabitacion.DOBLE));
		hotel.mostrarHabitaciones();
		hotel.añadirCliente(new Cliente("3333","XXXX","XXX"));
		hotel.nuevaReserva("XXXX", "1A", 3);
		hotel.nuevaReserva("1111", "3A", 3);
		hotel.nuevaReserva("2222", "1A", 1);
	}
	
	
}
