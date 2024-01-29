package ficheros;

import java.util.Scanner;

public class Ejercicio13 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/* Ejercicio 13
		 * Un número entero es un palíndromo si se puede leer igual de izquierda
		 * a derecha y de derecha a izquierda. Por ejemplo: 5, 121, 12321. Escriba
		 * una función para determinar si un número es un palíndromo.
		 */
		
		
		
		System.out.println("Introduce un numero: ");
		int num = keyboard.nextInt();
		int numMemoria = num;
		int cifras = 0;
		
		while (num < 0) {
			
			System.out.println("Introduce un numero entero y positivo: ");
			num = keyboard.nextInt();
			
		}
		
		if (num < 10) {
			
			System.out.println(" El numero es palindromo ");
			
		}else {
			
			
			
		}
		

	}

}
