package ficheros;

import java.util.Scanner;

public class Ejercicio6 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/*Ejercicio 6 (if-else)
		 * Escribir un programa que pida dos números reales por teclado y
		 * determine cual es el menor y cual es el mayor o escriba si son iguales
		 */

		double numUno,numDos;
		
		System.out.println("COMPARADOS DE NUMEROS");
		
		System.out.print("Escribe un numero: ");
		numUno = keyboard.nextDouble();
		
		System.out.print(" Escribe otro numero: ");
		numDos = keyboard.nextDouble();
		
		if (numUno > numDos) {
			
			System.out.println("Menor: " + numDos + " Mayor: " + numUno);
			
		}else if (numDos > numUno) {
			
			System.out.println("Menor: " + numUno + " Mayor: " + numDos);
			
		}else {
			
			System.out.println("Ambos numeros son iguales");
		}
		
		
	}

}
