package ejercicio2;

import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Almacen {
	static Scanner keyboard = new Scanner(System.in);
	private Set<Ticket> tickets;
	private Set<Producto>productos;
	
	public Almacen() {
		
		this.tickets = new HashSet<Ticket>();
		this.productos = new TreeSet<Producto>();
		
	}
	
	public void crearTicket(Date fecha, String dependienta) {
		int cant = 0;
		boolean encontrado = false;
		Producto p = null;
		int pedido = 0;
		Ticket t = new Ticket (dependienta);
	
		
		System.out.println("Cuantos detalles quieres añadir en el ticket");
		cant = keyboard.nextInt();
	
		
		for (int i = 0; i < cant; i++) {
			encontrado = false;
			while (encontrado == false) {
				System.out.println("Escribeme la id del producto: ");
				int id = keyboard.nextInt();
				p = buscarProducto(id);
				
				if (p != null) {
					encontrado = true;
				}else {
					System.out.println("No encontrado, vuelva a intentarlo");
				}
				
			}
				System.out.println("Producto seleccionado: ");
				System.out.println(p.toString());
				encontrado = false;
				
				
				while (encontrado == false) {
					System.out.println("Escribeme la cantidad a comprar: ");
					pedido = keyboard.nextInt();
					
					if (p.getCantidad() > pedido) {
						encontrado = true;
					}
				
			}
			
			t.añadirDetallePedido(p, pedido);
		}
		t.mostrarTicket();
		tickets.add(t);
		
		
	}
	
	public void cargarProductos() {
		Producto  p = new Producto (1);
		Producto  p2 = new Producto (2);
		Producto  p3 = new Producto (3);
		
		System.out.println(p.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		
		
		productos.add(p);
		productos.add(p2);
		productos.add(p3);
		
		
		
	}
	
	public Producto buscarProducto(int numero) {
		String comparador = "producto" + numero;
		Producto contenedor = null;
		boolean encontrado = false;
		
		for (Producto p: productos) {
			if (p.getNombre().compareTo(comparador) == 0 && encontrado == false) {
				contenedor = p;
				encontrado = true;
			}
		}
		
		return contenedor;
	
	}
	
	public void mostrarTickets() {
		System.out.println("*********************Tickets en el sistema*****************************\n\n");
		for (Ticket t: tickets) {
			System.out.println(t.toString());
			System.out.println("********************************Ticket******************************");
			
		}
		System.out.println("Fin");
	}

	public void mostrarTicket(String dep) {
		
		for (Ticket t: tickets) {
			if (t.getDependienta().compareTo(dep) == 0) {
				System.out.println("********************************Ticket******************************");
				System.out.println(t.toString());
			}
			
			
		}
		
	}
	
}
