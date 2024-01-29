package ficheros;

import java.util.Scanner;

public class Ejercicio6 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/*Ejercicio 6
		 * Escribir un programa que pida al usuario un número entero y muestre
		 * por pantalla un triángulo rectángulo como el de más abajo. 
		 */
		
		int altura,largo,memoria,numPantalla,memoriaPantalla; //altura  para altuta, larfo para largo y memoria guarda 
		// largo para subir
		altura = 0;
		memoria = 1;
		memoriaPantalla = 1;
		numPantalla=1;
		
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
		    numPantalla = memoriaPantalla;
			
			while (largo != 0) {
			
			if (largo == 1) { //si es el ultimo 1 saltamos linea
				
				System.out.println(" " + numPantalla + " ");
				numPantalla = numPantalla - 2;
				
			}else {
				System.out.print(" " + numPantalla + " "); //si no trabajamos normal
				numPantalla = numPantalla - 2;
			}
				largo--;
			}
			
			
			altura--;
			memoria++; //la memoria del largo aumenta
			memoriaPantalla = memoriaPantalla + 2; // la memoria de pantalla aumenta
			
		}System.out.println(" Fin !");

	}

}
