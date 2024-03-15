package ficheros;

import java.util.Scanner;

public class Ejercicio11 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/*Actividad 11
		 * Diseña un algoritmo que determine si tres números que pedimos por
		 * teclado están ordenados de mayor a menor ( NO consiste en ordenar,
		 * solo indicar si están ordenados o no)
		 */
		
		double numero1,numero2,numero3; //declaramos las variables reales
		
		System.out.println("Introduzca el primer numero: "); //introducimos los valores 
		numero1 = keyboard.nextDouble();
		
		System.out.println("Introduzca el segundo numero: ");
		numero2 = keyboard.nextDouble();
		
		System.out.println("Introduzca el tercer numero: ");
		numero3 = keyboard.nextDouble();
		
		
		// Entiendo que se refiere a que esten ordenado de mayor a menor o menor a mayor por lo que hacemos esta 	
		// condicion.
		if ((numero1 > numero2) && (numero2 > numero3)) {
			
			System.out.println("Los numeros estan ordenados");
			
		}else {
			
			System.out.println("Los numeros no estan ordenados");
		}		
	}

}
