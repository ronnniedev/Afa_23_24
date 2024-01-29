package ficheros;

import java.util.Scanner;

public class Ejercicio3 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Asignale un tamaño a la matriz que sea de orden impar: ");
		int tam = keyboard.nextInt();
		
		while (tam%2 == 0) {
			System.out.println("ERROR la dimension de la matriz no puede ser par: ");
			tam = keyboard.nextInt();
			
		}
		
		int m [][] = Libreria.generarMatrizInt(tam, tam, 1, 9);
		
		Libreria.mostrarMatriz(m);
		System.out.println("\n----------->Reloj<------------\n");
		Libreria.reloj(m);

	}

}
