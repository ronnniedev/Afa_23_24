package ficheros;

import java.util.Scanner;

public class Ejercicio2 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.print("Escriba un numero: ");
		double num = keyboard.nextDouble();
		
		System.out.print("Escriba un numero superior a " + num + " :");
		double numDos = keyboard.nextDouble ();
		
		while (num < numDos) {
			
			System.out.print("Escriba otro numero superior a " + num + " :");
			numDos = keyboard.nextDouble();
			
		}
		System.out.println(numDos + " no es mayor que " + num);
		
		

	}

}
