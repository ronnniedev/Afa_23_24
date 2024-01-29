package ficheros;

import java.util.Scanner;

public class Main {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Introduce una letra:");
		char letra = keyboard.next().charAt(0);
		
		boolean valido = Libreria.comprobarLetra(letra);
		
		if (valido) System.out.println("Funciona");
		else System.out.println("Caracter introducido no valido");
		

	}

}
