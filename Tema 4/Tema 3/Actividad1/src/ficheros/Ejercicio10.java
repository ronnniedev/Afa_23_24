package ficheros;

import java.util.Scanner;

public class Ejercicio10 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/*
		 * Actividad 10 
		 * Implementar una función que retorne el numero de veces que aparece 
		 * un valor dentro del vector. 
		 * int buscarValor(int v[], int valor)
		 * Generar el vector con elementos aleatorios entre 1 y 10
		 */
		
		System.out.println("Introduce el tamaño del vector:" );
		int tam = keyboard.nextInt();
		
		int []v = Libreria.generaVectorInt(tam,1,10);
		
		Libreria.mostrarVector(v);
		System.out.println("Dime el valor que quieres buscar en este vector: ");
		int valor = keyboard.nextInt();
		
		System.out.println("El valor "+ valor + " se repite en el vector "+ Libreria.buscarValor(v,valor) + " veces");
		
		
		
	}

}
