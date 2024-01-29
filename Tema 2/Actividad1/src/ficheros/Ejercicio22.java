package ficheros;

import java.util.Scanner;

public class Ejercicio22 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/* Actividad 22
		 * Realiza una función que devuelva cuantas cifras pares contiene un
		 * número. Implementar la función gemela que retorne cuantas cifras
		 * impares contiene el número parado como parámetro.
		 */
		
		System.out.println("Escribe un numero entero :");
		int num = keyboard.nextInt();
		
		int pares = Libreria.contarPares(num);
		System.out.print(num + " tiene " + pares + " cifras pares y ");
		int impares = Libreria.contarImpares(num);
		System.out.println(" tiene " + impares + " cifras impares");

	}

}
