package ficheros;

import java.util.Scanner;

public class Ejercicio8 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/* Ejercicio 8 (if-else)
		 * Escriba un programa que pida dos números enteros y que escriba si el
		 * mayor es múltiplo del menor. 
		 */
		
		int num,numDos;
		
		System.out.print("Introduzca un numero: ");
		num = keyboard.nextInt();
		
		System.out.println("Introduzca otro numero:");
		numDos = keyboard.nextInt();
		
		while (num == numDos) {
			
			System.out.println("Introduzca de nuevo los numeros");
			
			System.out.println("Introduzca numero 1:");
			num = keyboard.nextInt();
			
			System.out.println("Introduzca numero 2: ");
			numDos = keyboard.nextInt();
			
		}
		
		if (num>numDos) { //si num es superior a num Dos
			
			if (num%numDos == 0) {
				
				System.out.println("El numero " + num + " es multiplo de  " + numDos);
			}else {
				System.out.println("El numero " + num + " no es multiplo de " + numDos);
			}
			
		}else { // si no es superior que numDos
			
			if (numDos%num == 0) {
				
				System.out.println("El numero " + numDos + " es multiplo de " + num);
			}else {
				System.out.println("El numero " + numDos + " no es multiplo de " + num);
			}
			
		}
		
	}

}
