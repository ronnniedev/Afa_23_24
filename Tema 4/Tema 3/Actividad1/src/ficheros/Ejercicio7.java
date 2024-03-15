package ficheros;

import java.util.Scanner;

public class Ejercicio7 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/*
		 * Actividad 7 
		 * Dado un vector de números reales, escriba un método que ordene los 
		 * elementos del vector de tal forma que los números pares aparezcan 
		 * antes que los números impares. Además, los números pares deberán 
		 * estar ordenados de forma ascendente, mientras que los números 
		 * impares deberán estar ordenados de forma descendente. Esto es, el 
		 * vector {1,2,3,4,5,6} quedará como {2,4,6,5,3,1}.
		 */
		
		System.out.println("Dime el tamaño del vector:");
		
		int tam = keyboard.nextInt();
		
		float v [] = Libreria.leerVectorFloat(tam);
		Libreria.mostrarVector(v);
		System.out.println();
		Libreria.ordenaPares(v);
		Libreria.mostrarVector(v);
		
	}

}
