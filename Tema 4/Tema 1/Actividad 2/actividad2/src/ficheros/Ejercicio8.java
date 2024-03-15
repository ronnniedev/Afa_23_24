package ficheros;

import java.util.Scanner;

public class Ejercicio8 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/* Actividad 8
		 * Determinar si un número real pedido por teclado tiene o no decimales
		 */
		
		double numero; 
		double comprobacion;
		
		System.out.println("Introducir el numero deseado :");
		numero = keyboard.nextDouble();
		comprobacion = numero % 1; //Si el resto es superior a 0 sabremos que es un decimal	
		
		if (numero == 0) { //por si introducimos un valor equivalente a 0
			System.out.println("El numero introducido es entero");
			
		}
		else if (comprobacion > 0 || comprobacion < 0) {// si el resto es superior o menor a 0 el numero es decimal
			System.out.println("El numero es decimal");
				
		} 
		else if (comprobacion == 0) { //si no, es entero
			System.out.println("El numero es entero");
			
		}
		
		 
		
	}

}
