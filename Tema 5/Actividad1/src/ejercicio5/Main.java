package ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	protected static List<Productos> stock =  new ArrayList<Productos>();

	public static void main(String[] args) {
		
		
		
		Productos p1 = new Productos();
		Productos p2 = new Productos();
		Productos p3 = new Productos();
		Productos p4 = new Productos();
		Productos p5 = new Productos();
		Productos p6 = new Productos();
		
		añadirPoll(p1);
		añadirPoll(p2);
		añadirPoll(p3);
		añadirPoll(p4);
		añadirPoll(p5);
		añadirPoll(p6);
		
		mostrarStock();
		
		Ticket t1 = new Ticket();
		
		t1.generarTicket(stock);
		
	}
	
	public static void añadirPoll(Productos p) {
		
		stock.add(p);
		
	}
	
	public static void mostrarStock() {
		
		System.out.println("*********Stock*********");
		
		for (int i = 0; i < stock.size(); i++) {
			System.out.println(stock.get(i).toString());
		}
		
	}
}
