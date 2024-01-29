package ficheros;

import java.util.Scanner;

public class Ejercicio12 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/* Actividad 12
		 * Utilizando la función anterior, calcula un numero combinatorio.
		 */
		System.out.println("Introduce N: ");
		int n = keyboard.nextInt();
		
		System.out.println("Introduce K: ");
		int k = keyboard.nextInt();
		
		int resul = n - k;
		
		if (resul <= 0)System.out.println("El resultado de (n-k) es " + resul + "por lo que no puede efectuarse la operacion");
		else {
			
			k = Libreria.factorial(k);
			resul = Libreria.factorial(resul);
			n = Libreria.factorial(n);
			
			
			resul = n/(k*resul);
			
			System.out.println("El combinatorio es " + resul);
		}
	}

}
