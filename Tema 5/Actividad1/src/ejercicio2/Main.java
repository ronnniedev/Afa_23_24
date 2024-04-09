package ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		
		List<Integer> lista = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			
			int num =(int)(Math.random()*50)+1;
			
			lista.add(num);
			
		}
		
		mostrarLista(lista);
		
		System.out.println("\nIntroduce el limite superior: ");
		int max = keyboard.nextInt();
		
		System.out.println("Introduce el limite minimo: ");
		int min = keyboard.nextInt();
		
		eliminarSobrantes(lista,min,max);
		
		mostrarLista(lista);
		
	}
	
	public static void mostrarLista(List <Integer>lista) {
		
		System.out.println("\n------------------------------");
		for (Integer i: lista) {
			
			System.out.print(i + ",");
			
		}
		
	}
	
	public static void eliminarSobrantes(List <Integer>lista,int min,int max) {
		
		System.out.println("\n-------------Eliminar-----------------");
		
		for (int i = 0; i < lista.size(); i++) {
			int num = lista.get(i);
			if (num < min || num > max) {
				lista.remove(i);
				i--;
			}
			
		}
		
	}
	
	 

}
