package ficheros;

import java.util.Scanner;

public class Ejercicio5 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/*Ejercicio 5 (if-else)
		 * Mejorar el programa anterior para que tenga en cuenta si el divisor es
		 * cero, que muestre un mensaje indicando que no se puede dividir
		 */
		
		
		int resto,dividendo,divisor,cociente;
		
		System.out.println("DIVISOR DE NUMEROS");
		
		System.out.print("Introduzca el dividendo: ");
		dividendo = keyboard.nextInt();
		
		
		
		System.out.print("Introduzca el divisor: ");
		divisor = keyboard.nextInt();
		
		if (divisor == 0) {
			System.out.println("No se puede divir por cero");
		} else {
			
			cociente = dividendo / divisor;
			resto = dividendo % divisor;
			
			if (resto > 0) {
				
				System.out.print("La division no es exacta.");
				
				System.out.println(" Cociente: " + cociente + " Resto: " + resto);
			}else {
				
				System.out.print("La division es exacta.");
				System.out.println(" Cociente: " + cociente );
			}
		}
		
		

	}

}
