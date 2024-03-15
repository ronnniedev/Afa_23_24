package ficheros;

import java.util.Scanner;

public class Ejercicio13 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Escribe el numero a comprobar: ");
		int num = keyboard.nextInt();
		
		boolean primos = Libreria.primos(num);
		
		if (primos) System.out.println("El numero es primo ");
		else System.out.println("El numero no es primo ");

	}

}
