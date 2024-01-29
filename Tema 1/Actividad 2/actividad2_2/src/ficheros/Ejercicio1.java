package ficheros;

import java.util.Scanner;

public class Ejercicio1 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/*Ejercicio 1 (operaciones básicas)
		 * Escriba un programa que pida dos números y que escriba su media
		 * aritmética. Se recuerda que la media aritmética de dos números es la
		 * suma de ambos números dividida por 2
		 */
		
		double numUno,numDos,media;
		

		System.out.println("CALCULO DE LA MEDIA DE DOS NUMEROS");
		
		System.out.print("Introduzca un numero: ");
		numUno = keyboard.nextDouble();
		
		System.out.print("Introduzca otro numero: ");
		numDos = keyboard.nextDouble();
		
		media = (numUno + numDos) /2 ;
		System.out.println("La media de " + numUno + " la media de " + numDos + " es " + media);
		
		
		
	}

}
