package ficheros;

import java.util.Scanner;

public class Ejercicio5 {
	/*Actividad 5
	 * Se tienen las variables A, B. Escribir las instrucciones necesarias para
	 * intercambiar sus valores sean cuales sean.
	 */
	static Scanner teclado = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		/* Sin variable auxiliar
		 *  A = A + B
		 *  B = A - B
		 *  A = A - B
		 */
		
		
		int a,b;
		int c;
		// leemos el valor de a y b
		System.out.println("Introduce el valor de a :");
		a = teclado.nextInt();
		System.out.println("Introduce el valor de b :");
		b = teclado.nextInt();
		
		c = a;
		a = b;
		b = c;
		
		System.out.println("a = "+a +" b = "+b);
	
	}

}
