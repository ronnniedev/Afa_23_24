package ficheros;

import java.util.Scanner;

public class ejercicio1 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/* Ejercicio 1
		 * Escribir un programa que pregunte al usuario su edad y muestre por
		 * pantalla todos los años que ha cumplido (desde 1 hasta su edad). 
		 */

		int edad,cont; // declaramos variables
		
		edad = 0; //bajamos edad a 0 para que entre el controlador que nos impida introducir numeros no validos
		
		while (edad <= 0) { //por si introducimos valores no validos
		
			System.out.println("¿Cuantos años tienes?\n");
			edad = keyboard.nextInt();
			
		}
		
		cont= 1; // cont empieza en 1 para que empieza la cuenta desde 1
		
		System.out.println("Has cumplido: \n");
		
		while (cont <= edad) {
			
			System.out.print(" " + cont + " ");
			
			cont++;
			
			
		}System.out.println(" años ");
		 System.out.println(" FIN ");
		
	}

}
