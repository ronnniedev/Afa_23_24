package ficheros;

import java.util.Scanner;

public class Ejercicio2 {
	static Scanner keyboard=new Scanner(System.in);
	public static void main(String[] args) {
		/*
		 * Implemente un método llamado secuencia que realice la búsqueda de
		 * la secuencia en orden creciente más larga dentro de un vector de
		 * enteros. El método ha de mostrar tanto la posición de la primera
		 * componente de la secuencia como el tamaño de la misma. 
		 */

		System.out.println("Dime el tamaño del vector: ");
		int tam = keyboard.nextInt();
		
		int v[] = new int [tam];
				
		Libreria.leerVector(v);
		Libreria.secuencia(v);
	}

}
