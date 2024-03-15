package ficheros;

import java.util.Scanner;

public class Ejercicio20 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/*Ejercicio 20 (For)
		 * Escriba un programa que pida dos números enteros y escriba la suma
		 * de todos los enteros desde el primer número hasta el segundo.
		 */
		int suma = 0;
		
		System.out.println("Escriba un numero: ");
		int numUno = keyboard.nextInt();
		
		while (numUno < 0) {
			
			System.out.println("ERROR");
			System.out.println("Escriba un valor entero y positivo: ");
			numUno = keyboard.nextInt();
			
		}
		
		System.out.println("Escriba un numero mayor a " + numUno + " :");
		int numDos = keyboard.nextInt();
		
		while (numDos < numUno) {
			
			System.out.println("ERROR");
			System.out.println("Escriba un valor mayor a " + numUno + " :");
			numUno = keyboard.nextInt();
			
		}
		
		for (int cont = numUno ; cont <= numDos ; cont++) {
			
			suma = suma + cont;
			
		}
		System.out.println("La suma final es :" + suma);
		
		

	}

}
