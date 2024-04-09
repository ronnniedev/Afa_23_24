package ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Introduce un numero");
		int num = keyboard.nextInt();
		
		List<Integer> lista = new ArrayList<Integer>();
		
		for (int i = num; i <= 100; i++) {
			if (i%num == 0) {
				lista.add(i);
			}
		}
		
		
		System.out.println("Lista de numeros divisibles por " + num);
		for (Integer i: lista) {
			System.out.print(i + ",");
		}
		
		

	}

}
