package ficheros;

import java.util.Scanner;

public class Ejercicio12 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/* Ejercicio 12 (while)
		 * Escriba un programa que pida un valor límite positivo y a continuación
		 * pida números hasta que la suma de los números introducidos supere
		 * el límite inicial.
		 */

		int limite,num,suma;
		
		suma = 0;
		
		System.out.print("Introduzca el limite que debe rebasar la suma: ");
		limite = keyboard.nextInt();
		
		while (limite < 0) {
			System.out.println("ERROR");
			System.out.println("Introduzca un limite de caracter positivo: ");
			limite = keyboard.nextInt();
		}
		
		while (suma <= limite) {
			
			System.out.println("Introduce un numero a sumar :");
			num = keyboard.nextInt();
				
		    suma = suma + num;
				
			System.out.println("\nLa suma actual es: " + suma);
			
			
		}System.out.println(" Se ha rebasado el limite " + limite + " con la suma del valor: "+ suma);
		
		
	}

}
