package ejerciciosFor;

import java.util.Scanner;

public class Ejercicio3 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		
		int numero;
		
		System.out.println("Introduce un numero: ");
		numero = keyboard.nextInt();
		
		for (;numero != 0;) {
			
			System.out.println("Introduce otro numero: ");
			numero = keyboard.nextInt();
			
		}

	}

}
