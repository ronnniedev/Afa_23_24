package ficheros;

import java.util.Scanner;

public class Ejercicio4 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/*Ejercicio 4 (if-else)
		 * Escribir un programa que pida dos números por teclado, el dividendo y
		 * un divisor. Escribir un mensaje que determine si la división es exacta o
		 * no.
		 */
		
		int resto,dividendo,divisor,cociente;
		
		System.out.println("DIVISOR DE NUMEROS");
		
		System.out.print("Introduzca el dividendo: ");
		dividendo = keyboard.nextInt();
		
		System.out.print("Introduzca el divisor: ");
		divisor = keyboard.nextInt();
		
		cociente = dividendo / divisor;
		resto = dividendo % divisor;
		
		if (resto > 0) {
			
			System.out.print("La division no es exacta.");
			
			System.out.println(" Cociente: " + cociente + " Resto: " + resto);
		}else {
			
			System.out.print("La division es exacta.");
			System.out.println(" Cociente: " + cociente );
		}

	}

}
