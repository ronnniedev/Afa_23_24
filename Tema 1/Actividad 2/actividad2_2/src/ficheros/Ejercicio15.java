package ficheros;

import java.util.Scanner;

public class Ejercicio15 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/* Ejercicio 15 (for)
		 * Escriba un programa que pida un número entero mayor que cero y que
		 * escriba sus divisores.
		 */
		
		int num,comprobador;
		
		System.out.print("Escriba un numero entero positivo: ");
		num = keyboard.nextInt();
		
		while (num < 0) {
			System.out.println("ERROR");
			System.out.print("Por favor escriba un numero entero positivo: ");
			num = keyboard.nextInt();
			
		} System.out.println("Los divisores de 200 son ");
		
		for (int cont = 1; cont <= num ; cont++) {
			
			comprobador = num%cont;
			
			if (comprobador == 0) {
				
				System.out.print(cont + " ");
				
			}
			
		}
		System.out.println("\nFIN");

	}

}
