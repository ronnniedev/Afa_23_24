package ficheros;

import java.util.Scanner;

public class Ejercicio23 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/* Actividad 23
		 * Implementar una función que calcule la suma de los dígitos de un
		 * número.
		 */
		
		System.out.println("Escribe un numero entero:");
		int num = keyboard.nextInt();
		
		int suma = Libreria.sumarDigitos(num);
		
		System.out.println("La suma de los digitos de " + num + " es " + suma);
	}

}
