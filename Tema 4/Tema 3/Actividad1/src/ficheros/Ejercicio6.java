package ficheros;

import java.util.Scanner;

public class Ejercicio6 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/*
		 * Actividad 6 
		 * Implementar una función que realice la búsqueda secuencial de un 
		 * valor sobre un vector de reales que recibe como parámetro. La 
		 * cabecera de la función int búsqueda(float v[], float value)
		 */

		System.out.println("Dime el tamaño del vector:");
		
		int tam = keyboard.nextInt();
		
		float v [] = Libreria.leerVectorFloat(tam);
		Libreria.mostrarVector(v);
		
		System.out.println("¿Que valor quieres buscar?");
		float value = keyboard.nextFloat();
		
		if (Libreria.busqueda(v,value) == -1) System.out.println("No existe ese valor en este vector");
		else System.out.println("El valor "+ value + " se encuentra en la posicion " + Libreria.busqueda(v,value));
		
		
		
		
	}

}
