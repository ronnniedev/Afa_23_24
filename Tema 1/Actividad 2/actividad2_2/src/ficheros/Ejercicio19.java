package ficheros;

import java.util.Scanner;

public class Ejercicio19 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/*Ejercicio 19 (for)
		 * Escriba un programa que pregunte cuantos números se van a
		 * introducir, pida esos números (que puedan ser decimales) y calcule su
		 * suma.
		 */
		double suma = 0;
		
		System.out.println("Cuantos numeros va a introducir :");
		int cifras = keyboard.nextInt();
		
		while (cifras < 0) {
			System.out.println("ERROR");
			System.out.println("Introduzca de nuevo una cifra entera y positiva: ");
			cifras = keyboard.nextInt();
			
		}
		
		for (int cont = 1; cont <= cifras; cont++) {
			
			System.out.println("Introduzca un numero "+ cont + ": ");
			double num = keyboard.nextDouble();
			
			suma = suma + num;
			
		}
		System.out.println("La suma total es : " + suma);

	}

}
