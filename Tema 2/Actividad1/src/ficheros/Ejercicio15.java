package ficheros;

import java.util.Scanner;

public class Ejercicio15 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/* Actividad 15
		 * Dados dos números enteros, realizar una función que calcule el
		 * cociente y el resto mediante restas sucesivas.
		 * Ejemplo : 18 / 4
		 * Se irá restando 18-4 =14; 14-4=10; 10-4=6; 6-4=2
		 * Hasta que el resultado de la resta (2) es menor que el divisor(4). Por lo
		 * tanto el cociente es el número de restas que se han hecho (4) y el
		 * resto es el valor de la última resta (2). 
		 */

		System.out.println("Introduce el dividendo: ");
		int dividendo = keyboard.nextInt();
		
		System.out.println("Introduce el divisor");
		int divisor = keyboard.nextInt();
		
		Libreria.divisionEntera(dividendo,divisor);
	}

}
