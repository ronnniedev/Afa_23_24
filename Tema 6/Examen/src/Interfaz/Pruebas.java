package Interfaz;

import Excepciones.ExamenExcepcion;
import Logica.GestorAutobus;
import Modelo.Cliente;

public class Pruebas {

	public static void main(String[] args) {
		GestorAutobus g = new GestorAutobus();
		
		
		Cliente c1 = new Cliente ("12", "c1");
		Cliente c2 = new Cliente ("12", "c1");
		Cliente c3 = new Cliente ("13", "c1");
		
		try {
			System.out.println("1");
			g.addCliente(c1);
		} catch (ExamenExcepcion e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		try {
			System.out.println("2");
			g.addCliente(c2);
		} catch (ExamenExcepcion e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		try {
			System.out.println("3");
			g.addCliente(c3);
		} catch (ExamenExcepcion e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			
		}

	}

}
