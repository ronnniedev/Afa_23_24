package ficheros;

import java.util.Scanner;

public class Ejercicio16 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/*Ejercicio 16 (for)
		 * Escriba un programa que pregunte cuántos números se van a
		 * introducir, pida esos números, y muestre un mensaje cada vez que un
		 * número no sea mayor que el primero.
		 */
		
		int numMayor,num,cifras;
		boolean primero = false;
		
		numMayor = 0;
		
		System.out.print("Introduce el numero de cifras a introducir: ");
		cifras = keyboard.nextInt();
		
		while (cifras < 0) {
			
			System.out.println("ERROR");
			System.out.print("Por favor introduce un numero positivo y entero de cifras: ");
			cifras = keyboard.nextInt();
			
		}
		
		for (int cont = 0; cont < cifras ; cont++) {
			
			if (primero == false) {
				
				System.out.println("Introduzca un numero: ");
				numMayor = keyboard.nextInt();
				num = numMayor;
				primero = true;
				
			}else {
				
				System.out.println("Introduzca un numero mas grande que " + numMayor + " :");
				num = keyboard.nextInt();	
			}		
			
			if (num < numMayor) {
				
				System.out.println(num + " no es mayor que " + numMayor);
				
			}

		}System.out.println("Gracias por su colaboracion");

	}

}
