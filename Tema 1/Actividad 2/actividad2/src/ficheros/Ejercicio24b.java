package ficheros;

import java.util.Scanner;

public class Ejercicio24b {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/*Actividad 24
		 * Generaliza la solución para una cantidad cualquiera de números que
		 * pediremos al principio
		 */

		double numero,suma,cont; //declaramos las variables
		int limite;
		
		 //inicializamos el divisor en 
		suma = 0;
		
		System.out.println("¿Cuantos numeros quieres introducir?");
		limite = keyboard.nextInt();
		
		if (limite < 0 || limite == 0) { //forzamos el valor 0 en el numero para que la media salga coherente si 
										 // alguien introduce numeros no validos
			System.out.println("Numero introducido no valido");
			
		} else {
			for (cont = 0; cont != limite ; cont++) { //el limite representa el valor arbitrario de numero que meteremos, si se equipara	
				 // a el contador el programa se cierra

				System.out.println("Introduce un numero");
				numero = keyboard.nextDouble();

				suma = numero + suma;
		}
			suma = suma / limite;
			System.out.println("La media es: " + suma);
		
			
		}
		
	}

}
