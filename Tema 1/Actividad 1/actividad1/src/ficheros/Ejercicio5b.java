package ficheros;

import java.util.Scanner;

public class Ejercicio5b {
	static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) {
		int a,b;
		
		// leemos el valor de a y b
		
		System.out.println("Introduce el valor de a :");
		a = teclado.nextInt();
		System.out.println("Introduce el valor de b :");
		b = teclado.nextInt();
		
		System.out.println("a = "+a +" b = "+b);
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("a = "+a +" b = "+b);
	}

}
