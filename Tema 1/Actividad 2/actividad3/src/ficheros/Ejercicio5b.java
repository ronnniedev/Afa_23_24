package ficheros;

import java.util.Scanner;

public class Ejercicio5b {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/*Ejercicio 5
		 * Escribir un programa que pida al usuario un número entero y muestre
		 * por pantalla un triángulo rectángulo como el de más abajo, de altura el
		 * número introducido.
		 */
		int altura,largo,memoria; //altura  para altuta, larfo para largo y memoria guarda largo para subir
		
		altura = 0;
		
		while (altura <= 0) { //comprobador de errores
			
			System.out.println("¿Cuanto asteriscos tiene de altura el triangulo?");
			altura = keyboard.nextInt();
			
			if (altura <= 0) {
				
				System.out.println("Introduce la altura de nuevo en numeros enteros y positivos");
				altura = keyboard.nextInt();
				
			}
			
		}
		
		memoria = altura; // le decimos que la altura equivale a la memoria
		while (altura != 0) { //mientras altura no sea 0, trabajamos
			
			largo = memoria; //al ser largo memoria los valores comienzan al reves
			
			while (largo != 0) {
			
			if (largo == 1) { //si es el ultimo 1 saltamos linea
				
				System.out.println(" * ");
				
			}else {
				System.out.print(" * "); //si no trabajamos normal
			}
				largo--; 
			}
			
			
			altura--; //le restamos a altura 1 hasta 
			memoria--; //le restamos a memoria 1
			
		}System.out.println(" Fin !");

	}

}
