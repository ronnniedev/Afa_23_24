package ficheros;

import java.util.Scanner;

public class Ejercicio1 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Introduce las filas:");
		int filas = keyboard.nextInt();
		
		System.out.println("Introduce las columnas:");
		int columnas = keyboard.nextInt();
		
		int m [][] = Libreria.generarMatrizInt(filas, columnas, 0, 10);
		Libreria.mostrarMatrizV2(m);
		
		System.out.println("Que valor quieres buscar:");
		int valor = keyboard.nextInt();
		
		Libreria.buscarValor(m, valor);

		int v [] = Libreria.sumaPorFilas(m);
		
		for (int i = 0; i < v.length; i++) {
			System.out.println("La fila ["+i+"] suma un total de " + v[i] );
		}
		
		v =Libreria.sumaPorColumnas(m);
		
		for (int i = 0; i < v.length; i++) {
			System.out.println("La columna ["+i+"] suma un total de " + v[i] );
		}
		
		System.out.println("La suma de la diagonal es " + Libreria.calcularSumaDiagonal(m));
		System.out.println("La suma de la diagonal es " + Libreria.calcularSumaDiagonalInversa(m));
		
		int v2 [] = Libreria.diagonalizarMatriz(m);
		
		System.out.print("Los valores restados son");
		for (int i = 0; i < v2.length; i++) {
			
			System.out.print(" " + v2[i]);
		}
		System.out.println();
		Libreria.mostrarMatrizV2(m);
		
		int m3[][]= {{1,0,0,0},{1,2,0,0},{1,2,3,0},{1,2,3,4}};
		System.out.println("Triangular superior "+Libreria.matrizTriangularSuperior(m3));
		int m4[][]= {{1,2,3,4},{0,2,3,4},{0,0,3,4},{0,0,0,4}};
		System.out.println("Triangular inferior "+Libreria.matrizTriangularInferior(m4));
		
		int m2[][] = Libreria.calcularTraspuesta(m);
		
		System.out.println();
		Libreria.mostrarMatrizV2(m);
		System.out.println();
		Libreria.mostrarMatrizV2(m2);
		
		System.out.println("\nIntroduce las filas:");
		filas = keyboard.nextInt();
		
		System.out.println("Introduce las columnas:");
		columnas = keyboard.nextInt();
		
		int a [][] = Libreria.generarMatrizInt(filas, columnas, 0, 10);
		int b [][] = Libreria.generarMatrizInt(filas, columnas, 0, 10);
		int c [][] = Libreria.sumaMatrices(a, b);
		
		System.out.println("---Matriz A---\n");
		Libreria.mostrarMatrizV2(a);
		System.out.println("---Matriz B---\n");
		Libreria.mostrarMatrizV2(b);
		System.out.println("---Matriz SUMA---\n");
		Libreria.mostrarMatrizV2(c);
		
		
	}


	
}
