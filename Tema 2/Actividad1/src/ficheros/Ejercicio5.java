package ficheros;

import java.util.Scanner;

public class Ejercicio5 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/*Actividad 5
		 * Implementar un función que determine si un año es bisiesto o no 
		 */

		System.out.print("Introduce un año :");
		int year = keyboard.nextInt();
		
		boolean bisiesto = Libreria.bisiesto(year);
		
		if (bisiesto) System.out.println("El año " + year + " es bisiesto");
		else System.out.println("El año " + year + " no es bisiesto ");
		
	}

}
