package ficheros;

import java.util.Scanner;

public class Ejercicio24 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/* Actividad 24
		 * Calcula la media de diez números que pedimos por teclado,.
		 * Generaliza la solución para una cantidad cualquiera de números que
		 * pediremos al principio
		 */
		
		double numero,suma,cont; //declaramos las variables
		
		 //inicializamos el divisor en 0
		cont = 0; //inicializamos el contador con 1 para que cuente 10 lecturas
		suma = 0;
		
		while (cont != 10) {
			
			System.out.println("Introduce un numero");
			numero = keyboard.nextDouble();
			
			suma = numero + suma;
			cont++; // al acabar el proceso le sumamos 1 al contador
		}
		suma = suma / 10;
		System.out.println("La media de estas 10 cifras es: " + suma);
	}

}
