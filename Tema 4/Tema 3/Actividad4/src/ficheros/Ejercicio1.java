package ficheros;

import java.util.Scanner;

public class Ejercicio1 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		
		//System.out.println("Dime el tamaño del vector :");
		// int tam = keyboard.nextInt();
		
		int v [] = {2,5,8,9,3,4,6,7};
		
		//int v [] = Libreria.generaVectorDouble(v.length,1,9);
		/* Libreria.mostrarVectorDouble(v);
		 * System.out.println("Inserta el valor a introducir:");
		int valor = keyboard.nextInt();
		System.out.println("Inserta la posicion a introducir:");
		int pos = keyboard.nextInt();
		Libreria.insertaValor(v,valor,pos);
		Libreria.mostrarVectorDouble(v);
		 */
		
		Libreria.mostrarVector(v);
		Libreria.insertaValor(v, 11, 3);
		Libreria.mostrarVector(v);
		Libreria.insertaValor(v, 13, -2);
		Libreria.mostrarVector(v);
		Libreria.insertaValor(v, 13, 8);
		Libreria.mostrarVector(v);
		Libreria.insertaValor(v, 12, 5);
		Libreria.mostrarVector(v);
		
	}

}
