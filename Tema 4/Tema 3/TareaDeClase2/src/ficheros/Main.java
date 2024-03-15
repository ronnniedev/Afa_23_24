package ficheros;

import java.util.Scanner;

public class Main {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		int [][] notas={{ 3, 2, 7, 8, 6, 4, 5, 9, 5, 1},
				   				{ 4, 8, 7, 6, 3, 4, 8, 9, 2, 4},
				   				{ 7, 2, 6, 8, 9,10, 0, 5, 4,10},
				   				{ 8, 6, 4, 7, 1,10, 5, 3, 4, 8}};
		Libreria.mostrarMatrizV2(notas);
		Libreria.notaMasAlta(notas);
		
		System.out.println("Escribe en mayuscula la letra del curso del que quieres sacar la media: ");
		char curso = keyboard.next().charAt(0);
		
		Libreria.calcularMediaCurso(curso);
		
		System.out.println("Escribe en mayuscula la letra del curso del que quieres sacar el numero de aprobados: ");
		curso = keyboard.next().charAt(0);
	
		if (Libreria.numeroAprobados(curso) == 0) {
			System.out.println("Caracter introducido no valido");
		}
		else System.out.println(" El numero de aprobados del curso " + curso + " es " + Libreria.numeroAprobados(curso));
			
		System.out.println("Escribe en mayuscula la letra del curso del que quieres sacar el numero de suspensos: ");
		curso = keyboard.next().charAt(0);
	
		if (Libreria.numeroSuspensos(curso) == 0) {
			System.out.println("Caracter introducido no valido");
		}
		else System.out.println(" El numero de suspensos del curso " + curso + " es " + Libreria.numeroSuspensos(curso));
		
		Libreria.mostrarEstadistica(notas);
		

	}

}
