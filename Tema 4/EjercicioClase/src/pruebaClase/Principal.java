package pruebaClase;

import java.util.Scanner;

public class Principal {
	static Scanner keyboard=new Scanner(System.in);
	public static void main(String[] args) {
		
		Hotel hotel = new Hotel ();
		
		Habitacion h1 = new Habitacion (1, 1, "Simple", 100.5 , true , false);
		Habitacion h2 = new Habitacion (2, 1, "Simple", 100.5 , false , false);
		Habitacion h3 = new Habitacion (3, 1, "Simple", 100.5 , false , true);
		Habitacion h4 = new Habitacion (4, 2, "Doble", 150.5 , false, false);
		Habitacion h5 = new Habitacion (5, 2, "Doble", 150.5 , false , true);
		Habitacion h6 = new Habitacion (6, 2, "Doble", 150.5 , true , true);
		Habitacion h7 = new Habitacion (7, 3, "Matrimonial", 200.5 , true , false);
		Habitacion h8 = new Habitacion (8, 3, "Matrimonial", 200.5 , true , false);
		Habitacion h9 = new Habitacion (9, 3, "Especial", 300.5 , false , true);
		Habitacion h10 = new Habitacion (10, 4, "Especial", 300.5 , true , true);
		
		
		hotel.nuevaHabitacion(h1);
		hotel.nuevaHabitacion(h2);
		hotel.nuevaHabitacion(h3);
		hotel.nuevaHabitacion(h4);
		hotel.nuevaHabitacion(h5);
		hotel.nuevaHabitacion(h6);
		hotel.nuevaHabitacion(h7);
		hotel.nuevaHabitacion(h8);
		hotel.nuevaHabitacion(h9);
		hotel.nuevaHabitacion(h10);
		hotel.nuevaHabitacion(h10); // este dara un mensaje de error para ver que efectivamente no se puede añadir 
		// habitaciones
		
		hotel.listarHabitaciones();
		
		hotel.borrarHabitacion(3);
		hotel.borrarHabitacion(11); //este dara un mensaje de error por no encontrarla
		
		
		hotel.listarHabitaciones(); //muestra las habitaciones tras el borrado
		
		hotel.habitacionesDisponibles();
		
		
		hotel.obtenerPrecio(1);
		hotel.obtenerPrecio(7);
		hotel.obtenerPrecio(9);
		hotel.obtenerPrecio(11); //este no lo encuentra
		
		System.out.println("Mete el identificador de la habitacion :");
		int ide = keyboard.nextInt();
		hotel.hacerReserva(ide);
		
		System.out.println("Mete el identificador de la habitacion :");
		ide = keyboard.nextInt();
		hotel.hacerReserva(ide);
		
		hotel.listarHabitaciones();
		hotel.habitacionesReservadas();
		
		
	}

}
