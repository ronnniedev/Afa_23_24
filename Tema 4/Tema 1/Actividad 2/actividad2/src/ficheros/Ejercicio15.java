package ficheros;

import java.util.Scanner;

public class Ejercicio15 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/*Actividad 15
		 * Calcula cual es el mayor, mediano y menor de tres números que se
		 * piden por teclado. 
		 */

		double numero1,numero2,numero3;
		
		System.out.println("Introduzca el primer numero: "); //introducimos los valores 
		numero1 = keyboard.nextInt();
		
		System.out.println("Introduzca el segundo numero: ");
		numero2 = keyboard.nextInt();
		
		System.out.println("Introduzca el tercer numero: ");
		numero3 = keyboard.nextInt();
		
		
		if (numero1 > numero2 && numero1 > numero3) { //si el numero 1 es el mayor establemos los if que sean pertinentes
			
			System.out.println("El primer numero es el mayor");
			
			if (numero2 > numero3) {
				
				System.out.println("El segundo numero es el mediano4");
				System.out.println("El tercer numero es el menor");
				
			}else {
				
				System.out.println("El segundo numero es el menor");
				System.out.println("El tercer numero es el mediano");
				
			}
		}
		if (numero2 > numero1 && numero2 >numero3) { //si es el numero2 lo mismo
			
			System.out.println("El segundo numero es el mayor");
			
			if (numero1>numero3) {
				
				System.out.println("El primer numero es el mediano");
				System.out.println("El tercer numero es el menor");
				
			}else {
				
				System.out.println("El primer numero es el menor");
				System.out.println("El tercer numero es el mediano");
				
			}

		}
		if (numero3 > numero2 && numero3 > numero1) { //si es el numero3 lo mismo
			
			System.out.println("El tercer numero es el mayor");
			
			if (numero1>numero2) {
				
				System.out.println("El primer numero es el mediano");
				System.out.println("El segundo numero es el menor");
			
			}else {
				
				System.out.println("El primer numero es el menor");
				System.out.println("El segundo numero es el mediano");
			}
			}
		 if (( numero1 == 0 || numero2 == 0 || numero3 == 0 ) || numero1 == numero2 || numero2 == numero3 ||
			   numero3 == numero1) {
			 //Si una o dos de las parejas son equivalentes saldra este mensaje de error.
				System.out.println("Dos o todas las parejas son equivalentes");
		}
		
	}

}
