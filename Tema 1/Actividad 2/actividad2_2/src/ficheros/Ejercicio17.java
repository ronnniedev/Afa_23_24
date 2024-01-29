package ficheros;

import java.util.Scanner;

public class Ejercicio17 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/*Ejercicio 17 (for)
		 * Escriba un programa que pregunte cuántos números se van a
		 * introducir, pida esos números y escriba cuántos negativos ha
		 * introducido.
		 */
		int negativos = 0;
		
		System.out.println("Cuantos numeros va a introducir: ");
		int cifras = keyboard.nextInt();
		
		while (cifras < 0) {
			
			System.out.println("ERROR");
			System.out.println("Introduzca un valor positivo y entero: ");
			cifras = keyboard.nextInt();
			
		}
		
		for (int cont = 0; cont < cifras; cont++) {
			
			System.out.println("Escriba un numero : ");
			int num = keyboard.nextInt();
			
			if (num < 0) {
				
			negativos++;	
				
			}
			
		}System.out.println("El numero de negativos introducidos ha sido de " + negativos);


	}

}
