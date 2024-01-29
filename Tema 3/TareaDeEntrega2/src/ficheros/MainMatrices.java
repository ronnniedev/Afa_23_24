package ficheros;

import java.util.Scanner;

public class MainMatrices {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Los lados de la matriz cuadrada: ");
		int dim= keyboard.nextInt();
		int m[][]=new int [dim][dim];
		
		System.out.println("\n---------->leerMatriz<----------\n");
		
		LibreriaMatrices.leerMatriz(m);
		
		System.out.println("\n---------->imprimeMatriz<----------\n");
		
		LibreriaMatrices.imprimeMatriz(m);
		
		
		System.out.println("\n---------->maximo y posMax<----------\n");
		
		for (int j = 0; j <m[0].length;j++) {
			
			System.out.println("El maximo de la fila " + j + " es " + LibreriaMatrices.maximo(m[j]) + " que se"
			+ " encuentra  en la columna " + LibreriaMatrices.posMax(m[j]) + "\n");
			
		}
		
		System.out.println("\n---------->todosDistintos<----------\n");
		
		for (int j = 0; j <m[0].length;j++) {
		
		if (LibreriaMatrices.todosDistintos(m[j])) System.out.println("Todos distintos en fila " + j + "\n");
		else System.out.println("En la fila " + j + " hay numeros equivalentes \n");
		
		}
			System.out.println("\n---------->mccud<----------\n");
		
			if (LibreriaMatrices.mccud(m)) System.out.println("La matriz es mccud");
			else System.out.println("La matriz no es mccud ");
			
	}

}
