package ficheros;

import java.util.Scanner;

public class Ejercicio5 {
	/*Actividad 5
	 * Determinar si un número leído por teclado es positivo o negativo
	 */
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		double numero;
		
		System.out.println("Escribe numero: ");
		numero = keyboard.nextInt();
		
		if (numero >= 0) {
			System.out.println("Tu numero es positivo");
			
		}else  {
			System.out.println("Tu numero es negativo"); // else if se añade para meter varios condicionantes
			
		}
			}

}
