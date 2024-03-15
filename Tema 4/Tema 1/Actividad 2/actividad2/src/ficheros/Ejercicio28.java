package ficheros;

import java.util.Scanner;

public class Ejercicio28 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/* Actividad 28
		 * Implementar un algoritmo que pida números hasta que el número
		 * leído este entre 1 y 5, en ese momento se debe salir.
		 */
		
		int numero; //declaramos numero como int
		numero = 0;
		
		while (numero <= 1 || numero >= 5) { //estimamos el limite comprendido entre ambas cifras
			System.out.println("Introduce un numero"); //pedimos el numero
			numero = keyboard.nextInt();
			
		}
		
		System.out.println("Programa terminado");

	}

}
