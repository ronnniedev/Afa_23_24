package ejercicio2;

import java.util.Date;
import java.util.Scanner;

public class Pruebas {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		Almacen a = new Almacen();
		a.cargarProductos();
		Date fecha = new Date();
		
		System.out.println("Dime tu nombre");
		String dependienta = keyboard.next();
		a.crearTicket(fecha,dependienta);
		System.out.println("Dime tu nombre");
		dependienta = keyboard.next();
		a.crearTicket(fecha,dependienta);
		a.mostrarTickets();
		a.mostrarTicket("Ana");

	}

}
