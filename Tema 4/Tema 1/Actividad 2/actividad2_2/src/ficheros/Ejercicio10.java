package ficheros;

import java.util.Scanner;

public class Ejercicio10 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/* Ejercicio 10 (while)
		 * Escriba un programa que pida números enteros mientras sean cada
		 * vez más grandes.
		 */
		
		int num,numDos;
		
		System.out.print("Introduzca un numero: ");
		num = keyboard.nextInt();
		
		System.out.print("Introduce un numero mayor que " + num + " :");
		numDos = keyboard.nextInt();
		
		while (numDos > num) {
			
				
				num = numDos;
				
			
			System.out.print("Introduce un numero mayor que " + num + " :");
			numDos = keyboard.nextInt();
			
		}System.out.println(numDos + " no es mayor que " + num);

	}

}
