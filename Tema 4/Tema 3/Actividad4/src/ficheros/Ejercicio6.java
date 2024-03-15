package ficheros;

import java.util.Scanner;

public class Ejercicio6 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Introduce el numero de alumnos:");
		int filas = keyboard.nextInt();
		
		System.out.println("Introduce el numero de asignaturas:");
		int columnas = keyboard.nextInt();
		
		int m [][] = Libreria.generarMatrizInt(filas, columnas, 0, 10);
		
		Libreria.mostrarMatriz(m);
		Libreria.mostrarMatrizV2(m);
		Libreria.mostrarPromedios(m);
		Libreria.mostrarMenor(m);
		
		
		
		System.out.println("Di la asignatura cuyo alumno quieras saber que tiene mayor nota: ");
		int asignatura = keyboard.nextInt();
		
		while (asignatura < 0 || asignatura > (m[0].length-1)) {
			
			System.out.println("---Escriba un numero dentro de rango---");
			System.out.println("Di la asignatura cuyo alumno quieras saber que tiene mayor nota: ");
			asignatura = keyboard.nextInt();
			
		}
		
		Libreria.mayorNota(m,asignatura);
		
		System.out.println("Di la asignatura cuyo alumno quieras saber la media: ");
		asignatura = keyboard.nextInt();
		
		while (asignatura < 0 || asignatura > (m[0].length-1)) {
			
			System.out.println("---Escriba un numero dentro de rango---");
			System.out.println("Di la asignatura cuyo alumno quieras saber la media: ");
			asignatura = keyboard.nextInt();
			
		}
		
		Libreria.mediaColumna(m,asignatura);
		
		
 	}

}
