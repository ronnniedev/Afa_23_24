package ficheros;

import java.util.Scanner;

public class Ejercicio13 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/*Actividad 13
		 * Dados 2 números enteros, implementar un algoritmo que calcule el
		 * cociente y el resto mediante restas sucesivas.
		 * Ejemplo 18 /4
		 * Se iría restando 18-4 = 14; 14 – 4 = 10; 10 – 4 = 6; 6 -4 = 2; hasta
		 * que el resultado de la resta (2) es menor que el divisor (4). Por lo tanto
		 * el cociente es el numero de restas que se han hecho y el resto es el
		 * valor de la última resta.
		 */
		
		double dividendo,divisor,resultado;
		resultado = 0;
		
		System.out.println("Introduce el dividendo: ");
		dividendo = keyboard.nextDouble();
		System.out.println("Introduce el divisor:");
		divisor = keyboard.nextDouble();
		
		while (dividendo>=divisor) { //creamos un while que nos vaya haciendo la resta hasta que el divisor sea mayor
									//que el dividendo
			dividendo = dividendo - divisor;
			resultado++;
			
		}
		      
		System.out.printf("El resultado de la division seria %.0f%n \n" ,resultado);
		System.out.printf("El resto de la division seria %.0f%n " ,dividendo);

	}

}
