package ficheros;

import java.util.Scanner;

public class Ejercicio5 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/*Ejercicio 5
		 * Escribir un programa que pida al usuario un número entero y muestre
		 * por pantalla un triángulo rectángulo como el de más abajo, de altura el
		 * número introducido.
		 */
		
		
		int altura,largo,memoria; //altura  para altuta, larfo para largo y memoria guarda largo para subir
		
		altura = 0;
		memoria = 1;
		
		while (altura <= 0) { //comprobador de errores
			
			System.out.println("¿Cuanto asteriscos tiene de altura el triangulo?");
			altura = keyboard.nextInt();
			
			if (altura <= 0) {
				
				System.out.println("Introduce la altura de nuevo en numeros enteros y positivos");
				altura = keyboard.nextInt();
				
			}
			
		}
		
		
		while (altura != 0) { //mientras altura no sea 0, trabajamos
			
			largo = memoria;
			
			while (largo != 0) {
			
				if (largo == 1) { //si es el ultimo 1 saltamos linea
				
					System.out.println(" * ");
				
			}	else {
					System.out.print(" * "); //si no trabajamos normal
			}
					largo--;
			}
			
			
			altura--;
			memoria++;
			
		}System.out.println(" Fin !");

	}

}
