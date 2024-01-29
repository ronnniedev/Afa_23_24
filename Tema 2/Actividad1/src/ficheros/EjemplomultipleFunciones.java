package ficheros;

import java.util.Scanner;

public class EjemplomultipleFunciones {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		
		Libreria.funcion(2);
		Libreria.funcion(2,4);
		Libreria.funcion(5.2);
		Libreria.funcion(true);
		
		System.out.println("Introduce un numero: ");
		int num = keyboard.nextInt();
		
		Libreria.siguientePrimo(num);

	}

}
