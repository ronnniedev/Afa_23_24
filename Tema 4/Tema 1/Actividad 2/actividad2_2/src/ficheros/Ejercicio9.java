package ficheros;

import java.util.Scanner;

public class Ejercicio9 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/*Ejercicio 9 (while)
		 * Escriba un programa que pida dos números enteros. El programa
		 * pedirá de nuevo el segundo número mientras no sea mayor que el
		 * primero. El programa terminará escribiendo los dos números.
		 */

			int num,numDos;
			
			System.out.print("Introduce un numero: ");
			num = keyboard.nextInt();
			
			System.out.print("Introduce otro numero: ");
			numDos = keyboard.nextInt();

			
			while (num >= numDos) {
				
				System.out.println(numDos + " no es mayor que " + num);
				
				System.out.print("Introduzca un numero nuevo");
				numDos = keyboard.nextInt();
				
			}
			
			System.out.println(numDos + " es mayor que " + num);
		
		
	}

}
