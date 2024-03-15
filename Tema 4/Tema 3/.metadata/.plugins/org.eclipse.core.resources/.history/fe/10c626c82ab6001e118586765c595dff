package ficheros;

import java.util.Scanner;

public class barcos {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		int m [][] = Libreria.generarMatrizInt(7, 7, 0, 0);
		
		Libreria.mostrarMatrizV2(m);

		System.out.println("Escrtibe la coordenada i donde meteras el barco: ");
		int i = keyboard.nextInt();
		
		System.out.println("Escribe la j del barco");
		int j = keyboard.nextInt();
		
		Libreria.insertarBarco(m,i,j,4);
		Libreria.mostrarMatrizV2(m);
	}

}
