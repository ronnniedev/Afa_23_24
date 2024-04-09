package ejemplo;

import java.util.LinkedList;
import java.util.List;

public class Main2 {
	
	public static void main(String[] args) {
		// declarar una lista 
		List<String> lista;
		
		//instanciar la lista
		lista = new LinkedList<String>();
		
		if (lista.isEmpty() == true) {
			System.out.println("Lista vacia");
		}else {
			System.out.println("ERROR \n Lista no vacia");
		}
		
		lista.add("primero");
		lista.add("segundo");
		lista.add("tercero");
		
		System.out.println("\nTam lista " + lista.size());
		
		for (String s: lista) {
			System.out.println(s);
		}
		
		// Listar con bucle for
		
		System.out.println("Bucle for \n--------------------------");
		
		for (int i = 0; i < lista.size(); i++) {
			String  s = lista.get(i);
			System.out.println(s);
		}
		
		lista.add(1 ,"nuevo");
		
		System.out.println("Despues de insertar nuevo \n--------------------------");
		for (String s: lista) {
			System.out.println(s);
		}
		
		
		lista.remove(1);
		
		System.out.println("Depsues de borrar pos 0 \n-----------------------------");
		for (String s: lista) {
			System.out.println(s);
		}
		
		
		

	}
}
