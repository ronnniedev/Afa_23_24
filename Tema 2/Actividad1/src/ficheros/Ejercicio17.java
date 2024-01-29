package ficheros;

import java.util.Scanner;

public class Ejercicio17 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/* Actividad 17
		 * Realiza una función que resuelva la ecuación de segundo grado. El
		 * programa pedirá por teclado los tres coeficientes que se envían a la
		 * función. Dicha función mostrara los posibles soluciones:
		 * • No tiene solución
		 * • Una solución y su valor
		 * • Dos soluciones y sus valores.
		 */
		
		System.out.println("Sabiendo que a^2+bx+c = 0");
		
		System.out.println("Escribe el valor de a :");
		double a = keyboard.nextInt();
		
		System.out.println("Escribe el valor de b: ");
		double b = keyboard.nextInt();
		
		System.out.println("Escribe el valor de c: ");
		double c = keyboard.nextInt();
		
		Libreria.ecuacionSegundoGrado(a,b,c);
		

	}

}
