package ficheros;

import java.util.Scanner;

public class ejercicio30b {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/* Actividad 30
		 * Diseñar el algoritmo que indique el mayor de una serie de números que
		 * introducimos por teclado. Crea dos versiones: en la primera la
		 * cantidad está definida en la segunda será indefinida.
		 */
		
		int numero1,numero2,cont; //declaramos variables
		
		
		
		System.out.println("¿Cuantos numeros quieres introducir?");
		cont = keyboard.nextInt();
		cont = cont - 2;
		
		System.out.println("Introduce un numero: ");
		numero1 = keyboard.nextInt();
		
		System.out.println("Introduce un numero: ");
		numero2 = keyboard.nextInt();
		
		while (numero1 !=0 && numero2 !=0) {
			
			if (numero1 == 0  || numero2 ==0) {//para que no tenga en cuenta el 0
				
			}else if (numero1 > numero2) { //si numero1 es mayor que numero2 borrarmos numero1
				System.out.println("Introduce un numero: ");
				numero2 = keyboard.nextInt();
				
			}else if (numero2 > numero1) { //si numero2 es mayor que numero1 borrarmos numero1
				System.out.println("Introduce un numero: ");
				numero1 = keyboard.nextInt();
				
			}else { // un caso donde sean iguales, borra 1 de manera arbitraria
				System.out.println("Introduce un numero: ");
				numero1= keyboard.nextInt();
				
			}
			
			
		}
		if (numero1 > numero2) { //escribimos el numero mayor
			System.out.println("El mayor numero ha sido: " + numero1);
			
		}else if (numero2 > numero1) {
			System.out.println("El mayor numero ha sido: " + numero2);
			
		}
	}

}
