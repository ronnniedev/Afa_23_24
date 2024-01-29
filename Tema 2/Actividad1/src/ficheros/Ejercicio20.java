package ficheros;

import java.util.Scanner;

public class Ejercicio20 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/* Actividad 20
		 * Realiza un programa que admita 3 números enteros y los devuelva
		 * ordenados de menor a mayor. 
		 */

		System.out.println("Introduce numero A: ");
		int numA = keyboard.nextInt();
		
		System.out.println("Introduce numero B: ");
		int numB = keyboard.nextInt();
		
		System.out.println("Introduce numero C: ");
		int numC = keyboard.nextInt();
		
		Libreria.compararNumeros(numA,numB,numC);
		
	}

}
