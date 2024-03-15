package ficheros;

import java.util.Scanner;

public class Ejercicio11 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/* Actividad 11
		 * Calcula mediante una función el factorial de un número entero. El
		 * factorial de un número es el resultado de multiplicar ese número por
		 * todos los números menores que él.
		 * Ejemplo: 4! = 4*3*2*1=12
		 */
		
		System.out.println("Introduce un numero entero: ");
		int num = keyboard.nextInt();
		
		num = Libreria.factorial(num);
		
		System.out.println("\nEl resultado del factorial es " + num);
	}

}
