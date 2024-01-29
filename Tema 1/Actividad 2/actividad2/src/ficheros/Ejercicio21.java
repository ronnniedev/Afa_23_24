package ficheros;

import java.util.Scanner;

public class Ejercicio21 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/*Actividad 21
		 * Escribir todos los números pares entre 1 y 20
		 */
		int numero;
		
		numero = 20;
		
		while (numero > 1) {
			
			if (numero%2 == 0) {
				
				System.out.print(numero + " ");
				
			}
			
			numero--; // avanzamos bucle
		}
	}

}
