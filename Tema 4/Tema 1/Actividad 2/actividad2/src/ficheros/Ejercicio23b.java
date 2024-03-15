package ficheros;

import java.util.Scanner;

public class Ejercicio23b {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
			
		int numero,contador,factorial;
		
		
		System.out.println("Introduce un numero entero: ");
		numero = keyboard.nextInt();
		factorial = 1;
		
		for (contador = 0; contador <= numero ; contador++) {
			
			factorial = factorial * contador;
			System.out.println(contador);
			
		}
		System.out.println("Factorial de " + numero + " es " + factorial);
			
		}
	}


