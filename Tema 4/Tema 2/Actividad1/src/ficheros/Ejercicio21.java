package ficheros;

import java.util.Scanner;

public class Ejercicio21 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/* Actividad 21
		 * Realiza un programa que permita convertir modularmente números
		 * binarios en decimales y viceversa.
		 */
		
		
		System.out.println("----------Conversor Binario-------------");
		System.out.println("Selecciona de que a que quieres convertir: \n");
		System.out.println("1- Binario a decimal: ");
		System.out.println("2- Decimal a binario: ");
		int sel = keyboard.nextInt();
		
		
		while (sel < 1 || sel > 2) {
			System.out.println("ERROR ESCRIBA DE NUEVO");
			System.out.println("1- Binario a decimal");
			System.out.println("2- Decimal a binario");
			sel = keyboard.nextInt();
		}

		
		if (sel == 1) {
			
			System.out.println("Escribe un numero binario:");
			int num = keyboard.nextInt();
			Libreria.binarioaDecimal(num);
			
		}	
		else {
			System.out.println("Escribe un numero decimal: ");
			int num = keyboard.nextInt();
			Libreria.decimalaBinario(num);
		}
		

	}

}
