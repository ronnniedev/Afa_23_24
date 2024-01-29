package ficheros;

import java.util.Scanner;

public class Ejercicio18 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/* Ejercicio 18 (for)
		 * Escriba un programa que pregunte cuántos números se van a
		 * introducir, pida esos números, y diga al final cuántos han sido pares y
		 * cuántos impares.
		 */
		
		int numPar = 0;
		int numImpar = 0;
		
		System.out.println("Cuantos numeros va a introducir: ");
		int cifras = keyboard.nextInt();
		
		while (cifras < 0) {
			
			System.out.println("ERROR");
			System.out.print("Por favor introduzca un numero entero y positivo: ");
			
		}
		
		for (int cont = 0; cont < cifras ; cont++) {
			
			System.out.println("Escriba un numero: ");
			int num = keyboard.nextInt();
			
			if (num%2 == 0) {
				
				System.out.println(num + " es un numero par");
				numPar++;
				
			}else {
				
				System.out.println(num + " es un numero impar");
				numImpar++;
			}
			
			
		}System.out.println("Se han introducido " + numPar + " numero pares y " + numImpar + " impares");
		System.out.println("FIN");

	}

}
