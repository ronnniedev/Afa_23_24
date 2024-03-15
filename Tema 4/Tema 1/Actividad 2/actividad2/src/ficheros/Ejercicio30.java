package ficheros;

import java.util.Scanner;

public class Ejercicio30 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/* Actividad 30
		 * Diseñar el algoritmo que indique el mayor de una serie de números que
		 * introducimos por teclado. Crea dos versiones: en la primera la
		 * cantidad está definida en la segunda será indefinida.
		 */
		
		int num,mayor; //declaramos variables
		boolean cond;
		
		cond = true;
		
		System.out.println("Introduce un numero: ");
		num = keyboard.nextInt();
		mayor = num;
		
		if (num == 0) {
			
			cond = false;
			
		}
		
		
		while (cond) {
			
			System.out.println("Introduce otro numero");
			num = keyboard.nextInt();
			
			if (num == 0) {
				
				cond = false;
				
			}else if (num > mayor) {
				
				mayor = num;
				
			}
			
			
		}
		System.out.println("El mayor numero ha sido: " + mayor);
					
		
	}

}
