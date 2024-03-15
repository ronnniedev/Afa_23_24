package ficheros;

import java.util.Scanner;

public class Ejercicio11 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/* Ejercicio 11 (while)
		 * Escriba un programa que pida la cantidad de números positivos que se
		 * tienen que escribir y a continuación pida números hasta que se haya
		 * escrito la cantidad de números positivos indicada. 
		 */

		int cant,num;
		
		System.out.println("¿Cuantos numeros positivos quieres introducir?");
		cant = keyboard.nextInt();
		
		while (cant < 0) {
			
			System.out.println("ERROR");
			System.out.print("Por favor introduzca una cantidad valida:");
			cant = keyboard.nextInt();
			
		}
		
		while (cant != 0) {
			
			System.out.println("Introduzca un numero (" + cant + ") positivo");
			num = keyboard.nextInt();
			
			while (num < 0) {
				System.out.println("ERROR");
				System.out.println("Introduzca un numero (" + cant + ") positivo");
				num = keyboard.nextInt();
			}
			
			cant--;
			
		}System.out.println("FIN");
	}

}
