package ficheros;

import java.util.Scanner;

public class Ejercicio2 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		
		int fila,cont,num;
		
		fila = 0;
		cont = 0;
		
		System.out.println("Cuantos numeros tiene: ");
		num = keyboard.nextInt();
		
		while (fila < num) {
			
			while (cont <= fila) {
				cont++;
				System.out.print(cont + " ");
				
			}
			System.out.println();
			
			cont = 0;
			fila++;
			
		} fila--;
		
			while (fila != 0) {
				
				cont = 0;
				
				while (cont != fila) {
					cont++;
					System.out.print(cont + " ");
						
				}
				System.out.println();
				fila--;
			}

	}

}
