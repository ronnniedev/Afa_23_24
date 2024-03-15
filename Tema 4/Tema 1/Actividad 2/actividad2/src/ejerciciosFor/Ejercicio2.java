package ejerciciosFor;

import java.util.Scanner;

public class Ejercicio2 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		
		int dividendo,divisor,cociente;
		
		cociente = 0;
		
		System.out.println(" Introduce el dividendo :");
		dividendo = keyboard.nextInt();
		
		System.out.println(" Introduce el divisor :");
		divisor = keyboard.nextInt();
		
	
		for (; dividendo >= divisor ; dividendo = dividendo - divisor) {
			
			System.out.println(dividendo + " = " + dividendo + " - " + divisor);
			cociente++;
			
		}
		System.out.println("El cociente es: " + cociente);
	}

}
