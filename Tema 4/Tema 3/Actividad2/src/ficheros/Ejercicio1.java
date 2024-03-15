package ficheros;

import java.util.Scanner;

public class Ejercicio1 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Filas: ");
		int filas= keyboard.nextInt();
		System.out.println("Columnas: ");
		int columnas=keyboard.nextInt();
		
		int m[][]=new int [filas][columnas];
		
		Libreria.leerMatriz(m);
		Libreria.mostrarMatriz(m);
		Libreria.sumaFilas(m);
		Libreria.sumaColumnas(m);
		
		int retorno [][] = Libreria.intercambiar(m);
		Libreria.mostrarMatriz(retorno);
		Libreria.esSelectiva(m);
		System.out.println(Libreria.tienePuntoSilla(m));
		
	}

}
