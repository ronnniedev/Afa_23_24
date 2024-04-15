package ejercicio3clase;

import java.util.Set;
import java.util.TreeSet;

public class Centralita {

	private Set <Llamada> llamadas;
	
	public Centralita() {
		
		llamadas = new TreeSet <Llamada>();
		
	}
	
	public void añadirLlamada(Llamada l) {
		boolean resul = llamadas.add(l);
		
	}
	
	public void mostrarLlamadas() {
		System.out.println("*******Llamadas********");
		
		for (Llamada l: llamadas) {
			System.out.println(l.toString());
		}
	}
	
	public void registroDeLlamadas (String origen) {
		
		double cantidad = 0.0;
		System.out.println("***********Factura de " + origen + "******************");
		for (Llamada l: llamadas) {
			if (l.getNumOrigen().compareTo(origen) == 0) {
				System.out.println(l.toString());
				cantidad = cantidad + l.getImporte();
			}
			
			
			
		}
		
		System.out.println("El importe total del numero "+ origen + " es: " + cantidad);
	}
}
