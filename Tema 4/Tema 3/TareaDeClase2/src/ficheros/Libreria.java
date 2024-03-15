package ficheros;

import java.util.Scanner;

public class Libreria {
	static Scanner keyboard = new Scanner(System.in);
	/**
	 * Dibujo un cuadro de matriz esteticamente con cada curso y alumno asociado
	 * @param notas : matriz de enteros
	 */
	public static void mostrarMatrizV2(int [][]m) {
		
		System.out.print("|   |");
		
			for (int j = 0; j < m[0].length; j++) {
			
				System.out.print("A" + (j+1) + "|");
			}
			System.out.println();
		
			for (int i = 0; i < m.length; i++) {
			
			if (i == 0) System.out.print("| A |");
			else if (i == 1) System.out.print("| B |");	
			else if (i == 2) System.out.print("| C |");	
			else if (i == 3) System.out.print("| D |");
			
				for (int j = 0; j < m[0].length; j++) {
				if (m[i][j] < 10 && m[i][j] >= 0) System.out.print(""+m[i][j]+ " |");
				else if (m[i][j] < 0) System.out.print(""+m[i][j]+ "|");
				else System.out.print(""+m[i][j]+ "|");
				
				}
				System.out.println();
				
			}
			
		}
	/**
	 * Muestra los 10 de los alumnos en la tabla
	 * @param notas : matriz de enteros
	 */
	public static void notaMasAlta (int [][]notas) {
		
		for (int j = 0; j < notas[0].length; j++) {
			
			for (int i = 0; i < notas.length; i++) {
				if (notas [i][j] == 10) System.out.println("\nEl alumno A" + (j+1) + " saco un 10 en el curso " 
				+ mostrarCurso(i));
			}
		}
		
		
	}
	/**
	 * Transforma en caracter el numero del curso de la tabla
	 * @param i : entero
	 * @return caracter
	 */
	public static char mostrarCurso (int i) {
		
		char alumno ='A';
		
		if (i == 0) alumno = 'A';
		else if (i == 1) alumno = 'B';
		else if (i == 2) alumno = 'C';
		else if (i == 3) alumno = 'D';
		
		return alumno;
		
	}
	/**
	 * Calcula la media de un curso previamente introducido
	 * @param letra : caracter
	 */
	public static void calcularMediaCurso(char letra) {
		
		int [][] notas={{ 3, 2, 7, 8, 6, 4, 5, 9, 5, 1}, //estoy metiendo la matriz en cada funcion para cumplir 				
   				{ 4, 8, 7, 6, 3, 4, 8, 9, 2, 4}, //el enunciado
   				{ 7, 2, 6, 8, 9,10, 0, 5, 4,10},
   				{ 8, 6, 4, 7, 1,10, 5, 3, 4, 8}};
		
		int i = -1;
		double suma = 0;
		
		if (letra == 'A') {
			
			for (int j = 0; j < notas[0].length; j++) {
				i = 0;
				suma = suma + notas[i][j];
				
			}
			
		}else if (letra == 'B') {
			
			for (int j = 0; j < notas[0].length; j++) {
				i = 1;
				suma = suma + notas[i][j];
				
			}
			
		}else if (letra == 'C') {
			
			for (int j = 0; j < notas[0].length; j++) {
				i = 2;
				suma = suma + notas[i][j];
				
			}
			
		}else if (letra == 'D') {
			
			for (int j = 0; j < notas[0].length; j++) {
				i = 3;
				suma = suma + notas[i][j];
				
			}
			
		}
		double media = suma / notas[0].length;
		
		if (i == -1) {
			System.out.println("Caracter introducido no valido");
		}else System.out.printf("\nLa media del curso " + mostrarCurso(i) + " es %.2f \n",media);	
		
	}
	/**
	 * Muestra el numero de aprobados de un curso previamente introducido
	 * @param letra : caracter
	 * @return entero
	 */
	public static int numeroAprobados (char letra) {
		
		int [][] notas={{ 3, 2, 7, 8, 6, 4, 5, 9, 5, 1}, //estoy metiendo la matriz en cada funcion para cumplir 				
   				{ 4, 8, 7, 6, 3, 4, 8, 9, 2, 4}, //el enunciado
   				{ 7, 2, 6, 8, 9,10, 0, 5, 4,10},
   				{ 8, 6, 4, 7, 1,10, 5, 3, 4, 8}};
		
		int i = 0;
		int cont = 0;
		
		if (letra == 'A') i = 0;
		else if (letra == 'B') i = 1;
		else if (letra == 'C') i = 2;
		else if (letra == 'D') i = 3;
		
		for (int j = 0; j < notas[0].length; j++) {
			 if (notas[i][j] >= 5) cont++;
		}
		
		
		
		return cont;
		
		
	}
	/**
	 * Muestra el numero de suspensos de un curso previamente introducido
	 * @param letra : caracter
	 * @return entero
	 */
	public static int numeroSuspensos (char letra) {
		
		int [][] notas={{ 3, 2, 7, 8, 6, 4, 5, 9, 5, 1}, //estoy metiendo la matriz en cada funcion para cumplir 				
   				{ 4, 8, 7, 6, 3, 4, 8, 9, 2, 4}, //el enunciado
   				{ 7, 2, 6, 8, 9,10, 0, 5, 4,10},
   				{ 8, 6, 4, 7, 1,10, 5, 3, 4, 8}};
		
		int i = 0;
		int cont = 0;
		
		if (letra == 'A') i = 0;
		else if (letra == 'B') i = 1;
		else if (letra == 'C') i = 2;
		else if (letra == 'D') i = 3;
		
		for (int j = 0; j < notas[0].length; j++) {
			 if (notas[i][j] < 5) cont++;
		}
		
		
		
		return cont;
		
		
	}
	/**
	 * Muestra el numero de aprobados y suspensos de un curso
	 * @return matriz de enteros
	 */
	public static void mostrarEstadistica(int notas[][]) {
		
		/*for (int j = 0; j < notas[0].length; j++) {
			int cont = 0;
			for (int i = 0; i < notas.length; i++) {
				if (notas[i][j] > 5) cont++;
			}
			System.out.println("El alumno A"+ (j+1) + " tiene " + cont + " aprobados y " + (4-cont) + " suspensos");
		}
		*/
		
		System.out.println("\n ------Aprobados por cada curso-----\n");
		
		for (int i = 0; i < notas.length; i++) {
			int cont = 0;
			for (int j = 0; j < notas[0].length; j++) {
				if (notas[i][j] >= 5) cont++;
			}
			System.out.println("\nEn el curso " + mostrarCurso(i) + " ha habido " + cont + " aprobados y " + (10-cont) 
					+ " suspensos");
		}
		
	}

}
