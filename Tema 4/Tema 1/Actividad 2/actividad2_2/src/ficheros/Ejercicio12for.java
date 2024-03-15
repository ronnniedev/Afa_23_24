package ficheros;

import java.util.Scanner;

public class Ejercicio12for {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/* Ejercicio 12 
		 * Escriba un programa que pida dos números enteros y escriba qué
		 * números son pares y cuáles impares desde el primero hasta el
		 * segundo.
		 */
		
		int limSuperior,limInferior,cont,comprobador;
		
		System.out.println("Escriba un numero entero:");
		limInferior = keyboard.nextInt();
		
		System.out.println("Escriba un numero superior: ");
		limSuperior = keyboard.nextInt();
		
		while (limInferior > limSuperior) {
			
			System.out.println("ERROR");
			System.out.println("Introduzca un numero superior a " + limInferior);
			limSuperior = keyboard.nextInt();
			
		}
		
		for (cont = limInferior;cont <= limSuperior ; cont++) {
			comprobador = cont%2;
			
			if (comprobador == 0) {
				System.out.println("El numero " + cont + " es par");
			}else {
				System.out.println("El numero " + cont + " es impar");
				
			}
			
		}System.out.println("FIN");

	}

}
