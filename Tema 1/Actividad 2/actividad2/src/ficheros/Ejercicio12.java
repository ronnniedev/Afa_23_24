package ficheros;

import java.util.Scanner;

public class Ejercicio12 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/*Actividad 12
		 * Diseña un algoritmo que determine si 5 números pedidos por teclado
		 * son consecutivos o no.
		 */
		
		int numero1,numero2,numero3,numero4,numero5; //declaramos las variables reales
		
		System.out.println("Introduzca el primer numero: "); //introducimos los valores 
		numero1 = keyboard.nextInt();
		
		System.out.println("Introduzca el segundo numero: ");
		numero2 = keyboard.nextInt();
		
		System.out.println("Introduzca el tercer numero: ");
		numero3 = keyboard.nextInt();
		
		System.out.println("Introduzca el cuarto numero: ");
		numero4 = keyboard.nextInt();
		
		System.out.println("Introduzca el quinto numero: ");
		numero5 = keyboard.nextInt();
		
		if (numero1+1==numero2 && numero2+1==numero3 && numero3+1==numero4 && numero4+1==numero5 || 
			numero1-1==numero2 && numero2-1==numero3 && numero3-1==numero4 && numero4-1==numero5) {
			
			System.out.println("Los numeros son consecutivos");	
		}else {
			System.out.println("Los numeros no son consecutivos");
		}

	}

}
