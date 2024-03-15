package ficheros;

import java.util.Scanner;

public class Ejercicio27 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/*Actividad 27
		 * Diseña un algoritmo que pida números hasta que se le introduzca un
		 * número mayor que 100.
		 */

		int numero;
		numero = 0;
		
		while (numero <= 100) {
			System.out.println("Introduce un numero");
			numero = keyboard.nextInt();
			
			
		}
		System.out.println("Programa terminado");
		
	}

}
