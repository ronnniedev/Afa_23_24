package ejercicio3Clase;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		List <Integer> lista = new ArrayList<Integer>();
		
		for (int i = 1; i < 5; i++) {
			try {
			insertarNum(lista);
			}catch (ElementoDuplicadoException e) {
				System.out.println(e.getMessage());
			}
		}

		mostrarLista(lista);
	}

	private static void mostrarLista(List<Integer> lista) {
		for (int i = 0; i < lista.size(); i++) {
			System.out.println("["+i+"] :" + lista.get(i));
		}
	}
	
	private static void insertarNum(List <Integer> lista) throws ElementoDuplicadoException {
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce num: ");
		int num = teclado.nextInt();
		
		boolean encontrado = false;
		
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i)==num) {
				encontrado = true;
				
			}
			
		}
		
		if (encontrado) {
			//System.out.println("Error num ya insertado");
			throw new ElementoDuplicadoException("el numero " + num + " ya insertado");
		}else {
			lista.add(num);
		}
		
	}
}
