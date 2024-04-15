package ejercicio1;

public class Main {
	
	public static void main(String[] args) {
		
		Hotel h = new Hotel(12);
		h.mostrarHabitaciones();
		h.mostrarHabitaciones(TipoHabitacion.DOBLE);
		h.mostrarHabitaciones(TipoHabitacion.MATRIMONIAL);
		h.mostrarHabitaciones(TipoHabitacion.SIMPLE);
		h.mostrarPrecio("1A");
		h.mostrarPrecio("3C");
		h.mostrarPrecio("4A");
		h.mostrarPrecio("12A");
		h.cargarClientes();
		h.mostrarClientes();
		h.mostrarDescuentos();
		h.calcularPrecio("FDSAFDSFASDF",TipoHabitacion.MATRIMONIAL , 5);
		h.calcularPrecio("FDSAFDSFdasdASDF",TipoHabitacion.SIMPLE , 5); // dara error por que no lo encuentra
		h.calcularPrecio("FASFAGASF",TipoHabitacion.MATRIMONIAL , 5);
		
		
		h.crearReserva("1A", "FDSAFDSFASDF", "C2", "Villanueva6");
		
		h.mostrarReservas();
		h.crearReserva("14A", "FDSAFDSFASDF", "C2", "Villanueva6"); // da error por que no existe la habitacion
		h.crearReserva("2A", "53747281L", "Mauricio", "Villanueva");
		h.mostrarReservas();
		
		h.eliminarReserva("2A");
		
		h.mostrarReservas();
		
		h.cambiarDescuento(0.3);
		
		h.calcularPrecio("FDSAFDSFASDF",TipoHabitacion.MATRIMONIAL , 5);
		h.calcularPrecio("FDSAFDSFdasdASDF",TipoHabitacion.SIMPLE , 5); // dara error por que no lo encuentra
		h.calcularPrecio("FASFAGASF",TipoHabitacion.MATRIMONIAL , 5);
		
		
	}
	
	

}
