package ficheros;

import java.util.Scanner;

public class ejercicio2 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/*Ejercicio 2
		 * Escribir un programa que pida al usuario un número entero positivo y
		 * muestre por pantalla todos los números impares desde 1 hasta ese
		 * número separados por comas.
		 */
		
		int num,cont; // declaro el numero
		boolean primero;
		
		num = 0;
		primero = false; //para distinguir entre el primero y los demas y establecer las comas
		
		while (num <= 0) { //introduce un numero
			
			System.out.println("Introduce un numero: ");
			num = keyboard.nextInt();
			
		}
		cont = 0;
		
		System.out.println("Los numeros impares de este numero son: \n");
		
		while (cont != num) { //cuando cont se igual con numero , acaba while, asi hacemos que la cuenta sea ascendente
			
			
			if (cont%2 != 0 && primero == false) { //si el resto no es 0 es impar y si es el primero lo escribimos asi
				
				primero = true;
				System.out.print(cont); // lo escribimos
				
			}else if (cont%2 != 0) {
				System.out.print("," + cont);
			}
			
			cont++;
			
			
		}System.out.println("\nFIN!!!");

	}

}
