package ficheros;

import java.util.Scanner;

public class Ejercicio1 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/* Actividad 1
		 * Escribir un programa que lea 10 números de tipo entero y los
		 * almacene en un vector. Implementar una función que muestre el
		 * contenido del vector indicando para cada elemento su posición. 
		 */
		
		int v[]=new int [10];
		
		for (int i = 0; i <v.length ; i++) {
			
			System.out.println("Introduce un numero [" + i + "]:" );
			v[i] = keyboard.nextInt();
			
		}
		
		Libreria.MostrarValores(v);
		
	}

}
