package Ejercicio1;

import java.util.Scanner;

public class Ejer1 {
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Introduce filas");
		int filas=sc.nextInt();
		
		System.out.println("Introduce columnas");
		int columnas=sc.nextInt();
		int m[][]=Libreria1.generarMatriz(filas,columnas);
		Libreria1.mostrarMatriz(m);
		System.out.println("Introduce valor a bscar");
		int valor=sc.nextInt();
		Libreria1.buscarValor(m, valor);
		System.out.println("Suma filas");
		int v[]=Libreria1.sumaPorFilas(m);
		for(int i=0;i<v.length;i++) {
			System.out.print(v[i]+" ");
		}
		System.out.println();
		System.out.println("sumas columnas");
		v=Libreria1.sumaPorColumnas(m);
		for(int i=0;i<v.length;i++) {
			System.out.print(v[i]+" ");
		}
		System.out.println("\n-----------------------------------------------------------------\n");
		
		int m2[][]=Libreria1.generarMatriz(filas,filas);
		Libreria1.mostrarMatriz(m2);
		System.out.println();
		System.out.println("Suma diagonal "+Libreria1.calcularSumaDiagonal(m2));
		System.out.println();
		System.out.println("Suma diagonal Inversa"+Libreria1.calcularSumaDiagonalInversa(m2));
		int []v2=Libreria1.diagonalizarMatriz(m2);
		for(int i=0;i<v2.length;i++) {
			System.out.print(v2[i]+" ");
		}
		Libreria1.mostrarMatriz(m2);
		
		/*
		1 0 0 0 
		1 2 0 0 
		1 2 3 0
		1 2 3 4
		*/
		int m3[][]= {{1,0,0,0},{1,2,0,0},{1,2,3,0},{1,2,3,4}};
		System.out.println("Triangular superior "+Libreria1.matrizTriangularSuperior(m3));
		
		/*
		1 2 3 4
		0 2 3 4 
		0 0 3 4
		0 0 0 4
		*/
		int m4[][]= {{1,2,3,4},{0,2,3,4},{0,0,3,4},{0,0,0,4}};
		System.out.println("Triangular superior "+Libreria1.matrizTriangularInferior(m4));
	}

}
