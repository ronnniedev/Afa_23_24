package ficheros;

import java.util.Scanner;

public class Ejercicio6p {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		
		int numFilas;
		
		System.out.println("Introduce numero de filas");
		
		numFilas=keyboard.nextInt();
		
		for (int fila = 1; fila <=numFilas;fila++) {
			int primerValor = (fila*2)-1;
			
			//int primerValor = fila+(fila-1)
			
			for (int valor=primerValor;valor>=1;valor-=2) {
				System.out.print(valor + " ");
				
			}
			System.out.println();
					
			
		}
		
		

	}

}
