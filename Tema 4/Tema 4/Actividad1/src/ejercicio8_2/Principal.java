package ejercicio8_2;

import java.util.Scanner;

public class Principal {
	static Scanner keyboard=new Scanner(System.in);
	public static void main(String[] args) {
		
		
		Hotel h = new Hotel ();
		Clientes c1 = new Clientes("Carlos", "Gonza Ramires", "28414021312", "Inserta email aqui", "26-4-1995");
		Clientes c2 = new Clientes("C2", "Gonza Ramires", "28414021312", "Inserta email aqui", "26-4-1995");
		Clientes c3 = new Clientes("C3", "Gonza Ramires", "28414021312", "Inserta email aqui", "26-4-1995");
		Clientes c4 = new Clientes("C4", "Gonza Ramires", "28414021312", "Inserta email aqui", "26-4-1995");
		Clientes c5 = new Clientes("C5", "Gonza Ramires", "28414021312", "Inserta email aqui", "26-4-1995");
		Clientes c6 = new Clientes("C6", "Gonza Ramires", "28414021312", "Inserta email aqui", "26-4-1995");
		Clientes c7 = new Clientes("C7", "Gonza Ramires", "28414021312", "Inserta email aqui", "26-4-1995");
		Clientes c8 = new Clientes("C8", "Gonza Ramires", "28414021312", "Inserta email aqui", "26-4-1995");
		Clientes c9 = new Clientes("C9", "Gonza Ramires", "28414021312", "Inserta email aqui", "26-4-1995");
		Clientes c10 = new Clientes("C10", "Gonza Ramires", "28414021312", "Inserta email aqui", "26-4-1995");
		
		h.añadirCliente(c1);
		h.añadirCliente(c2);
		h.añadirCliente(c3);
		h.añadirCliente(c4);
		h.añadirCliente(c5);
		h.añadirCliente(c6);
		h.añadirCliente(c7);
		h.añadirCliente(c8);
		h.añadirCliente(c9);
		h.añadirCliente(c10);
		
		h.visualizarClientes();
		

	}

}
