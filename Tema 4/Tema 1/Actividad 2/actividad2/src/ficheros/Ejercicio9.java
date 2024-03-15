package ficheros;

import java.util.Scanner;

public class Ejercicio9 {
	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		/*
		 * Actividad 9
		 * Leídos dos números por teclado, restar al mayor el menor. Por ejemplo
		 * , si A = 9 y B = 3 entonces se debe mostrar “ el primero es mayor y la
		 * resta es 6 “
		 */
		int a,b,resultado;
		
		System.out.println("Introduce el numero a :"); //Declaramos variables y preparamos los comandos de lectura
		a = teclado.nextInt();
		System.out.println("Introduce el numero b :");
		b = teclado.nextInt();
		
		if ( a > b ) { 
			
			resultado = a - b; //Si A es mayor que B la suma seria de a-b
			 
			System.out.println("Al ser a superior que b la operacion es a - b = " + resultado);	
		} else if (b > a) {
			
			resultado = b - a; //Si B es mayor que A la suma seria de b-a
			
			System.out.println("Al ser b superior que a la operacion es b - a = " + resultado);
			
		}else if (b == a) {
			
			System.out.println("Los valores introducidos son iguales"); //Preparamos un mensaje para valores iguales
			
		}
				
	}

}
