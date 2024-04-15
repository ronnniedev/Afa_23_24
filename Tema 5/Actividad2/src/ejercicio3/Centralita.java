package ejercicio3;

import java.util.Set;
import java.util.TreeSet;

public class Centralita {

	private Set<Llamada> llamadas;

	public Centralita() {
		this.llamadas = new TreeSet<Llamada>();
	}
	
	public void añadirLlamadas() {
		Provinciales p1 = new Provinciales("985320664","249023193",70);
		Provinciales p2 = new Provinciales("837244847","984196908",54);
		Provinciales p3 = new Provinciales("289371248","293213314",330);
		Provinciales p4 = new Provinciales("108421931","203902930",80);
		Provinciales p5 = new Provinciales("492834923","984196908",90);
		Locales l1 = new Locales("985320664","249023193",10);
		Locales l2 = new Locales("985320664","249023193",61);
		Locales l3 = new Locales("985320664","249023193",330);
		Locales l4 = new Locales("985320664","249023193",180);
		Locales l5 = new Locales("985320664","249023193",22);
		
		llamadas.add(p1);
		llamadas.add(p2);
		llamadas.add(p3);
		llamadas.add(p4);
		llamadas.add(p5);
		llamadas.add(l1);
		llamadas.add(l2);
		llamadas.add(l3);
		llamadas.add(l4);
		llamadas.add(l5);
		
		mostrarLlamadas();
		
	}
	
	public void mostrarLlamadas() {
		
		System.out.println("*********Llamadas dentro de la centralita***************");
		for (Llamada l: llamadas) {
			System.out.println(l.toString());
		}
	}
	
	public void registroDeLlamadas(String numero) {
		
		boolean encontrado = false;
		
		System.out.println("***************Llamadas con el numero -> " + numero + " ***********************\n");
		
		for (Llamada l: llamadas) {
			
			if (l.getNumeroOrigen().compareTo(numero) == 0) {
				System.out.println(l.toString());
				encontrado = true;
			}
		}
		if (encontrado == false) {
			System.out.println("El numero especificado no tiene llamadas");
		}
	}
	
	
	
	
}
